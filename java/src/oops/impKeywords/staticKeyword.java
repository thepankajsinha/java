package oops.impKeywords;

class Student{
     private static int count = 0; //static attributes
     private String name;

     Student(String name){
         this.name = name;
         count++;
     }

     //static method to access the static attributes
     static void studentCount(){
         System.out.println(count);
     }
}
public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Jhon Doe");
        Student s2 = new Student("Jane Doe");

        Student.studentCount(); //2

    }
}
