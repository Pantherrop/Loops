import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");

        // Read the value of n from the user
        int n = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;

            // Calculate the sum of natural numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}
