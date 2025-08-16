package oops.classAndObj;

public class basicsOfClass {

    public static class Car{
        //attributes
        String modal;
        String brand;
        int price;

        //methods
        void display(){
            System.out.println(modal + " " + brand + " " + price);
        }
    }
    public static void main(String[] args) {
        //creating an object c1
        Car c1 = new Car();

        //initialization of attributes
        c1.modal = "Nexon";
        c1.brand = "Tata";
        c1.price = 1000000;

        //calling method using object
        c1.display();
    }
}
