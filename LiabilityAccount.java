/*
 * LiabilityAccount.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This is the parent class for CreditCardAccount class and includes
 * attributes and methods for it.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public abstract class  LiabilityAccount extends BankAccount{
	double amountOwed;

	//Constructor of LiabilityAccount class
	public LiabilityAccount(String accType,String customerName){
		super(accType,customerName);
		this.amountOwed=0.0;
	}

	/**
 	* This method is used to print the details of the accounts created so far.
 	*
 	* @param       -    		Does not take any parameter.
 	*                                    
 	* @return      void      	This method does not return any type.
 	*/
	public void printSummary(){
		System.out.println("Customer name :"+this.customerName);
		System.out.println("Account type :"+this.accType);
		System.out.println("Amount owed :"+this.amountOwed);
		System.out.println("Account No is :"+this.accNo);	
	}	
}