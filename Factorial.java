import java.util.Scanner;

public class Factorial{
   public static void main(String ar[]){

Scanner scanner=new Scanner(System.in);

System.out.println("enter a positive number");

 int n= scanner.nextInt();
        long factorial = 1;

   for(int i=1;i<=n;i++)
{
 factorial=i*i;
}
System.out.println("Factorial of"+n+"is"+factorial);

scanner.close();
}
}