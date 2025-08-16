package oops.polymorphism;

public class methodOverloading {
    public static void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void add(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }

    public static void add(double a, double b){
        double sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(10, 20); //30
        add(10,20,30); //60
        add(10.5, 20.5); //31.0
    }
}
