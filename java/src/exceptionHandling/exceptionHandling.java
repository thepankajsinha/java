package exceptionHandling;

public class exceptionHandling {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // Code that may throw an exception
            int ans = num1 / num2;
            System.out.println(ans);
        }
        catch (Exception e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println("Finally block always executed.");
        }
    }
}

//Error: Division by zero is not allowed!
//Finally block always executed.
