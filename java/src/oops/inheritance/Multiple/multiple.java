package oops.inheritance.Multiple;

interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Show from C");
    }
}

public class multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); //show from C
    }
}
