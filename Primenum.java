import java.util.Scanner;

public class Primenum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
         if (number >= 100 || number <= 1) {
            System.out.println("Please enter a positive integer less         than 100.");
        } else {
            boolean isPrime = isPrime(number);
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }}
    
    public static boolean isPrime(int n) {
        
        for (int i = 2; i *i<=n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true; 
}
}
