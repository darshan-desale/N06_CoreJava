package org.tnsif.staticKeyword;


class Employee
{
	private int empId;
	private String name;
	private static String companyName="TNSIF";
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	void display()
	{
		System.out.println("Emp id"+this.getEmpId()+"Employee Name is "+this.getName()+" and the Company Name is "+getCompanyName());
	}
	
	
	
}
public class StaticVariable 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.setEmpId(12);
		e.setName("Darshan");
		e.display();
		
		Employee e1=new Employee();
		e1.setEmpId(14);
		e1.setName("Jayesh");
		e1.display();
		
	}

}
