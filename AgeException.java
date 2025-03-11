/*Write a Java program that prompts the user to enter their age. The program should:
• The input is a valid integer. The integer is within a reasonable range (e.g., between
0 and 120).
• Handle InputMismatchException: This occurs if the user enters a non-integer
value.
If the input is invalid, prompt the user to enter their age again until a valid input is
received.
Once a valid age is entered, display a message confirming the age.*/
import java.util.Scanner;
import java.lang.Exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(){
		super();
	}
	public InvalidAgeException(String msg){
		super(msg);
	}
}
class AgeException{
	int age;
	public AgeException(){
		age=0;
	}
	public AgeException(int age) throws InvalidAgeException{
		if(age<0 || age>120){
			throw new InvalidAgeException("please enter age between range of 0 to 120 ");
		}
		this.age=age;
	}
	void display(){
		System.out.println("age is "+this.age);	
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		//while(age<0 || age>120)
		try{
			System.out.println("please enter age");
			int age=sc.nextInt();
			AgeException A= new AgeException(age);
			A.display();
		}
		catch(InvalidAgeException e){
			System.out.println("Exception found "+e.getMessage());
		}
	}
}



/*
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(){
		super();
	}
	public InvalidAgeException(String msg){
		super(msg);
	}
}
class AgeException{
	int age;
	public AgeException(){
		age=0;
	}
	public AgeException(int age) throws InvalidAgeException{
		if(age<0 || age>120){
			throw new InvalidAgeException("please enter age between range of 0 to 120 ");
		}
		this.age=age;
	}
	void display(){
		System.out.println("age is "+this.age);	
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		try{
			System.out.println("please enter age");
			int age=sc.nextInt();
			AgeException A= new AgeException(age);
			A.display();
		}
		catch(InvalidAgeException e){
			System.out.println("Exception found "+e.getMessage());
		}
	}
}
*/
