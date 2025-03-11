import java.util.Scanner;
class Vehicle{
	String company;
	double price;
	public Vehicle(){
		company="";
		price=0;
	}
	public Vehicle(String company,double price){
		this.company=company;
		this.price=price;
	}
	void display(){
		System.out.println("company name is "+this.company);
		System.out.println("Vehicle price is "+this.price);
	}
}
class LightMotorVehicle extends Vehicle{
	double mileage;
	LightMotorVehicle(){
		super();
		mileage=0;
	}
	LightMotorVehicle(String company,double price,double mileage){
		super(company,price);
		this.mileage=mileage;
	}
	void display(){
		super.display();
		System.out.println("Mileage of Vehicle is "+this.mileage);	
	}
}
class HeavyMotorVehicle extends Vehicle{
	double capacity_in_tons;
	HeavyMotorVehicle(){
		super();
		capacity_in_tons=0;
	}
	HeavyMotorVehicle(String company,double price,double capacity_in_tons){
		super(company,price);
		this.capacity_in_tons=capacity_in_tons;
	}
	void display(){
		super.display();
		System.out.println("Capacity in tons of Vehicle is "+this.capacity_in_tons);
	}
}
class VehicleMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("please how many vehicle inforamtion store");
		int n=sc.nextInt();
		Vehicle[] V= new Vehicle[n];
		for(int i=0;i<n;i++){
			sc.nextLine();
			System.out.println("please enter company name");
			String company=sc.nextLine();
			System.out.println("please enter price of Vehicle");
			double price=sc.nextDouble();
			sc.nextLine();
			System.out.println("please enter vehicle type as LightVehicle/HeavyVehicle");
			String type=sc.nextLine();
			if(type.equals("LightVehicle")){
				System.out.println("please enter mileage of Vehicle");
				double mileage=sc.nextDouble();
				V[i]=new LightMotorVehicle(company,price,mileage);
			}
			else if(type.equals("HeavyVehicle")){
				System.out.println("please enter capacity in tons of Vehicle");
				double capacity_in_tons=sc.nextDouble();
				V[i]=new HeavyMotorVehicle(company,price,capacity_in_tons);
			}
			else{
				System.out.println("Invalid input enter please enter proper as in LightVehicle/HeavyVehicle");
				i--;
			}
		}
		System.out.println("detail information of Vehicle is as follows");
		for(int i=0;i<n;i++){
			V[i].display();
		}
	}
}	