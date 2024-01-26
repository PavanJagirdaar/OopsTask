/*create class account with data member as balance.create two constructors(no argument and two argument) and perform following task.
a)method to deposit amount to account.
b)method to withdraw amount from the account. 
c)method to display the balance*/
package oopstask;

import java.util.Scanner;
class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0 and less than or equal to balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // No-argument constructor
        Account account1 = new Account();

        // Two-argument constructor
        System.out.print("Enter initial balance for the second account: ");
        double initialBalance = scanner.nextDouble();
        Account account2 = new Account(initialBalance);

        // Perform operations on account1
        account1.deposit(1000);
        account1.displayBalance();
        account1.withdraw(500);
        account1.displayBalance();

        // Perform operations on account2
        account2.deposit(2000);
        account2.displayBalance();
        account2.withdraw(1000);
        account2.displayBalance();

        scanner.close();
	}

}
