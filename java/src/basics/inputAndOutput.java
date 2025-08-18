package basics;

import java.util.Scanner;

public class inputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr your name: ");
        String name = sc.nextLine();

        System.out.println("Enetr your age: ");
        int age = sc.nextInt();

        System.out.println("Your name is " + name + " and age is " + age);

    }
}

//Enetr your name:
//Pankaj kumar
//Enetr your age:
//20
//Your name is Pankaj kumar and age is 20
