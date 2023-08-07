package org.tnsif.finalkeyword;

public class Dell extends Laptop
{
	final String Processor="Intel i7";
	
	/*we cannot override final method
	void display()
	{
	
	
	
	}
	*/
	
	static void display(String Processors)
	{
		//Processor="Java";
		System.out.println(Processors);
	}
	static 
	{
		display();
	}

}
