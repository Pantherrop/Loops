import java.util.Scanner;

public class DivisibleBy9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the ending number (b): ");
        int b = scanner.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of numbers between " + a + " and " + b + " divisible by 9 is: " + sum);

        scanner.close();
    }
}

