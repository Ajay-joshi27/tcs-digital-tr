package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class evenindexqueue {
public static void main(String[] args) {
     Queue<Integer> q=new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         System.out.println(q);
            int size=q.size();
     for (int i = 0; i < size; i++) {
            int element=q.poll();
            if (element%2==0) 
            {
                q.offer(element);
            }            
        }
        System.out.println(q);
     
        
}
}
