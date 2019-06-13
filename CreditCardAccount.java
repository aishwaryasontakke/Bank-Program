/*
 * CreditCardAccount.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file contains all the attributes and methods specific to CreditCard
 * account.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class CreditCardAccount extends LiabilityAccount{
	double amountOwed;

	//Constructor of CreditCardAccount class
	public CreditCardAccount(String accType,String customerName){
		super( accType, customerName);
		amountOwed=0.0;
	}
	
	/**
 	* This method is used to credit the account with the amount passed.
 	*
 	* @param       amount    		Amount to be credited.
 	*                                    
 	* @return      amountOwed      	Amount owed to the bank after credit 
 	*								operation.
 	*/
	public double credit(double amount){
		this.amountOwed+=amount;
		return this.amountOwed;
	}

	/**
 	* This method is used to debit the amount passed.
 	*
 	* @param       amount    		Amount to be debited.
 	*                                    
 	* @return      amountOwed      	Amount owed to the bank after debit 
 	*								operation.
 	*/
	public double debit(double amount){
		this.amountOwed-=amount;
		return amountOwed;
	}

	/**
 	* This method is used to calcilate the interest depending on the time passed
 	* in months and print it.
 	*
 	* @param       time    	Time for which interest is to be calculated.
 	*                                    
 	* @return      void 	This method does not return any type.
 	*/
	public void interest(int time){
		double interest;
		interest= time*0.08*amountOwed;
		amountOwed+=interest;
		System.out.println(customerName+" charged $"+interest+" in Interest after"+time+"months"+
			". Account balance is now $"+amountOwed);
	}	
}