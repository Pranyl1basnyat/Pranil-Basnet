package ArrayinDSA;

import java.util.Scanner;

public class GreatestofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking the input from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element");
            arr[i] = sc.nextInt();

        }
        // Printing the greatest number among the 10 numbers
        int G=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>G){
                G=arr[i];
            }
            System.out.println("Greatest of " + i + " elements is " + G);
        }
    }
}