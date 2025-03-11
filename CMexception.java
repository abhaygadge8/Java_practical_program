/*What is a custom exception in Java, and why might you use one? Write a Java class
InvalidAgeException that extends the Exception class. This exception should be
thrown when an invalid age (less than 0 or greater than 150) is provided. Demonstrate
how to use this custom exception in a method that checks the validity of an age.*/
import java.util.Scanner;
import java.lang.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String s){
        super(s);
    }
}
class CMException{
    String name;
    double age;
    CMException(){
        name="";
        age=0;
    }
    CMException(String name,double age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter name");
        String name=sc.nextLine();
        System.out.println("please enter age");
        double age=sc.nextDouble();
        CMException C1=new CMException(name,age);
        try{
            if(C1.age<0 || C1.age>150){
                throw new InvalidAgeException("Invalid age is provided");
            }
            else{
                C1.display();
            }
        }catch(java.lang.Exception e){
            System.out.println(e.getMessage());
        }
        
    }//ens main
}//end class