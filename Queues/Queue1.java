package Queues;

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         System.out.println(q);
         Stack<Integer> s=new Stack<>();
       while (!q.isEmpty()) {
        s.push(q.poll());
       }
       System.out.println(s);

       while (!s.isEmpty()) {
        q.offer(s.pop());
       }
        System.out.println("queue reversed");
        System.out.println(q);
    }

}
