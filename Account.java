package exercise3;

import java.util.*;

public class Account {

		private int id;								// Account ID
		private double balance;						// Account Balance
		private double annualInterestRate;			// Current interest rate
		private Date dateCreated;					// The date when the account was created

	/**
	 	Default Constructor
	 */
		public Account() 
		{
			setID(0);
			setBalance(0);
			setInterest(0);	
			dateCreated = new Date();
		}
		
	/**
		@param aID the account ID.
			   bal the account balance.
	*/
		public Account (int aID, double bal)
		{
			setID(aID);
			setBalance(bal);
		}
		
	/**
	 	Assigns the account ID.
	 	@param aID the account ID.
	 */
		public void setID (int aID)
		{
			id = aID;	
			
		} // setID End.
		
	/**
	 	Assigns the account balance.
	 	@param bal the account balance.
	 */
		public void setBalance (double bal)
		{
			balance = bal;
			
		} // setBalance End.
		
	/**
	 	Assigns the account interest rate.
	 	@param intRate the account interest rate.
	 */
		public void setInterest (double intRate)
		{
			annualInterestRate = intRate;
			
		} // setInterest End.
		
	/**
	 	Provides the account ID.
	 	@return the account ID.
	 */
		public int getID()
		{
			return id;
			
		} // getID End.
		
	/**
	  	Provides the account balance.
	 	@return the account balance.
	 */
		public double getBalance()
		{
			return balance;
			
		} // getBalance End.
		
	/**
	 	Provides the account annual interest rate.
	 	@return the account annual interest rate.
	 */
		public double getInterestRate()
		{
			return annualInterestRate;
			
		} // getInterestRate End.
	
	/**
	 	Provides the date the account was created.
	 	@return the date the account was created.
	 */
		public Date getDateCreated()
		{
			return dateCreated;
			
		} // getDateCreated End.
		
	/**
	 	Provides the monthly interest rate.
	 	@return the monthly interest rate.
	 */
		public double getMonthlyInterestRate()
		{
			return (annualInterestRate / 12);
			
		} // getMonthlyInterestRate End.
		
	/**
	 	Provides the monthly interest.
	 	@return the monthly interest.
	 */
		public double getMonthlyInterest()
		{
			return balance * getMonthlyInterestRate();
			
		} // getMonthlyInterest End.
		
	/**
	 	Withdraw a specific amount from the account.
	 	@param withdrawAmt the amount being withdrawn from the account.
	 */
		public void withdraw(double withdrawAmt)
		throws IllegalArgumentException
		{
			boolean valid = balance > withdrawAmt;
			if (valid)
			{
				balance = balance - withdrawAmt;
			} else {
				throw new IllegalArgumentException("Error: Insufficient Balance.");
			}
		} // Withdraw End.
		
	/**
	 	Deposit a specific amount into the account.
	 	@param depositAmt the amount being withdrawn from the account.
	 */
		public void deposit(double depositAmt)
		{
			balance += depositAmt;
			
		} // Deposit End.	
		
	/**
	 	Produces the ATM menu.
	 	@return the ATM menu.
	 */
		public String toMenu()
		{
			String menu = "\nMain menu" + "\n" +
						  "1: Check Balance" + "\n" +
						  "2: Withdraw" + "\n" +
						  "3: Deposit:" + "\n" +
						  "4: Exit";
			return menu;
			
		} // toString End.		
		
		
}// Program End
