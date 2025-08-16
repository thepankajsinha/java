package oops.inheritance.single;

//One child class inherits from one parent class.

//parent class/superClass/base class
class Parent {
    void show() {
        System.out.println("I am parent class.");
    }
}

//child class/subClass/derived class
class Child extends Parent {
    void display() {
        System.out.println("I am child class.");
    }
}

public class single {
    public static void main(String[] args) {
        Child c = new Child();

        c.show(); //I am parent class.
        c.display(); // I am child class.
    }
}
