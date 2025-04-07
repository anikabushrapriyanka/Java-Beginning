public class Savings extends Account{
	public Savings(){}
	public Savings(String accountNumber,String accountHolderName, double balance,double interestRate){
		super(accountNumber,accountHolderName,balance,interestRate);
		
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
		}
		else{
			System.out.println("Invalid deposit amount");
		}
		
	}
	public void withdraw(double amount){
		if(amount>0 && amount<=getBalance()){
			balance -=amount;
		}
		else{
			System.out.println("Invalid Withdraw amount");
		}
	}
	
}