package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueusingArray {
    public static void main(String[] args) {
         Queue<Integer> q=new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         System.out.println(q);
            int size=q.size();
           int arr[]=new int[size]; 
           for (int i = 0; i <arr.length; i++) {
                arr[i]+=q.poll();
           }
           for(int data:arr)
           {
            System.out.print(data+" ");
           }
    }
}
