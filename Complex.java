//Program of Operation on complex number
class Complex
{
	int real;
	int img;
	Complex()
	{
		real=0;
		img=0;
	}
	Complex(int r, int i)
	{
		this.real=r;
		this.img=i;
	}
	void getcomplex(int a, int b)
	{
		this.real=a;
		this.img=b;
	}
	void displaycomplex()
	{
		System.out.println("Real part is :"+real);
		System.out.println("imaginary part is :"+img);
	}
	public String toString()
	{
		return "("+real+"+i"+img+")";
	}
	Complex addComplex(Complex c2)
	{
		Complex C=new Complex();
		C.real=c2.real+this.real;
		C.img=c2.img+this.img;
		return C;
	}
	Complex subComplex(Complex c2)
	{
		Complex C=new Complex();
		C.real=c2.real-this.real;
		C.img=c2.img-this.img;
		return C;
	}
	Complex mulComplex(Complex c2)
	{
		Complex C=new Complex();
		C.real=(this.real*c2.real)-(this.img*c2.img);
		C.img=(this.real*c2.img)-(c2.real*this.img);
		return C;
	}
	Complex divComplex(Complex c2)
	{
		Complex C=new Complex();
		C.real=((this.real*c2.real)-(this.img*c2.img))/(c2.real*c2.real+c2.img*c2.img);
		C.img=((this.real*c2.img)+(this.img*c2.real))/(c2.real*c2.real+c2.img*c2.img);
		return C;
	}
	public static void main(String[] args)
	{
		Complex c1=new Complex(3,4);
		System.out.println("(real+i img) ="+c1);
		Complex c2=new  Complex(1,2);
		System.out.println("(real+i img) ="+c2);
		Complex c3=new Complex();
		c3=c1.addComplex(c2);
		System.out.println("Addition of  complex number is "+c3.toString());
		c3=c1.subComplex(c2);
		System.out.println("Subtraction of  complex number is "+c3.toString());
		c3=c1.mulComplex(c2);
		System.out.println("Multiplication of  complex number is "+c3.toString());
		c3=c1.divComplex(c2);
		System.out.println("Division of  complex number is "+c3.toString());

	}	
}