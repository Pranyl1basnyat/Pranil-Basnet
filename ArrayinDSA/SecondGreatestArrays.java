//package ArrayinDSA;
//
//import java.util.Scanner;
//
//public class SecondGreatestArrays {
//    public static void main(String[] args) {
//
//       int [ ] arr = {2,3,33,44,45,33,32,11,6666,55555,44444,5334335,443434443};
//       int max =Integer.MIN_VALUE;
//       for (int i = 0; i < arr.length; i++) {
//           if (arr[i] > max) {
//               max = arr[i];
//           }
//       }
//       int smax=Integer.MIN_VALUE;
//       for (int i = 0; i < arr.length; i++) {
//           if (arr[i] > smax &&arr[i]!=max) {
//               smax = arr[i];
//           }
//       }
//       System.out.println("The max value is " + max);
//       System.out.println("The smax value is " + smax);
//    }
//
//}
// Explanation of above code:






// Count the number of the eleements in given array greater than given number x
package ArrayinDSA;
public class SecondGreatestArrays {
    public static void main(String[] args) {
        int[] arr = { 11,12,13,14,15,16,17,18,19,20 };
        int x=13;
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                c=c+1;
            }


        }
        System.out.println("the total number of element above" +x+"is "+c);
    }
    }
