package oops.polymorphism;

class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting..");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting..");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        obj.start(); //Car is starting..

        Car c = new Car();
        c.start(); //Car is starting..

        Vehicle v = new Vehicle();
        v.start(); //Vehicle is starting..
    }
}
