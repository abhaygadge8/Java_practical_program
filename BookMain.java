/*Define a class Book with private members ISBN, title, author, and price. Write default
and parameterized constructors. Create a subclass EBook with an additional private
member fileSize. Define methods to accept and display data for both classes. Create n
objects of the EBook class and display the details of the eBook with the largest file size.*/
import java.util.Scanner;
class Book
	private int ISBN;
	private String title;
	private String author;
	private double price;
	public Book(){
		ISBN=0;
		title="";
		author="";
		proce=0;
	}
	public Book(int ISBN,String title,String author,double price){
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void accept(){
		Scanner sc=new Snanner(System.in);
		System.out.println("please enter ISBN number");
		ISBN = sc.nextInt();
		System.out.println("please enter title");
		title= sc.nextLine();
		System.out.println("please enter author name of book");
		author = sc.nextLine();
		System.out.println("please enter price of book");
		price= sc.nextDouble();
	}
	public void display(){
		System.out.println("ISBN number is "+ISBN);
		System.out.println("title of book is "+title);
		System.out.println("book author name is "+author);
		System.out.println("book price is "+price);
	}
}
class EBook extends Book{
	private int fileSize;
	public EBook(){
		super();
	}
	public EBook(int ISBN,String title,String author,double price,int fileSize){
		super(ISBN,title,author,price,fileSize);
		this.fileSize=fileSize;
	}
	public void accept(){
		super.accept();
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter file in MB");
		fileSize=sc.nextInt();
	}
	public void display(){
		super.display();
		System.out.println("fileSize is "+fileSize);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter how many book want to store ");
		int n = sc.nextInt();
		EBook[] E=new EBook[n];
		for(int i=0;i<n;i++){
			E[i].accept();
		}
		for(int i=0;i<n;i++){
			E[i].display();
		}
		int max=E[0].fileSize;
		for(int i=1;i<n;i++){
			if(E[i].fileSize>max)
				max=E[i].fileSize;
				int index=i;
		}
		System.out.println("Detail Book information of maximum size");
		E[index].display();
		
	}
}