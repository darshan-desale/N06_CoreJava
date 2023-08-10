package org.tnsif.array;
import java.util.*;
class Employees
{
	int id;
	String name;
	float Salary;
	
	Employees()
	{
		
	}
	Employees(int id,String name,float Salary)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employees emp[]=new Employees[4];
		
		emp[0]=new Employees(1,"Darshan",45000);
		/*
	    for(int i=0;i<4;i++)
		{
			emp[i].id=sc.nextInt();
			emp[i].name=sc.nextLine();
			emp[i].Salary=sc.nextFloat();
		}
		*/
		System.out.println(emp[0].getId());
		System.out.println(emp[0].getName());
		System.out.println(emp[0].getSalary());

		sc.close();
	}

}
