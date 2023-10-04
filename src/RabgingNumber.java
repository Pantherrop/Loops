import java.util.Scanner;
public class RabgingNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter number from 1 to 20: ");

        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();

    }
}