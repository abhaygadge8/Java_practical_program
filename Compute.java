package Calculate;
public class Compute{
	public static void fibonacii(int num){
		int a=0;
		int b=1;
		for(int i=0;i<num;i++){
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
}