import java.util.Scanner;
class Array1
{
public static void main(String[] args)
{
int i,n;
int a[];
a = new int[5];
Scanner sc = new Scanner(System.in);
System.out.println("Enter value in array");
n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.println("Enter value a["+i+"]");
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}