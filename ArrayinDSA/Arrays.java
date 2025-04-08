// the collection of the variable is called Array
package ArrayinDSA;

import java.util.Scanner;

//public class Arrays{
//    public static void main(String[] args) {
//        int[] arr = {66,6888,84,86};// Declaration of an Array
//        System.out.println(arr[0]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        // Synatax and Declaration of an Array
//
//int [ ] arr=new int [7]  -------it have created the seven memory location for the array
//
//

//


    //    }
  //  }
// --------Printing the output and Taking input
//
//      public class Arrays {
//          public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);
//              int[] arr = new int[10];
//              System.out.println("Enter the elemmets of an array");
//
//              // Input loop
//
//              for (int i = 0; i < 10; i++){
//                  System.out.println("Enter the element "+(i+1)+":");
//                  arr[i] = sc.nextInt();
//
//              }
//              // Output Loop
//              System.out.println("Enter the element of an array");
//              for (int i = 0; i < 10; i++){
//                  System.out.println("Enter the element "+(i+1)+":"+arr[i]);
//              }
//          }
//      }

// Given an array of marks of students, if the marks of any student is less than 35 print
//its roll number [roll number here refers the index of  the array]
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter  the marks of the  student ");

        // Taking the marks input from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the marks of the  student ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Print the marks of the student whose makrks is less than or equal to 35 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println(arr[i]);
            }
        }
    }
}