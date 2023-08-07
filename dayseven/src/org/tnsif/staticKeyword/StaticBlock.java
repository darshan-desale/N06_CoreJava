package org.tnsif.staticKeyword;

public class StaticBlock 
{
	String name;
	static int id;
	
	static
	{
		/*
		 * we cannot initialize the non static variable inside the static block
		 */
		//name="Jayesh";
		id=14;
		System.out.println(id
				);
	}
	static void print()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print();
		//System.out.println(id);
	}

}
