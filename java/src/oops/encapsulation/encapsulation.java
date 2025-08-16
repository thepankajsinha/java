package oops.encapsulation;

public class encapsulation {
    public static class Car{

        //making attributes private
        private String modal;
        private String brand;
        private int price;

        //setter method to initialize the private attributes
        void setData(String modal, String brand, int price){
            this.modal = modal;
            this.brand = brand;
            this.price = price;
        }

        //getter method to access private attributes
        void getData(){
            System.out.println(modal+ " " + brand + " " +price);
        }

    }
    public static void main(String[] args) {
        Car c1 = new Car();

        //initialization of attributes using c1 object
        c1.setData("Nexon", "Tata", 1000000);
        //print the attributes
        c1.getData();
    }
}
