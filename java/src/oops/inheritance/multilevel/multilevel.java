package oops.inheritance.multilevel;

class Parent {
    void show() {
        System.out.println("I am parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("I am child class.");
    }
}

class GrandChild extends Child{
    void print(){
        System.out.println("I am grand child class.");
    }
}

public class multilevel {
    public static void main(String[] args) {
        GrandChild c = new GrandChild();

        c.show(); //I am parent class.
        c.display(); // I am child class.
        c.print(); // I am grand child class.
    }
}

