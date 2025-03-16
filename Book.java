public class Book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	private  static int uniqueBookCounter=0;
	public Book(){
		System.out.println("E-Constructor");
		uniqueBookCounter ++ ;
	}
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy){
		System.out.println("P-Constructor");
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookId=bookId;
		this.bookType=bookType;
		this.bookCopy=bookCopy;
		uniqueBookCounter ++ ;
	}
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	public String getBookName(){
		return bookName;
	}
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	public void setBookId(String bookId){
		this.bookId=bookId;
	}
	public String getBookId(){
		return bookId;
	}
	public void setBookType(String bookType){
		this.bookType=bookType;
	}
	public String getBookType(){
		return bookType;
	}
	public void setBookCopy(int bookCopy){
		this.bookCopy=bookCopy;
	}
	public int getBookCopy(){
		return bookCopy;
	}
	public void showDetails(){
		System.out.println("Book Name: "+bookName);
		System.out.println("Book Author: "+bookAuthor);
		System.out.println("Book Id: "+bookId);
		System.out.println("Book Type: "+bookType);
		System.out.println("Book Copy: "+bookCopy);

	}
    public void addBookCopy(int x){
		this.bookCopy = this.bookCopy+x;
	
		
	}
	public static void totalNumberOfUniqueBooks(){
		System.out.println("Total Number of Unique Books: "+ uniqueBookCounter);
	}
	
}