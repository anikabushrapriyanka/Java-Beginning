public class BookMain{
	public static void main(String[]args){
		Book book1=new Book("Java","Rifat Mahmud","12","Programming",10);
		Book book2=new Book("JavaScript","Asif Mahmud","15","Programming",20);
		Book book3=new Book("Go","Badhon","20","Programming",15);
		Book book4=new Book("c#","Abdullah","10","Programming",12);
		
		book1.addBookCopy(2);
		book2.addBookCopy(5);

        book1.showDetails();
		book2.showDetails();
		book3.showDetails();
		book4.showDetails();

		Book.totalNumberOfUniqueBooks();

	}
}