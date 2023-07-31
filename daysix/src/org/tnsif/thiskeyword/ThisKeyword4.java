package org.tnsif.thiskeyword;

class Country
{
	String name;
	void disp()
	{
		this.name="India";
		display(name);
	}
	void display(String name)
	{
		System.out.println("Country name is "+name);
	}
}
public class ThisKeyword4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.disp();
	}

}
