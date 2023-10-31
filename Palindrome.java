import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a 4-digit number: ");

        int n = scanner.nextInt();

        
        if (n < 1000 || n > 9999) {

            System.out.println("Invalid number");

            return;
        }

        
        int originalNumber = n;

        int reversedNumber = 0;

        while (n != 0) {

            int digit = n % 10;

            reversedNumber = reversedNumber * 10 + digit;

            n /= 10;
        }

        
        if (originalNumber == reversedNumber) {

            System.out.println("The number is a palindrome.");

        } else {

            System.out.println("The number is not a palindrome.");
        }

        scanner.close();
    }
}
