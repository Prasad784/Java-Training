
public class SumOfDigits {
    public static void main(String[] args) {
        
        int sum = 0,n=10;
        
        
        while (n > 0) {
            int digit = n % 10; 
            sum += digit;
            n /= 10; 
        }
        
    }
}
