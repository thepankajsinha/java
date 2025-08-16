package linkedlist;

public class basicsOfLL {
    //Node is a user defined data type
    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        //create 5 nodes
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);

        //link all nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //display all nodes
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
//5 10 15 20 25
