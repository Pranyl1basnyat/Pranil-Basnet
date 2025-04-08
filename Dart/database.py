import sqlite3
from werkzeug.security import generate_password_hash, check_password_hash

class Database:
    def __init__(self):
        self.conn = sqlite3.connect('attendance.db')
        self.create_tables()

    def create_tables(self):
        cursor = self.conn.cursor()
        
        # Create users table
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY,
                username TEXT UNIQUE,
                password TEXT,
                role TEXT
            )
        ''')
        
        # Create classes table
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS classes (
                id INTEGER PRIMARY KEY,
                name TEXT,
                teacher_id INTEGER,
                FOREIGN KEY (teacher_id) REFERENCES users (id)
            )
        ''')
        
        # Create attendance table
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS attendance (
                id INTEGER PRIMARY KEY,
                class_id INTEGER,
                student_id INTEGER,
                date DATE,
                present BOOLEAN,
                FOREIGN KEY (class_id) REFERENCES classes (id),
                FOREIGN KEY (student_id) REFERENCES users (id)
            )
        ''')
        
        self.conn.commit()

    def verify_user(self, username, password):
        cursor = self.conn.cursor()
        cursor.execute('SELECT * FROM users WHERE username = ?', (username,))
        user = cursor.fetchone()
        if user and check_password_hash(user[2], password):
            return {'id': user[0], 'role': user[3]}
        return None

    def get_teacher_classes(self, teacher_id):
        cursor = self.conn.cursor()
        cursor.execute('SELECT * FROM classes WHERE teacher_id = ?', (teacher_id,))
        return cursor.fetchall()

    def get_student_attendance(self, student_id):
        cursor = self.conn.cursor()
        cursor.execute('''
            SELECT c.name, a.date, a.present 
            FROM attendance a 
            JOIN classes c ON a.class_id = c.id 
            WHERE a.student_id = ?
        ''', (student_id,))
        return cursor.fetchall()

    def get_class_students(self, class_id):
        cursor = self.conn.cursor()
        cursor.execute('''
            SELECT u.id, u.username 
            FROM users u 
            JOIN class_students cs ON u.id = cs.student_id 
            WHERE cs.class_id = ? AND u.role = 'student'
        ''', (class_id,))
        return cursor.fetchall()

    def save_attendance(self, class_id, date, present_students):
        cursor = self.conn.cursor()
        students = self.get_class_students(class_id)
        
        for student in students:
            present = student[0] in present_students
            cursor.execute('''
                INSERT INTO attendance (class_id, student_id, date, present)
                VALUES (?, ?, ?, ?)
            ''', (class_id, student[0], date, present))
        
        self.conn.commit() 