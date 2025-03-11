import java.util.Scanner;
class Calculator{
	static int addition(int a,int b){
		return a+b;
	}
	static int subtraction(int a, int b){
		return a-b;
	}
	static int multiplication(int a,int b){
		return a*b;
	}
	static int divide(int a,int b){
		if(b==0){
			throw new IllegalArgumentException("Divide by zero in not allowed");
		}
		return a/b;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter inter a and b ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Additon of "+a+" and "+b+" is "+Calculator.addition(a,b));
		System.out.println("subtraction of "+a+" and "+b+" is "+Calculator.subtraction(a,b));
		System.out.println("multiplication of "+a+" and "+b+" is "+Calculator.multiplication(a,b));
		System.out.println("divide of "+a+" by "+b+" is "+Calculator.divide(a,b));

	}
}
