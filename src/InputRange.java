import java.util.Scanner;
public class InputRange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting value");
        int start = scanner.nextInt();
        System.out.println("Enter the ending value");
        int end = scanner.nextInt();

        if (start > end)
        {
            System.out.println("Invalid input. The starting number should be less than or equal to the ending number.");
        } else

        {
            System.out.println("10 numbers between " + start + " and " + end + ":");

            // Ensure we don't exceed the range or go below zero
            for (int i = 0; i < 10 && (start + i) <= end; i++) {
                System.out.print((start + i) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
