import java.util.Scanner;
class Student
{
	int rollno;
	String fname;
	String lname;
	String year;
	Student()
	{
		this.rollno=0;
		this.fname="";
		this.lname="";
		this.year="";
	}
	Student(int a,String fname,String lname,String year)
	{
		this.rollno=a;
		this.fname=fname;
		this.lname=lname;
		this.year=year;
	}
	void display()
	{
		System.out.println("Rollno is : "+this.rollno);
		System.out.println("Student first name : "+this.fname);
		System.out.println("Student last name : "+this.lname);
		System.out.println("Student year "+this.year);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter how many student detail want to enter");
		int n=sc.nextInt();
		Student[] S=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter roll no : ");
			int r=sc.nextInt();
			String f=sc.nextLine();	
			System.out.println("Please enter student first name :");
			f=sc.nextLine();	
			System.out.println("Please enter student last name : ");
			String l=sc.nextLine();
			System.out.println("Please enter student year :");
			String y=sc.nextLine();
			S[i]=new Student(r,f,l,y);
		}
		for(int i=0;i<n;i++)
		{
			S[i].display();
		}
		System.out.println("Please enter which class you want");
		String cyear=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			if(S[i].year.equals(cyear))
			{
				S[i].display();
			}
		}	
	}
}