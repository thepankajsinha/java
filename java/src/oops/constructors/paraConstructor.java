package oops.constructors;

public class paraConstructor {
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

        void show(){
            System.out.print(modal + " " + brand + " " + price);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car("Nexon", "Tata", 1000000);
        c1.show(); //Nexon Tata 1000000
    }
}
