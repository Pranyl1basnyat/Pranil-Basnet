package StackinDSA;

import java.util.Stack;

public class BasicsofStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        // Inserting the element in the stack using the push operation
        // Synatax in the in-built function
        // Stack<Data type> st= new Stack<>( );

        System.out.println(st.peek());
        System.out.println(st);
        st.pop();// meaning of the pop is to remove the topmost element
        System.out.println(st);
        // Printing the size of the stack
        System.out.println(st.size());
        //----------- To print the first element in the Stack---------------------
        while(st.size()>1){

            st.pop();
        }
        System.out.println(st.peek());
    }

}