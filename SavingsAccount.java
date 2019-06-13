/*
 * SavingsAccount.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file contains all the attributes and methods specific to Savings
 * account.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class SavingsAccount extends AssetAccount{

	//Constructor of SavingsAccount class
	public SavingsAccount(String accType,String customerName,double accBalance){
		super(accType, customerName, accBalance);
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
		interest= time*0.08*accBalance;
		accBalance+=interest;
		System.out.println(customerName+" earned $"+interest+" Interest in "+time+"months"+
			". Account balance is now $"+accBalance);
	}
}