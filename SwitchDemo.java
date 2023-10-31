public class SwitchDemo{
 public static void main(String ar[]){
 char ch=ar[0].charAt(0);
 switch(ch){ 
case 'a':
case 'e':
case 'i':
case 'o':
System.out.println("Vowels");

break;

case 'b':
case 'c':

System.out.println("Con");


break;
default:
System.out.println("special char");
}
} 
}