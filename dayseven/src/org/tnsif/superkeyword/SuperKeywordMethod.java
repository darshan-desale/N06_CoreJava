package org.tnsif.superkeyword;

class Desh
{
	int id=13;
	String name="India";
	
	void disp()
	{
		System.out.println("Parent class method.");
		System.out.println(id);
		System.out.println(name);
	}
}
class Rajya extends Desh
{
	int id=20;
	String name="Maharashtra";
	
	
	/*
	 * if parent class and child class methods name are same then you can access parent class method by using super.method name
	 */
	void disp()
	{
		super.disp();
		System.out.println("Child class method.");
		System.out.println(id);
		System.out.println(name);
	}
}
public class SuperKeywordMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rajya st=new Rajya();
		st.disp();
		
	}

}
