package string;

public class string {
    public static void main(String[] args) {
        String s1 = "Hello"; //this store in heap and  in string pool
        String s2 = new String("World"); // this store in heap outside the string pool

        System.out.println(s1 + " " + s2);
    }
}
