package Banking;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
	BankAccount obj1 = new BankAccount("xyz","baidixn");
	obj1.showMenu();
	}
}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	public BankAccount(String cname,String cid) {
		// TODO Auto-generated constructor stub
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance +=amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount!=0 && balance >=amount) {
			balance -=amount;
			previousTransaction = -amount;
		}
		else {
			System.out.println("insufficient balance!!!");
		}
	}
	
	void getpreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println(" Deposited: "+previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println(" Withdrawn: "+Math.abs(previousTransaction));
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}
	
	void calculateInterest(int years) {
		double interestRate = 3.6d;
		double newBalance = ((balance * interestRate *years)/100)+balance;
		System.out.println("The current interest rate is "+interestRate);
		System.out.println("After "+years+ " years,your balance will be: "+newBalance );
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("welcome "+customerName);
		System.out.println("Your id is "+customerId);
		System.out.println("\n");
		System.out.println("A.Check Balance ");
		System.out.println("B.Deposit ");
		System.out.println("C.Withdraw ");
		System.out.println("D.Previous Transaction ");
		System.out.println("E.Calculate interest ");
		System.out.println("F.Exit ");

		do {
			System.out.println("===============================================================================");
			System.out.println("Enter an option");
			System.out.println("===============================================================================");
			option = scan.next().charAt(0);
			option = Character.toUpperCase(option);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A': 
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B': 
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("---------------------------------------------------------------------------");
				int amount = scan.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C': 
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("---------------------------------------------------------------------------");
				int amount2 = scan.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D': 
				System.out.println("---------------------------------------------------------------------------");
				getpreviousTransaction();
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E': 
				System.out.println("Enter how many years of accured interest: ");
				int years = scan.nextInt();
				calculateInterest(years);
				break;
				
			case 'F': 
				System.out.println("===============================================================================");
				break;
				
			default:
				System.out.println("Invalid option! please enter again");
				break;
				
			}
		}while(option != 'F');
		System.out.println("thank you for using our services");
	}
}
