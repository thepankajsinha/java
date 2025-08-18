package string;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");   // modifies original
        System.out.println(sb); //Hello World
    }
}
