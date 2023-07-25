//Program to demonstrate the class declaration
package org.tnsif.classobject;
//class declaration
public class Employee 
{
	//default data members
	private int empId=5;
	String empName;
	float salary;
	String department;
	
	//method declaration & definition
	void display()
	{
		System.out.println("Emp Id is "+empId+" Emp Name is "+empName+" & Salary is "
	                        +salary+" Department is "+department+".");
	}
	
}
