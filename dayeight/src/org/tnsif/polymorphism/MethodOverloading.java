package org.tnsif.polymorphism;

public class MethodOverloading 
{
	public static void disp(int no1)
	{
		System.out.println(no1);
	}
	public static void disp(int no1,int no2)
	{
		System.out.println(no1+" & "+no2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//will call display function with one parameter
		disp(11);
		//will call display function with two parameters
		disp(12,13);
	}

}
