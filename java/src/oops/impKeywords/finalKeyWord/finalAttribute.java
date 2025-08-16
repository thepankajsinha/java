package oops.impKeywords.finalKeyWord;

public class finalAttribute {
    //final is a non-access modifiers
    //Once assigned, a final variable cannot be changed. hence it became constant
    //Must be initialized at the time of declaration or inside a constructor


    public static void main(String[] args) {
        final double PI = 3.14;

        //PI = 20; //error: cannot assign a value to final variable PI
    }
}
