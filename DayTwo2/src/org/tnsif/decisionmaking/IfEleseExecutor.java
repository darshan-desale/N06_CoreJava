package org.tnsif.decisionmaking;
import java.util.*;
public class IfEleseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Enter your weight: ");
		int wt=sc.nextInt();
		if(age>=18 && wt>=50)
		{
			System.out.println("Eligible to donate the blood.");
		}
		else
		{
			System.out.println("Not eligible to donate the blood.");
		}
			sc.close();
	}

}
