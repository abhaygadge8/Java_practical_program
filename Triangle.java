class Triangle
{
	double base;
	double height;
	Triangle()
	{
		this.base=0;
		this.height=0;
	}
	void settri(int b,int h)
	{
		this.base=b;
		this.height=h;
	}
	void display()
	{
		double show=area();
		System.out.println(show);
	}
	double area()
	{
		return 0.5* this.base * this.height;
	}
	public static void main(String[] args)
	{
		Triangle t1=new Triangle();
		t1.settri(5,6);
		t1.display();
	}
}