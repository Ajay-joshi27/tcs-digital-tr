package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class InserAtAnyIndex {
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
System.out.println("which index you want to add");
    int index=sc.nextInt();
    System.out.println("what is the element you want to add");
    int element=sc.nextInt();
    Stack<Integer> st=new Stack<>();
    st.push(1);
     st.push(2);
      st.push(3);
       st.push(4);

        Stack<Integer> temp=new Stack<>();
        while (st.size()>index) 
        {
            temp.push(st.pop());
        }
            st.push(element);
              while (!temp.isEmpty()) 
        {
            st.push(temp.pop());
        }
            System.out.println(st);
}
}
