//Java Methods:
//              Block of the code preparing some action whic run only it is called
// called function
//
// Importance of Method in Java
// Write once ,reuse many time
// Time save
// Duplicate Code reduce
//  --------------------- Types of Methods---------------------
// user-defined Methods
//Standard libary method



// How to declare the method
// public class main {
// public class int sum(int a, int b){
// Code to be excuted


//}

// -------------------- returnType functionName(type arg1,type arg2  ){
//      Operation          }
//package FunctioninJava;
//
//import java.util.Scanner;
//
//public class basicMethod {
//    public static void printMyName(String name) {
//        System.out.println(name);
//        return;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        printMyName(name);
//
//    }
//}


// ---------------- Make the function to add 2 numbers and return the sum------------
//package functioninJava;
//
//import java.util.Scanner;
//
//public class basicMethod {
//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//        return;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sum(a, b);
//    }
//}
//


// --------------Write the function to find the factorial of the number-----------
package FunctioninJava;

import java.util.Scanner;

public class basicMethod {
    public static void fact(int n) {
        int fact=1;
       for (int i=n; i>1; i--){
           fact=fact*i;


       }
        System.out.println(fact);
        return;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        fact(n);

    }
}
