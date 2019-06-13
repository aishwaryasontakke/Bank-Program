/*
 * CheckingAccount.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file contains all the attributes and methods specific to Checking
 * account.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

public class CheckingAccount extends AssetAccount{

	//constructor for CheckingAccount class
	public CheckingAccount(String accType,String customerName,double accBalance){
		super( accType, customerName, accBalance);
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
		interest= time*0.04*accBalance;
		accBalance+=interest;
		System.out.println(customerName+" earned $"+interest+" Interest in "+time+"months"+
			". Account balance is now  $"+accBalance);
	}
}