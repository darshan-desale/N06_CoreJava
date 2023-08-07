package org.tnsif.finalkeyword;

public class FinalVariable 
{

	//final variable must be initialized during declaration
	//final int x;
	final float SALARY=67000.8f;
	
	//We cannot change the value of final variable
	/*
	 * void print()
	 * {
	 * 		SALARY=1200;
	 * }
	 */
	void print()
	{
		System.out.println("Salary is "+SALARY);
	}

}
