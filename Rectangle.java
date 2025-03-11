class Rectangle
{
	int length;
	int breadth;
	Rectangle()
	{
		this.length=0;
		this.breadth=0;
	}
	void setrect(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void display()
	{
		int show=area();
		System.out.println(show);
	}
	int area()
	{
		return this.length*this.breadth;
	}
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		r1.setrect(5,6);
		r1.display();
	}
	
}