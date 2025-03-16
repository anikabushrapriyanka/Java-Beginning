public class MobileMain{
	public static void main(String[]args){
		Mobile mobile1=new Mobile("Raivee","01435672341",100.0,"iPhone",false);
		Mobile mobile2=new Mobile("Daina","01489672341",70,"iPhone",true);
		Mobile mobile3=new Mobile("Aklaz","01435765341",20.0,"Android",false);
		Mobile mobile4=new Mobile("Priyanka","01435072341",100.0,"Android",true);
		
		mobile1.showDetails();
		mobile1.recharge(100);
		mobile1.adjustAfterCall(10,5);
		
		mobile2.showDetails();
	    mobile2.recharge(30);
	    mobile2.adjustAfterCall(5,2);

        mobile3.showDetails();
	    mobile3.recharge(50);
		mobile3.adjustAfterCall(10,3);
 
        mobile4.showDetails();
	 	mobile4.recharge(10);
	    mobile4.adjustAfterCall(2,5);



	}
}