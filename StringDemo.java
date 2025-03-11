import java.util.Scanner;
class StringDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter how String want to enter");
		int n=sc.nextInt();
		sc.nextLine();
		String[] S=new String[n];
		int[] I=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("please enter String "+(i+1));
			S[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++){
			I[i]=S[i].length();
		}
		int max=I[0];
		int index=0;
		for(int i=2;i<n;i++){
			if(I[i]>max)
				max=I[i];
			index=i;
		}
		System.out.println("length of longest string is "+I[index]+" and this string is "+S[index]);
	}
}