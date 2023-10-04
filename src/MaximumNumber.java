import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Find the minimum and maximum using if-else statements
        double min, max;

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Display the minimum and maximum
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
