public class LoopDemo{
 public static void main(String args[])
{
int n=0;
for(;;){
n++;
 if(n==10)break;
if(n==5)continue;
 System.out.println("n<=10");
}
}
}