//Program to demonstrate on encapsulation
/*
 * Encapsulation achieves a data hiding using private access specifiers
 */
package org.tnsif.encapsulation;

public class HDFC 
{
	//Variable declaration
	private String accType;
	private long accNo;
	private long atmCardNo;
	private int pinNo;
	
	//Getter & Setter Methods
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accNo=" + accNo + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo + "]";
	}
	
	
}
