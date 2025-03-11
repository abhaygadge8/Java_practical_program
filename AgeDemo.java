import java.util.Scanner;
import java.lang.Exception;
class AgeExceptionEx extends Exception{
	public AgeExceptionEx(){
		super();
	}
	public AgeExceptionEx(String msg){
		super(msg);
	}
}
class AgeDemo{
	int age;
	AgeDemo(){
		age=0;
	}
	AgeDemo(int age) throws AgeExceptionEx{
		if(age<0 ||age>120){
			throw new AgeExceptionEx("Invalid input please enter value in range 0 to 120");
		}
		this.age=age;
	}
	void display(){
		System.out.println("age is "+this.age);
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		sc.nextLine();
		try{
			System.out.println("please enter age");
			int age=sc.nextInt();
			AgeDemo A=new AgeDemo(age);
			A.display();
		}
		catch(Exception e){
			System.out.println("Error found "+e.getMessage());
		}
	}
}
