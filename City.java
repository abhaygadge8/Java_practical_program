/*write a java Program to illustrate multilevel inheritance such that is inherited from country. City is inherited from state. Display city, state and country. Write constructor , appropriate setter and getter methods.*/
import java.util.Scanner;
class Country{
	private String countryname;
	//default constructor
	Country(){
		countryname="";
	}
	Country(String countryname){
		this.countryname=countryname;
	}
	public void SetCountry(String c){
		this.countryname=c;
	}
	public String getCountry(){
		return this.countryname;
	}
}
class State extends Country{
	private String statename;
	State(){
		super();
		statename="";
	}
	State(String countryname, String statename){
		super(countryname);
		this.statename=statename;
	}
	public void SetState(String s){
		this.statename=s;
	}
	public String getState(){
		return this.statename;
	}
}
class City extends State{
	private String cityname;
	City(){
		super();
		cityname="";
	}
	City(String countryname, String statename, String cityname){
		super(countryname,statename);
		this.cityname=cityname;
	}
	public void setCity(String ci){
		this.cityname=ci;
	}
	public String getCity(){
		return this.cityname;
	}
	void display(){
		System.out.println("Country name is "+getCountry());
		System.out.println("State name is "+getState());
		System.out.println("City is "+getCity());
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter country state and city");
		String c=sc.nextLine();
		String s=sc.nextLine();
		String ci=sc.nextLine();
		City C=new City(c,s,ci);
		C.display();
	}
}