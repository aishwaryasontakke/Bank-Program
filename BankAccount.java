/*
 * BankAccount.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       3
 */

/**
 * This is the parent class for AssetAccount and LiabilityAccount classes and
 * includes attributes and methods that are common to all the accounts.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

import java.util.*;

public abstract class BankAccount{
	String accNo;
	String accType;
	String customerName;
	
	//Constructor of BankAccount class.
	public BankAccount(String accType,String customerName){
	this.customerName=customerName;
	this.accType=accType;
	this.accNo="10000"+((int)(Math.random()*100000));
	}

	//methods specific to different account types
	public abstract void printSummary();
	public abstract double credit(double amount);
	public abstract double debit(double amount);
	public abstract void interest(int time);
}