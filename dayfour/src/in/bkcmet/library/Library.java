package in.bkcmet.library;

public class Library 
{
	//different access specifiers
	public int noOfBooks;
	private int userId;
	String bookName;
	
	public void dispNoOfBooks()
	{
		System.out.println("No of books are "+noOfBooks);
	}
	
	private void dispUserId()
	{
		System.out.println("User id is "+userId);
	}
	  
	void dispBookName()
	{
		System.out.println("Bookname is "+bookName);
	}
}
