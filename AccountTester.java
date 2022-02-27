package exercise3;

import java.util.*;

public class AccountTester {

	public static void main(String[] args) {
		
/******************************************************************
	     
        Test 2: 
	   
	          ATM Program 
       
   ******************************************************************/ 		
		
		// Set up 10 accounts with ID and initial balance of $100.
		Account userAccount = new Account();
		
		Account[] accounts = new Account[10];
		
		for(int i=0; i<accounts.length; i++)
		{
			accounts[i] = new Account(i,100.0);
		}

		// Menu items 
		String balMenu = "1";
		String withdrawMenu = "2";
		String depositMenu = "3";
		String exit = "4";
		
		// Scanner variables
		int atmON = 1;
		int login = 0;
		String choice = "0";
		int id = 0;
		Scanner choiceCheck = new Scanner (System.in);
		Scanner idCheck = new Scanner (System.in);
		Scanner keyboard = new Scanner(System.in);
		
		
		while (atmON == 1)
		{
			while (login == 0)
			{
				System.out.println("\nEnter an id: ");
				id = idCheck.nextInt();
				login = 1;
			}
			while (login == 1)
			{
				if (id<0||id>9)
				{
					System.out.println("Invalid ID, please try again!");
					login = 0;
					continue;
				}
	
				System.out.println(userAccount.toMenu());
				System.out.println("Enter a choice: ");
				choice = choiceCheck.next();
				
				if (choice.equalsIgnoreCase(balMenu))
				{
					System.out.println("The balance is " + accounts[id].getBalance());
				} else if (choice.equalsIgnoreCase(withdrawMenu))
				{
					System.out.println("Enter an amount to withdraw: ");
					double amount = keyboard.nextDouble();
					accounts[id].withdraw(amount);
					
				} else if (choice.equalsIgnoreCase(depositMenu))
				{
					System.out.println("Enter an amount to deposit");
					double amount = keyboard.nextDouble();
					accounts[id].deposit(amount);
					
				} else if (choice.equalsIgnoreCase(exit))
				{
					login = 0;
				}
				
			}// While end.
		}
		choiceCheck.close();
		idCheck.close();
		keyboard.close();
		
	} // Main End.
	
} // AccountTester End.
