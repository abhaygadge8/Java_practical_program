import Calculate.Compute;
import Calculate.Comput;
import java.util.Scanner;
class Computepackage{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number");
		int num=sc.nextInt();
		Compute.fibonacii(num);
		Comput.cubeprint(num);
	}
}