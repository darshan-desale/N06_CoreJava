/*
 * Program to demonstrate this keyword
 * this keyword is used to refer the current instance of class
 */
package org.tnsif.thiskeyword;

class Bank
{
	long accountNo;
	Bank(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void disp()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeyword 
{

	public static void main(String[] args) 
	{
		Bank b=new Bank(12345678L);
		b.disp();
	}

}
/*
 * Program to demonstrate this keyword
 * this keyword is used to refer the current instance of class
 */
/*
package org.tnsif.thiskeyword;

class Account
{
	long accountNo;
	void setdata(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		 System.out.println(accountNo);
	}
}
public class ThisKeyword 
{

	public static void main(String[] args) 
	{
		Account a=new Account();
		//a.accountNo=123456789;
		a.setdata(123466798L);
		a.display();
	}

}
*/
