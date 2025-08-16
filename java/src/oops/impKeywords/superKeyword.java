package oops.impKeywords;

class Vehicle{
    String type = "Generic Vehicle";
    void start(){
        System.out.println("Vehicle is starting..");
    }
}

class Car extends Vehicle{
    String type = "Car";

    @Override
    void start(){
        System.out.println("Car is starting..");
        super.start(); //super is used to access parent class method when method name is same in both child and parent class.
    }

    void showType(){
        //super is used to access parent class variable when variable name is same in both child and parent class.
        System.out.println(type + " " + super.type);
    }
}
public class superKeyword {
    public static void main(String[] args) {
        Car c = new Car();

        c.showType(); //Car Generic Vehicle

        c.start();
        //Car is starting..
        //Vehicle is starting..

    }
}
