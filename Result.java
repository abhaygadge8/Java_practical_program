/*Write a program to check whether the student is passed or failed?
In case passed generate grade as A, B, C, D or F.
Accept the following inputs:
1. Passing percentage required.
2. Obtained marks
3. Accept the percentage ranges for A, B, C, D or F.*/
import java.util.Scanner;
class Result
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter passing percentage required");
		int p=sc.nextInt();
		System.out.println("Please Enter Mininum marks for A grade");
		int a=sc.nextInt();
		System.out.println("Please Enter Mininum marks for B grade");
		int b=sc.nextInt();
		System.out.println("Please Enter Mininum marks for C grade");
		int c=sc.nextInt();
		System.out.println("Please Enter Mininum marks for D grade");
		int d=sc.nextInt();
		while(true)
		{
			System.out.println("Please Enter your obtained marks");
			int o=sc.nextInt();
			if(o<p)
			{
				System.out.println("Your are Fail and Your Grade is F");
			}
			else if(o<=d)
			{
				System.out.println("Your are Pass and Your Grade is D");
			}
			else if(o<=c)
			{
				System.out.println("Your are Pass and Your Grade is C");
			}
			else if(o<=b)
			{
				System.out.println("Your are Pass and Your Grade is B");
			}
			else if(o>=c)
			{
				System.out.println("Your are Pass and Your Grade is A");
			}
		}
		
	}
}