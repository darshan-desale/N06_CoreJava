package org.tnsif.singleinheritance;

public class Student extends Citizen
{
	private int rollNo;
	private String collegeName;
	
	//getters and setters method
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Class
	public Student(String city, int pinCode, int adharNo, String area,int rollNo,String collegeName) {
		super(city, pinCode, adharNo, area);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getCity()=" + getCity()
				+ ", getPinCode()=" + getPinCode() + ", getAdharNo()=" + getAdharNo() + ", getArea()=" + getArea()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
}
