/*Write a Java class BankAccount with a method withdraw(double amount). If the
withdrawal amount is greater than the account balance, throw a custom exception
InsufficientFundsException. Implement the custom exception class and
demonstrate the use of the withdraw method in a try-catch block.*/
import java.util.Scanner;
import java.lang.Exception;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(){
		super();
	}
	public InsufficientFundsException(String msg){
		super(msg);
	}
}
class BankAccountEx{
	double account_balance;
	BankAccountEx(){
		this.account_balance=0;
	}
	BankAccountEx(double account_balance){
		this.account_balance=account_balance;
	}
	//double withdraw_amt;
	void withdraw(double amount) throws InsufficientFundsException{
		if(amount>account_balance){
			throw new InsufficientFundsException("Can't withdraw this amount because account is less than amount.please withdraw less amount");
		}
		else{
			this.account_balance=this.account_balance-amount;
			System.out.println("Withdraw amount is "+amount);
			System.out.println("Remaining Clear account Balance is "+account_balance);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("please enter account balance");
			double account_balance=sc.nextDouble();
			sc.nextLine();
			System.out.println("please enter amount that want to withdraw");
			double amount= sc.nextDouble();
			BankAccountEx B= new BankAccountEx(account_balance);
			B.withdraw(amount);
		}
		catch(InsufficientFundsException e){
			System.out.println("InsufficientFundsException Found "+e.getMessage());
		}
	}
}