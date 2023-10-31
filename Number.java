import java.util.*;
public class Number {
    public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
      
        System.out.println("Enter a number ");
        int n= scanner.nextInt();
   int sum=0;
if(n==-999);
{
System.out.println("invalid");
}
 for(int i=-999; i<=n;i++)
{
sum=i++;
 System.out.println(i);


}
}
} 
*/
import java.util.Scanner;

 

public class Main {
    public static void main(String[] args) {
        int sum = 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
        for (;;) {
            int n = sc.nextInt();

            if (n == -999) {
                break;
            }

            sum += n;
        }

 

        System.out.println("Sum of the integers: " + sum);
    }
}
/*