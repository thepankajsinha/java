package collFramework;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(10);
        ll.add(15);

        for(int i : ll){
            System.out.println(i);
        }

        ll.add(2,100);

        ll.removeFirst();

        for(int i : ll){
            System.out.println(i);
        }

    }
}
