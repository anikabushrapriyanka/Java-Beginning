public class ContactMain{
	public static void main(String[]args){
		Contact contact1=new Contact("Anika","123",20,"0176682901",'F');
		Contact contact2=new Contact("Bushra","345",21,"0186682901",'F');
		Contact contact3=new Contact("Zarif","128",24,"0196682901",'M');
		Contact contact4=new Contact("Ibraj","189",14,"0176682901",'M');
		
		contact1.showDetails();
		contact1.showOperator();

		contact2.showDetails();
		contact2.showOperator();

		contact3.showDetails();
		contact3.showOperator();

		contact4.showDetails();
		contact4.showOperator();
		
		
		
		
	}
}