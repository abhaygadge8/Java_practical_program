import java.util.Scanner;
import java.lang.Math;

class Account{
    protected String cname;
    protected int acno;
    protected String tac;
    protected double bal;

    public Account(){
        cname = "";
        acno = 0;
        tac = "";
        bal = 0;
    }

    public Account(String cname, int acno, String tac, double bal){
        this.cname = cname;
        this.acno = acno;
        this.tac = tac;
        this.bal = bal;
    }

    public void display(){
        System.out.println("Customer name is: " + this.cname);
        System.out.println("Customer account number is: " + this.acno);
        System.out.println("Account type is: " + this.tac);
        System.out.println("Account balance is: " + this.bal);
    }

    void displayBalance(){
        System.out.println("Account balance is: " + this.bal);
    }

    void deposit(double amt){
        this.bal += amt;
        System.out.println("Amount Deposited = " + amt);
        displayBalance();
    }
}

class SavingAC extends Account{
    private final double irate = 0.06;

    SavingAC(String cname, int acno, String tac, double bal){
        super(cname, acno, tac, bal);
    }

    void toComputeInt(int nyear){
        double iamt = this.bal * Math.pow(1 + irate, nyear) - this.bal;
        deposit(iamt);
    }

    void withdraw(double amt){
        if (amt <= this.bal){
            bal -= amt;
            System.out.println("Amount Withdrawn: " + amt);
            checkMinBal();
        } else{
            System.out.println("Insufficient balance to withdraw.");
        }
    }

    void checkMinBal(){
        if (this.bal < 1000){
            System.out.println("Penalty of Rs 100 due to balance below minimum.");
            bal -= 100;
            displayBalance();
        }
    }
}

class CurrentAC extends Account{
    CurrentAC(String cname, int acno, String tac, double bal) {
        super(cname, acno, tac, bal);
    }

    void withdraw(double amt){
        if (amt <= (bal + 50000)){
            bal -= amt;
            System.out.println("Amount Withdrawn: " + amt);
            checkMinBal();
        } else{
            System.out.println("Withdrawal limit exceeded.");
        }
    }

    void checkMinBal(){
        if (bal < -50000){
            System.out.println("Penalty of Rs 5000 due to overdraft.");
            bal -= 5000;
            displayBalance();
        }
    }
}

class AccountMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many accounts you want to store:");
        int n = sc.nextInt();
        sc.nextLine();
        Account[] A = new Account[n];

        for(int i = 0; i < n; i++){
            System.out.println("Please enter account holder name:");
            String cname = sc.nextLine();
            System.out.println("Please enter account number:");
            int acno = sc.nextInt();
            sc.nextLine();
            System.out.println("Please enter account type Saving/Current:");
            String tac = sc.nextLine();
            System.out.println("Please enter account balance:");
            double bal = sc.nextDouble();

            if(tac.equalsIgnoreCase("Saving")){
                System.out.println("Please enter the number of years for interest calculation:");
                int nyear = sc.nextInt();
                System.out.println("Please enter amount you want to withdraw:");
                double amt = sc.nextDouble();
                A[i] = new SavingAC(cname, acno, tac, bal);
                ((SavingAC) A[i]).toComputeInt(nyear);
                ((SavingAC) A[i]).withdraw(amt);
            }else if(tac.equalsIgnoreCase("Current")){
                System.out.println("Please enter amount to withdraw:");
                double amt = sc.nextDouble();
                A[i] = new CurrentAC(cname, acno, tac, bal);
                ((CurrentAC) A[i]).withdraw(amt);
            }else{
                System.out.println("Invalid account type. Please enter either 'Saving' or 'Current'.");
                i--;
            }
            sc.nextLine();         
	}

        System.out.println("Bank Information Detail:");
        for(int i = 0; i < n; i++){
            System.out.println("Account information of person " + (i + 1));
            A[i].display();
        }
    }
}
