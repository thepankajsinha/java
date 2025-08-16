package oops.constructors;

public class constructorOverloading {
    public static class Car{
        String modal;
        String brand;
        int price;

        //default constructor
        Car(){
            this.modal = null;
            this.brand = null;
            this.price = 100;
        }

        //parameter constructor
        Car(String modal, String brand, int price){
            this.modal = modal;
            this.brand = brand;
            this.price = price;
        }

        //user defined copy constructor, there is no inbuilt copy constructor in java
        Car(Car c){
            this.modal = c.modal;
            this.brand = c.brand;
            this.price = c.price;
        }

        void show(){
            System.out.print(modal + " " + brand + " " + price);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.show(); // null null 100
        System.out.println();

        Car c2 = new Car("Nexon", "Tata", 1000000);
        c2.show(); //Nexon Tata 1000000
        System.out.println();

        Car c3 = new Car(c2);
        c3.show(); //Nexon Tata 1000000

    }
}
