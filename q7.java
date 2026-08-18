//7. Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
import java.util.Scanner;

public class q7 {

    public static void checkVowels(String str) throws Exception {

        boolean vowelFound = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                vowelFound = true;
                break;
            }
        }

        if (vowelFound == false) {
            throw new Exception("String does not contain any vowels");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {

            checkVowels(str);

            System.out.println("String contains a vowel.");

        } catch (Exception e) {

            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}