public class Mobile{
	private String mobileOwnerName;
	private String mobileNumber;
	private double mobileBalance;
	private String mobileOSName;
	private boolean lock;
	public Mobile(){
		System.out.println("E-Constructor");
	}
	public Mobile(String mobileOwnerName, String mobileNumber,double mobileBalance, String mobileOSName,boolean lock){
			System.out.println("P-Constructor");
		this.mobileOwnerName=mobileOwnerName;
		this.mobileNumber=mobileNumber;
		this.mobileBalance=mobileBalance;
		this.mobileOSName=mobileOSName;
		this.lock=lock;
	}
	public void setMobileOwnerName(String mobileOwnerName){
		this.mobileOwnerName=mobileOwnerName;
	}
	public String getMobileOwnerName(){
		return mobileOwnerName;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileBalance(double mobileBalance){
		this.mobileBalance=mobileBalance;
	}
	public double getMobileBalance(){
		return mobileBalance;
	}
	public void setMobileOSName(String mobileOSName){
		this.mobileOSName=mobileOSName;
	}
	public String getMobileOSName(){
		return mobileOSName;
	}
	public void setLock(boolean lock){
		this.lock=lock;
	}
	public boolean getLock(){
		return lock;
	}
	public void showDetails(){
		if(lock==false){
			System.out.println("Mobile Owner Name: "+ mobileOwnerName);
			System.out.println("Mobile Number: "+ mobileNumber);
			System.out.println("Mobile Balance: "+ mobileBalance);
			System.out.println("Mobile OS Name: "+ mobileOSName);
		}
		else{
		    System.out.println("Mobile is locked");
		}
	}
	public void recharge(int amount){
		if(lock==false){
			this.mobileBalance=this.mobileBalance+amount;
			System.out.println("Recharged Amount: "+ amount+"New Balance: "+mobileBalance);
			}
		else{
			System.out.println("Mobile is locked");
			}
		
	}
	public float adjustAfterCall(float timeDuration,float costPerMinute){
		float cost=timeDuration*costPerMinute;

		if(lock==false){
			this.mobileBalance=this.mobileBalance-cost;
			System.out.println("Total Cost: "+ cost+"New Balance: "+mobileBalance);
			return cost;
		}
		else{
			System.out.println("Mobile is locked");
			return cost;

		}
	}
	
}