package oops.inheritance.hierarchical;

class Parent {
    void show() {
        System.out.println("I am parent class.");
    }
}

class firstChild extends Parent {
    void display() {
        System.out.println("I am first child class.");
    }
}

class secondChild extends Parent{
    void display(){
        System.out.println("I am second child class.");
    }
}

public class hierarchical {
    public static void main(String[] args) {

        firstChild fc = new firstChild();
        fc.show();  //I am parent class.
        fc.display(); // I am first child class.

        secondChild sc = new secondChild();
        sc.show(); // I am parent class.
        sc.display(); // I am second child class.


    }
}
