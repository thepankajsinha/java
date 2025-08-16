package oops.constructors;

public class defaultConstructor {
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
    }
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println(c1.price);  //100
    }
}
