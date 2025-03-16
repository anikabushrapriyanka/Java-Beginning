public class Contact{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	public Contact(){
		System.out.println("E-Constructor");
	}
	public Contact(String personName,String personId, int age, String mobileNumber, char gender){
		this.personName=personName;
		this.personId=personId;
		this.age=age;
		this.mobileNumber=mobileNumber;
		this.gender=gender;
	}
	public void setPersonName(String personName){
		this.personName=personName;
	}
	public String getPersonName(){
		return personName;
	}
	public void setPersonId(String personId){
		this.personId=personId;
	}
	public String getPersonId(){
		return personId;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setGender(char gender){
		this.gender=gender;
	}
	public char getGender(){
		return gender;
	}
	public void showDetails(){
		System.out.println("Person Name: "+personName);
		System.out.println("Person Id: "+personId);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileNumber);
		System.out.println("Gender: "+gender);
	}
	public void showOperator(){
		if(mobileNumber.charAt(2)=='7'){
			System.out.println("GP");
		}
		else if(mobileNumber.charAt(2)=='8') {
			System.out.println("Robi");
		}
		else{
			System.out.println("Unknown Operator");

		}
    }
		
	
}