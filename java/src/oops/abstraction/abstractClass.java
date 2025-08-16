package oops.abstraction;

abstract class Animal {
    // abstract method (no body)
    abstract void sound();

    // concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}


public class abstractClass {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();  // Bark
        obj.sleep();  // Sleeping...
    }
}
