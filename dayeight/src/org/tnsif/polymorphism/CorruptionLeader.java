package org.tnsif.polymorphism;
//method overriding
class CM
{
	public static void Corruption(int amount)
	{
		System.out.println("Amount corrupted by CM "+amount);
	}
	
}
class MLA extends CM
{
	public static void Corruption(int amount)
	{
		System.out.println("Amount corrupted by MLA "+amount);	
	}
}
public class CorruptionLeader 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MLA.Corruption(150000);
		CM.Corruption(50000);
	}
	
	

}
