package oops.impKeywords.finalKeyWord;

//A final class cannot be inherited.
final class Animal{
    void show(){
        System.out.println("I am Animal class.");
    }
}

//class Dog extends Animal{
//
//}

public class finalClass {
    public static void main(String[] args) {
        //Dog d = new Dog();
        //d.show(); cannot inherit from final oops.impKeywords.finalKeyWord.Animal
    }
}
