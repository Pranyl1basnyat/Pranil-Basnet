package StackinDSA;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackinSameorder {
    public static void main(String[] args) {
        System.out.println("Enter the number of the elements you want to push in stack");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        Stack<Integer> st=new Stack<Integer>();
        System.out.println("Enter the elements of the stack");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack st1=new Stack<Integer>();
        while(st.size()>0){
            int x=st.peek();
            st1.push(x);
            st.pop();

            Stack st2=new Stack<Integer>();
            while(st.size()>0){}
        }
        System.out.println(st1);
    }
}