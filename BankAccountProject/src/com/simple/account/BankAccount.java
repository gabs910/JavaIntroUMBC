package com.simple.account;

public class BankAccount {
	private int accountID;
	private String ownerName;
	private float balance;
	private static float interestRate;
	
	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		BankAccount.interestRate = interestRate;
	}

	public BankAccount(int accountID, String ownerName, float balance){
		super();
		this.accountID = accountID;
		this.ownerName = ownerName;
		this.balance = balance;
	}//constructor
	
	public BankAccount(){}//default constructor
	
	
	public void deposit(float amount){
		balance = balance + amount;
	}//deposit


	public int getAccountID() {
		return accountID;
	}


	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	@Override
	public String toString() {
		return  "An account with id " + this.getAccountID() +
				" with balance " + this.getBalance() +
				" owned by " + this.getOwnerName();
	} 

	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void print(){
		System.out.println("\nAn Account");
		System.out.println("Account ID: "+ this.getAccountID());
		System.out.println("Owner: " + this.getOwnerName());
		System.out.println("Balance: " + this.getBalance());

	}//print
}//BankAccount
