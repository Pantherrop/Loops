import java.util.Scanner;
public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Read the user input
        int number = scanner.nextInt();

        scanner.close();

        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
