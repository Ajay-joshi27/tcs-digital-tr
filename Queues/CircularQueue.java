package Queues;

public class CircularQueue {

    public static class Queuue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
        }
    }

    public int remove(){
        
    }

    public static void main(String[] args) {

    }
}
