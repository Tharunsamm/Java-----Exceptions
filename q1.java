//1. Write a Java program that throws an exception and catch it using a try-catch block.
public class q1 {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int a= 10;
            int b=  0; 
            int result = a/b;// This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the exception
            System.out.println("An exception occurred: "+ e.getMessage());
        }
    }
}