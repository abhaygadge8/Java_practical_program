import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'|| ch=='a' || ch=='E'|| ch=='e' || ch=='I'|| ch=='i'  || ch=='O'|| ch=='o'|| ch=='U'|| ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}