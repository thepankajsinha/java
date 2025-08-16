package oops.constructors;

public class copyConstructor {
    public static class Car{
        String modal;
        String brand;
        int price;

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
        Car c1 = new Car("Nexon", "Tata", 1000000);
        Car c2 = new Car(c1);

        c2.show(); //Nexon Tata 1000000
    }
}
