import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value of a");
		int a=sc.nextInt();
		System.out.println("please enter value of b");
		int b=sc.nextInt();
		System.out.println("a= "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+" b= "+b);

	}
}