package org.tnsif.interfaceExecutor;

public interface Sony 
{
	//By Default public static final
	String program="tmkoc";
	int noOfChannel=10;
	
	
	
	//Java 8 provides default and static method inside the Inteface.
	//by default abstract method
	public void display();
	
	
	//or you can make it static by manual to declare the body of the Method
	static void accept()
	{
		System.out.println("Static Method.");
	}
	
	default void show()
	{
		System.out.println("Default method");
	}
}
