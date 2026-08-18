import java.util.Scanner;

public class q6 {

    public static void checkDuplicates(int[] numbers) throws Exception {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    throw new Exception(
                        "Duplicate number found: " + numbers[i]
                    );
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        try {

            checkDuplicates(numbers);

            System.out.println("No duplicate numbers found.");

        } catch (Exception e) {

            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}