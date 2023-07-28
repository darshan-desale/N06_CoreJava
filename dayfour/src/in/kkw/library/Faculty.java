//program to demonstrate the access specifiers

package in.kkw.library;
import in.bkcmet.library.Library;
public class Faculty 
{
	public static void main(String args[])
	{
		Library l=new Library();
		l.noOfBooks=45;
		l.dispNoOfBooks();
		
		// private variables & methods are not accessed outside the class as well as packages
		//l.userId=456123;
		//l.dispUserId();
		
		/*
		 *default variables and methods not allowed to access outside the package & allowed to access within the same package
		l.bookName="OOP";
		l.dispBookName();
		*/
	}
}
