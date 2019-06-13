/*
 * AssetAccount.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This is the parent class for SavingsAccount and CheckingAccount classes and
 * includes attributes and methods that are common to all these accounts.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */
public abstract class AssetAccount extends BankAccount  {
	double accBalance;

	//constructor of AssetAccount class
	public AssetAccount(String accType,String customerName,double accBalance){
		super(accType,customerName);
		this.accBalance=accBalance;
	}

	/**
 	* This method is used to credit the account with the amount passed.
 	*
 	* @param       amount    		Amount to be credited.
 	*                                    
 	* @return      accBalance      	Balance after the credit operation.
 	*/
	public double credit(double amount){
		if(this.accBalance<amount){
			System.out.println("Insufficient balance");
		}
		else{
		this.accBalance-=amount;
		}
		return accBalance;
	}

	/**
 	* This method is used to debit the amount passed.
 	*
 	* @param       amount    		Amount to be debited.
 	*                                    
 	* @return      accBalance      	Balance after the debit operation.
 	*/
	public double debit(double amount){
		this.accBalance+=amount;
		return accBalance;
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
		System.out.println("Account Balance :"+this.accBalance);
		System.out.println("Account No is :"+this.accNo);		
	}	
}