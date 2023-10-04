import java.util.Scanner;

public class AverageNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the end number (b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Start number (a) should be less than or equal to end number (b).");
            return;
        }

        int sum = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Sum of numbers between " + a + " and " + b + " is: " + sum);
        System.out.println("Average of numbers between " + a + " and " + b + " is: " + average);

        scanner.close();
    }
}

