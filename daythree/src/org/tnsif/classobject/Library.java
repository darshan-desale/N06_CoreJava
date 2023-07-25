//Program to demonstrate default and parameterized constructor
package org.tnsif.classobject;
//class declaration
public class Library 
{
	public long noOfBooks;
	public String authorName;
	public int price;
	
	//Parameterized Constructor
   
	public Library() {
		super();
		System.out.println("Dafault Constructor.");

		// TODO Auto-generated constructor stub
	}
	public Library(long noOfBooks, String authorName, int price) 
	{
		System.out.println("Parameterized Constructor.");
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", price=" + price + "]";
	}
}