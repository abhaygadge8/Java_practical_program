/*Write a program to define an abstract class “Roundshape” with one data member-
radius and a constant PI. Declare abstract methods findarea ( ) and findvolume ().
Define a sub class “sphere” and calculate the area and volume of a sphere object*/
import java.util.Scanner;
abstract class Roundshape{
	public abstract double findarea();
	public abstract double findvolume();
}
class Sphere extends Roundshape{
	final double PI = 3.142;
	private double radius;
	public Sphere(){radius=1;}
	public Sphere(double radius){
		this.radius=radius;
	}
	public double findarea(){
		return (4* PI* radius* radius);
	}
	public double findvolume(){
		return (4/3*PI* radius*radius*radius);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter radius");
		double radius=sc.nextDouble();
		Sphere S = new Sphere(radius);
		System.out.println("area of shpere is "+S.findarea());
		System.out.println("volume of spehre id "+S.findvolume());
	}
}