
import java.util.Scanner;
class Book{
	String author;
	
	Book(){
		this.author="xyz";
	}	
	
	Book(String author){
		this.author=author;
	}
	void display(){
		System.out.println("Author name: "+this.author);
	}
}
class BookPublication extends Book{
	String title;
	
	BookPublication(){
		super();
		this.title="abc";
	}	
	
	BookPublication(String author, String title){
		super(author);
		this.title=title;
	}
	void display(){
		super.display();
		System.out.println("Book Title: "+this.title);
	}
}
class PaperPublication extends Book{
	String title;
	
	PaperPublication(){
		super();
		this.title="pqr";
	}	
	
	PaperPublication(String author,String title){
		super(author);
		this.title=title;
	}
	void display(){
		super.display();
		System.out.println("Paper Title: "+this.title);
	}

}
class Main{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("How many books : ");
	int n=sc.nextInt();

	Book b[]=new Book[n];
	
	for(int i=0;i<n; i++){
		String author=sc.nextLine(); // to get data from buffer
		System.out.println("Enter author name : ");
		author=sc.nextLine();
		System.out.println("Enter type of Publication (book / paper) : ");
		String type=sc.nextLine();
		System.out.println("Enter Title : ");
		String title=sc.nextLine();
		if (type.equals("book"))
			b[i] = new BookPublication(author, title);
		else
			if (type.equals("paper"))
				b[i]=new PaperPublication(author,title);
			else
				{
				System.out.println("Invalid publication type ");
				i--;
				}
		}//end of for
		System.out.println("Pulication Details: ");

		for(int i=0; i<n; i++)
				b[i].display();//Dynamic method dispatch -> display of BookPublication or PaperPublication

		}
	
}
