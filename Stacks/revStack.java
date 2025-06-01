package Stacks;

import java.util.Stack;

public class revStack {
public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
     st.push(2);
      st.push(3);
       st.push(4);
System.out.println(st.size());
       System.out.println(st);
       Stack<Integer> rev=new Stack<>();
       while (st.size()!=0) {
       int element= st.pop();
        rev.push(element);
       }
       System.out.println(rev);
}
}
