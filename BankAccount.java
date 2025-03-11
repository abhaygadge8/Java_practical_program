import java.util.Scanner;

// Custom exception class
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String s) {
        super(s);
    }
}

// BankAccount class
class BankAccount {
    String name;
    double account_balance;

    // Default constructor
    BankAccount() {
        this.name = "";
        this.account_balance = 0;
    }

    // Parameterized constructor
    BankAccount(String name, double account_balance) {
        this.name = name;
        this.account_balance = account_balance;
    }

    // Method to withdraw amount
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > account_balance) {
            throw new InsufficientFundsException("Insufficient balance");
        } else {
            account_balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: " + account_balance);
        }
    }

    // Method to display account details
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Account balance: " + this.account_balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get account details from user
        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        System.out.println("Please enter your account balance:");
        double account_balance = sc.nextDouble();

        // Create BankAccount object
        BankAccount B1 = new BankAccount(name, account_balance);

        // Show account details
        B1.display();

        // Get withdrawal amount and try to withdraw
        System.out.println("Please enter the amount to withdraw:");
        double withdraw_amount = sc.nextDouble();

        try {
            B1.withdraw(withdraw_amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        
    }
}
