//2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
import java.util.Scanner;
public class q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        try {
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                throw new Exception("The number is odd.");
            }
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

}
