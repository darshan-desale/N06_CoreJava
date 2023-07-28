//Program to demonstrate on encapsulation
package org.tnsif.encapsulation;

public class EncapsulationExecutor 
{

	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		h.setAccType("Saving");
		h.setAccNo(123456789);
		h.setAtmCardNo(987654321);
		h.setPinNo(1234);
		
		System.out.println(h.getAccNo());
		
		System.out.println(h);
		
	}

}
