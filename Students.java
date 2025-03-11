/*Write a Java program to create a Package “SY” which has a class SYMarks (members – 
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class 
TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having rollNumber, 
name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate the 
Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40 else‘FAIL’) and display the result 
of the student in proper format*/
import java.util.Scanner;
import SY;
import TY;
class Students
{
	int RollNumber;
	String Name;
	int symarks;
	int tymarks;
	Students()
	{
		this.RollNumber=0;
		this.Name=0;
		this.symarks=0;
		this.tymarks=0
	}
	Students(int roll,String name,int smark,int tmark)
	{
		this.RollNumber=roll;
		this.Name=name;
		this.symarks=smark;
		this.tymarks=tmark;
	}
	void display()
	{
	}
	int calculate()
	{
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(""enter number of student");
		int n=sc.nextInt();
		Student[] S=new Students[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter roll no");
			int roll=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter symarks");
			int smark=sc.nextInt();
			System.out.println("enter tymarks");
			int tmark=sc.nextInt();
			S[i]=new Students(roll,name,smark,tmark);
			
		}
	}
	
}