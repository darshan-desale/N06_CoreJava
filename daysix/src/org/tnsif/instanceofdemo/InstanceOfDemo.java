package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode;
	protected String location;
}
class SBI extends RBI
{

	String ifscCode="SBIN0002161";
	String location;
	public SBI()
	{
		super.ifscCode="RBIS0NGPA01";
		super.location="Banglore";
		ifscCode="SBIN0002161";
		location="Pune";
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
		System.out.println(location);
		System.out.println(super.location);

	}
}
public class InstanceOfDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SBI s=new SBI();
		System.out.println(s instanceof RBI);
		System.out.println(s instanceof SBI);

	}

}
