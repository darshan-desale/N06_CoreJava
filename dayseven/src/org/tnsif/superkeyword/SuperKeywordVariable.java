package org.tnsif.superkeyword;

class Country
{
	int id=12;
	String name="India";
}
class State extends Country
{
	int id=14;
	String name="Maharashtra";
	void print()
	{
		/*
		 * If parent class and child class variables name are same and you want to access parent class variables then use super keyword with
		 * variable.
		 */
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperKeywordVariable 
{


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		State st=new State();
		st.print();
	}

}
