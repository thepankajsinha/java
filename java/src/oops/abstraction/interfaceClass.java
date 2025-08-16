package oops.abstraction;

interface Vehical {
    void start();  // abstract method
}

class Car implements Vehical {
    public void start() {
        System.out.println("Car is starting..");
    }
}

public class interfaceClass {
    public static void main(String[] args) {
        Car c = new Car();

        c.start(); //Car is starting..
    }
}
