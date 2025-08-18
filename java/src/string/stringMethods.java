package string;

public class stringMethods {
    public static void main(String[] args) {
        String str = " Java Programming ";

        System.out.println(str.toUpperCase());   // JAVA PROGRAMMING
        System.out.println(str.toLowerCase());   // java programming
        System.out.println(str.trim());          // removes spaces
        System.out.println(str.substring(5, 16));// Programming
        System.out.println(str.replace("Java","C++")); // C++ Programming
        System.out.println(str.contains("Java"));      // true
        System.out.println(str.charAt(2));       // 'v'
        System.out.println(str.length());        // length
    }
}
