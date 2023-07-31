package org.tnsif.thiskeyword;

class Team
{
	int size;
	Team()
	{
		this(15);
		System.out.println("Default Constructor");
	}
	Team(int size)
	{
		System.out.println("Parameterized Constructor: "+size);
		this.size=size;
	}
}
public class ThisKeyword3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Team t =new Team();

	}

}
