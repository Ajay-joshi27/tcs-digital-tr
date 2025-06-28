public class IAE {
 Node head;
Node tail;

 void insertAtEndd(int data){
    Node temp=new Node(data);
    if (head==null) {
        head=tail=temp;
    }
    else{
        tail.next=temp;
        tail=temp;

    }
                            }
    void display()
    {
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        IAE a=new IAE();
        a.insertAtEndd(10);
        a.display();
        
    }
}
