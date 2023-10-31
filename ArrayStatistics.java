import java.util.Scanner;
import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = new int[10];

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

       
        double average = (double) sum / numbers.length;
        System.out.println("Average of numbers: " + average);

        
        Arrays.sort(numbers);

       
        System.out.println("Smallest number: " + numbers[0]);
        System.out.println("Largest number: " + numbers[numbers.length - 1]);

        
        int secondLargest = numbers[numbers.length - 2];
        System.out.println("Second largest number: " + secondLargest);

        scanner.close();
    }
}
