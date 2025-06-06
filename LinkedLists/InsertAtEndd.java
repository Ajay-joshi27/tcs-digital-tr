class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node nextptr;

        while (current != null) {
            nextptr = current.next;
            current.next = prev;
            prev = current;
            current = nextptr;
        }

        head = prev;
    }
}

public class InsertAtEndd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.printList(); // Output: 10 -> 20 -> 30 -> null
        list.reverse();
        list.printList(); // Output: 30 -> 20 -> 10 -> null
    }
}
