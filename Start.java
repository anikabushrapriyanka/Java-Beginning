public class Start{
	public static void main(String[]args){
		Account a1=new Account("12344","Anika",20000,4.5);
		a1.showDetails();
		
		Savings s1=new Savings("11111","Bushra",40000,8.5);
		s1.showDetails();
		s1.deposit(10000);
		s1.deposit(6000);
		s1.withdraw(2000);
		s1.withdraw(900);
		s1.showDetails();
		
		OverDraft od=new OverDraft("12345","Priyanka",50000,2.5,1000);
		od.showDetails();
		od.withdraw(700);
		od.showDetails();
		od.withdraw(800);
		od.showDetails();
		
	}
}