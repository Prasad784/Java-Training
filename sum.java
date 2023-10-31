public class sum{
 public static void main(String ar[]){


int n=Integer.parseInt(ar[0]);
  
int sum=0;
   for(int i=0;i<=n;i++)
{
 sum +=i*i;
}
System.out.println("Sum of first "+n+"natural numbers"+sum);
}
}