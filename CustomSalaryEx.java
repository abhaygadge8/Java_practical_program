import java.lang.Exception;
class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String msg){
		super(msg);
	}
}

class CustomSalaryEx{
	double sal;
	void setSalary(double salary) throws InvalidSalaryException{
		if(salary<0){
			throw new InvalidSalaryException("Error: salary is less than 0");
		}
		else{ 
		sal = salary;
		System.out.println("salry is "+sal);
		} 
	}

	public static void main(String[] args){
		CustomSalaryEx C = new CustomSalaryEx();
		try{
			C.setSalary(2);
		}
		catch(InvalidSalaryException e){
			e.printStackTrace();
		}
	}
}