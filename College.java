/*Write a Java program to demonstrate multilevel inheritance where a class Institution is
inherited by University, and College is inherited from University. Display the
institution name, university name, and college name*/
import java.util.Scanner;
class Institution{
	String institution_name;
	public Institution(){}
	public Institution(String institution_name){
		this.institution_name=institution_name;
	}
	public void display(){
		System.out.println("Institution name is "+institution_name);
	} 
}
class University extends Institution{
	String university_name;
	public University(){super();}
	public University(String institution_name,String university_name){
		super(institution_name);
		this.university_name=university_name;
	}
	public void display(){
		super.display();
		System.out.println("university name is "+university_name);
	}
}
public class College extends University{
	String college_name;
	public College(){super();}
	public College(String institution_name,String university_name,String college_name){
		super(institution_name,university_name);
		this.college_name=college_name;
	}
	public void display(){
		super.display();
		System.out.println("college name is "+college_name);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter institution name ");
		String institution_name=sc.nextLine();
		System.out.println("please enter university name");
		String university_name=sc.nextLine();
		System.out.println("please enter college name");
		String college_name=sc.nextLine();
		College C=new College(institution_name,university_name,college_name);
		C.display();
	}
} 