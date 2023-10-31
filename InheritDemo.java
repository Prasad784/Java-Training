class Account {
	int accNo;
	String name;
	double balance;
	public void deposit(double amt){
		balance +=amt;}
	public void withdraw(double amt){
		balance -= amt;
	}
	public void printBalance(){
		System.out.println("Balance is " +balance);
}
}
class SavingAccount extends Account{
	public void deposit(double amt){
		if(amt>5000){
			System.out.println("excceeding deposit limit");}
		else{
			super.deposit(amt);
		}
	}
}
public class InheritDemo{
     public static void main(String arg[]){
		SavingAccount myacc= new SavingAccount();
		myacc.deposit(6000);
		myacc.printBalance();
		myacc.deposit(5000);
		myacc.printBalance();
		myacc.deposit(60000);
		myacc.printBalance();
}
}