//4. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        try {

            File file = new File(
                "C:\\Users\\17244\\OneDrive\\Desktop\\num.txt"
            );

            Scanner sc = new Scanner(file);

            while (sc.hasNextInt()) {

                int number = sc.nextInt();

                System.out.println("Number: " + number);

                if (number > 0) {
                    throw new Exception(
                        "Positive number found: " + number
                    );
                }
            }

            sc.close();

            System.out.println("No positive numbers found.");

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");

        } catch (Exception e) {

            System.out.println("Exception caught: " + e.getMessage());

        }
    }
}

       

