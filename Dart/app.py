from flask import Flask, render_template, request, redirect, url_for, flash, session
from database import Database
from datetime import datetime

app = Flask(__name__)
app.secret_key = 'your_secret_key'  # Change this to a secure secret key
db = Database()

@app.route('/')
def index():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    return redirect(url_for('dashboard'))

@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        user = db.verify_user(username, password)
        if user:
            session['user_id'] = user['id']
            session['role'] = user['role']
            return redirect(url_for('dashboard'))
        flash('Invalid credentials')
    return render_template('login.html')

@app.route('/dashboard')
def dashboard():
    if 'user_id' not in session:
        return redirect(url_for('login'))
    
    if session['role'] == 'teacher':
        classes = db.get_teacher_classes(session['user_id'])
        return render_template('dashboard.html', classes=classes)
    else:
        attendance = db.get_student_attendance(session['user_id'])
        return render_template('dashboard.html', attendance=attendance)

@app.route('/take_attendance/<class_id>', methods=['GET', 'POST'])
def take_attendance(class_id):
    if 'user_id' not in session or session['role'] != 'teacher':
        return redirect(url_for('login'))
    
    if request.method == 'POST':
        date = datetime.now().date()
        students = request.form.getlist('present')
        db.save_attendance(class_id, date, students)
        flash('Attendance saved successfully')
        return redirect(url_for('dashboard'))
    
    students = db.get_class_students(class_id)
    return render_template('take_attendance.html', students=students, class_id=class_id)

if __name__ == '__main__':
    app.run(debug=True) 