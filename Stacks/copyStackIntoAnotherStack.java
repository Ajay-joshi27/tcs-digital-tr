package Stacks;

import java.util.Stack;

public class copyStackIntoAnotherStack {
        public static void main(String[] args) 
        {
            Stack<Integer> st=new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
             Stack<Integer> temp=new Stack<>();
             while (!st.isEmpty()) {
                int  element=st.pop();
                temp.push(element);
             }
              Stack<Integer> cp=new Stack<>();
              while (!temp.isEmpty()) {
                cp.push(temp.pop());
              }
              System.out.println(cp);
        }
}
