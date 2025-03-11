/*Create a class for Bank_Customer with appropriate details as a it is data
members.
Write a program to update its savings, current account balance as per the
transactions done by the customers. (use array of objects)*/
import java.util.Scanner;
class Bank
{
String account;
String acch;
String address;
int balance;
Bank()
{
	this.account="";
	this.acch="";
	this.address="";
	this.balance=0;
}
Bank(String acc,String name,String add, int bal)
{
	this.account=acc;
	this.acch=name;
	this.address=add;
	this.balance=bal;
}
/*void updatebal()
{
	
}*/
void display()
{
	System.out.println("Account no : "+this.account);
	System.out.println("Account Holder name : "+this.acch);
	System.out.println("Account holder address : "+this.address);
	System.out.println("Account Balance : "+this.balance);
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number how many account holder enter : ");
		int n=sc.nextInt();
		Bank[] B= new Bank[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("please enter account number : ");
			sc.nextLine();
			String a=sc.nextLine();
			System.out.println("please enter Account holder name : ");
			String name=sc.nextLine();
			System.out.println("please enter your address : ");
			String ad=sc.nextLine();
			System.out.println("please enter your Account balance : ");
			int b=sc.nextInt();
			B[i]=new Bank(a,name,ad,b);
		}
	
		for(int i=0;i<n;i++)
		{
			B[i].display();
		}
		System.out.println("please enter account number which account balance you want to update into their account ");
		sc.nextLine();
		String ac=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(B[i].account.equals(ac))
			{
				System.out.println("please enter amount your want update");
				int am=sc.nextInt();
				B[i].balance=B[i].balance-(am);
				B[i].display();
			}
		}
		
	}
}