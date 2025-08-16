package linkedlist;

public class linkedListClass {
    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;

        void insetAtEnd(int val){
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
            }else {
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        void insetAtstart(int val){
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
            }else {
                newNode.next = head;
                head = newNode;
            }
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insetAtEnd(5);
        ll.insetAtEnd(10);
        ll.insetAtEnd(15);

        ll.display();

        ll.insetAtstart(20);
        ll.insetAtstart(30);

        ll.display();
    }
}
