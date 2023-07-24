//Program to demonstrate cascaded if else statement
package org.tnsif.decisionmaking;
import java.util.*;
class CascadedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 ages: ");
		int age1=sc.nextInt();
		int age2=sc.nextInt();
		int age3=sc.nextInt();
		if(age1>age2 && age1>age3)
		{
			System.out.println("Age 1 is greater & it is :"+age1);
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("Age 2 is greater & it is :"+age2);
		}
		else
		{
			System.out.println("Age 3 is greater & it is :"+age3);
		}
		sc.close();
		
	}

}
