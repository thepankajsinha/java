package oops.impKeywords;

//this keyword is used to eliminate the confusion between class attributes and parameters with the same name
class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }

    void show(){
        System.out.println(name);
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Employee e = new Employee("Jon Doe");
        e.show(); //Jon Doe
    }
}
