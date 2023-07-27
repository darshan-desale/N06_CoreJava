package org.tnsif.singleinheritance;

public class Citizen 
{
	private String city;
	private int pinCode;
	private int AdharNo;
	private String area;
	
	
	public Citizen() {
		System.out.println("Citizen Parent Class");
		// TODO Auto-generated constructor stub
	}
	public Citizen(String city, int pinCode, int adharNo, String area) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		AdharNo = adharNo;
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getAdharNo() {
		return AdharNo;
	}
	public void setAdharNo(int adharNo) {
		AdharNo = adharNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pinCode=" + pinCode + ", AdharNo=" + AdharNo + ", area=" + area + "]";
	}
	
	
}
