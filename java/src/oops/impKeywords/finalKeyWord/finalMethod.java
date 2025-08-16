package oops.impKeywords.finalKeyWord;

class Parent {

    //A final method cannot be overridden by child class.
    final void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
     //void display() {}  Error: cannot override final method
}

public class finalMethod {
    public static void main(String[] args) {

    }
}
