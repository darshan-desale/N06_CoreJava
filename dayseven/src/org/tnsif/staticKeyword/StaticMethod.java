package org.tnsif.staticKeyword;


public class StaticMethod 
{
	/*
	 * static method
	 * if any method is present outside the main function then we can access it, 
	 * by making the method as static 
	 * 
	 */
	static int marks=92;
	public static void print(int id)
	{
		
		//we cannot use non static variable inside the static method.
		System.out.println(id);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(15);
	}

}
