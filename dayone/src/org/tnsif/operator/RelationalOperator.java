package org.tnsif.operator;
import java.util.*;
public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("You are not eligible to vote.");
		}
		else if(age>=18)
		{
			System.out.println("You are eligible to vote.");
		}
		//System.out.println(5==5);
		sc.close();
	}

}
