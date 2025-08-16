package collFramework;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);

//        al.remove();

        al.removeLast();

        al.removeFirst();

//        for(int i =0; i< al.size(); i++){
//            System.out.print(al.get(i) + " ");
//        }

        for(int i : al){
            System.out.println(i);
        }

    }
}
