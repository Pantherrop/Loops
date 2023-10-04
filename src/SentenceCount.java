import java.util.Scanner;

public class SentenceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize a counter for 'a' characters
        int countA = 0;

        // Iterate through the characters in the string and count 'a's
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
                countA++;
            }
        }

        // Display the result
        System.out.println("Total number of 'a' characters: " + countA);

        // Close the scanner
        scanner.close();
    }
}


