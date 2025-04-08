package ArrayinDSA ;

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();

        }
        // Now finding the sum of the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
        System.out.println("The sum of the elements is : " + sum);

    }

}