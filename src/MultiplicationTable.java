import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
// ask user to input any number for multiplication table
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Print multiplication table for any number
        System.out.println("Multiplication Table for" + number + ":");
        for(int i =1; i<=10; i++)// System.out.println("i: "+i")
        {
            int result = number * i;
            {
                System.out.println(number + "x" + i + "=" + result);
            }

        }
scanner.close();






    }
}
