public class Array {
    public static void main(String[] args) {

    
        int numIntegers = scanner.nextInt();

       
        int[] integers = new int[numIntegers];

       
        System.out.println("Enter the integers:");
        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            integers[i] = scanner.nextInt();
        }

       
        int sum = 0;
        for (int num : integers) {
            sum += num;
        }

        
        double average = (double) sum / numIntegers;

       
        int countLessThanAverage = 0;
        for (int num : integers) {
            if (num < average) {
                countLessThanAverage++;
            }
        }

      
        System.out.println("Sum of integers: " + sum);
        System.out.println("Average of integers: " + average);
        System.out.println("Number of values less than the average: " + countLessThanAverage);
    }
}
