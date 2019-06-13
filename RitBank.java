/*
 * RitBank.java
 *
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       3
 */

/**
 * This is a bank program that can have a checking, savings, and credit card 
 * account and do various functions on these account.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

import java.util.Scanner;

public class RitBank{

	//Declaring array of objects to save the account details.
	static BankAccount[] b1  = new BankAccount[15]; 
		
	/**
 	* The main program.
 	*
 	* @param    args    command line arguments (ignored)
 	*/
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		boolean yes=true;
		String choice;
		int type;
		String name;
		int noOfAccounts=0;
		String acountno;
		double amount;
		int time;

		while(yes){
			System.out.println("Enter one of the following commands\ntime - "
			+"pass certain amount of time\nopen - open a new account\nclose "
			+"- close an account\ncredit - credit an account\ndebit - debit an" 
			+" account\nsummary - display current bank accounts\nexit - exit "
			+"program \nWhat do you want to do?");
			choice=sc.nextLine();

			//Switch case for the choice entered.
			switch(choice){
				case"time" :
							System.out.println("Enter time in months.");
							time=sc.nextInt();
							System.out.println("SUMMARY : ");

							//Loop to print summary of all the accounts created.
							for(int i =0;i<noOfAccounts;i++){

								//null implies that the created account was 
								//closed.
								if(b1[i]==null){
									continue;
								}
								else{

								//passing the parameter time to interest method
								//in class BankAccount
									b1[i].interest(time);
								}
								System.out.println();
							}
							break;

			 	case"open" :
							System.out.println("What type of account \n0 - for savings\n"
							+"1 - for checking \n2 - for credit card?>");
							type=sc.nextInt();
							System.out.println("What is the customer's name?");
							sc.nextLine();
							name=sc.nextLine();

							double deposit;
							if(type==0){
								System.out.println("How much to deposit?");
								deposit=sc.nextInt();

								//passing the parameters to class 
								//SavingsAccount for further computation.
								b1[noOfAccounts]=new SavingsAccount("Savings "
									+"Account",name,deposit);
								noOfAccounts++;
							}
							else if(type==1){
								System.out.println("How much to deposit?");
								deposit=sc.nextInt();

								//passing the parameters to class 
								//CheckingAccount for further computation.
								b1[noOfAccounts]=new CheckingAccount("Checking"
								+" Account",name,deposit);
								noOfAccounts++;
							}
							else{
								//passing the parameters to class 
								//CreditCardqAccount for further computation.
								b1[noOfAccounts]=new CreditCardAccount("Credit"
								+" Card Account",name);
								noOfAccounts++;
							}
							break;

				case"close" :
							String deleteAccNO;
							System.out.println("Enter your account number to "
								+"close the account");
							deleteAccNO=sc.nextLine();
							for(int i =0;i<noOfAccounts;i++){

								//condition to match the account number input
								//by user and set it to null.
								if(b1[i].accNo.equals(deleteAccNO)){
									b1[i]=null;
								}
								else{
									System.out.println("Enter valid account "
									+"number.");
									break;
								}
								System.out.println();
							}
							break;

				case"credit" :
							System.out.println("Enter the account number : ");
							acountno=sc.nextLine();
							for(int i =0;i<noOfAccounts;i++){
								if(b1[i].accNo.equals(acountno)){
									System.out.println("Enter the amount to "
										+"credit :");
									amount=sc.nextInt();

									//Calling the credit function from class
									//BankAccount.
									b1[i].credit(amount);
								}
								else{
									System.out.println("Enter valid account "
										+"number.");
								}
							}
							break;

				case"debit" :
							System.out.println("Enter the account number : ");
							acountno=sc.nextLine();
							for(int i =0;i<noOfAccounts;i++){
								if(b1[i].accNo.equals(acountno)){
									System.out.println("Enter the amount to "
										+"debit :");
									amount=sc.nextInt();

									//Calling the debit method from class
									//BankAccount.
									b1[i].debit(amount);
								}
								else{
									System.out.println("Enter valid account "
										+"number.");
								}
							}
							break;

				case"summary":
							System.out.println("SUMMARY : ");
							for(int i =0;i<noOfAccounts;i++){

								//if condition for closed account to not print
								//summary
								if(b1[i]==null){
									continue;
								}
								else{
									b1[i].printSummary();
								}
							System.out.println();
							}
							break;

				case"exit" :yes=false;
							System.exit(0);
				}
				sc.nextLine();
		}		
	}
}