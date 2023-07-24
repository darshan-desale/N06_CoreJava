package org.tnsif.decisionmaking;
import java.util.*;
public class BungyJumping 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age & weight: ");
		int age=sc.nextInt();
		int wt=sc.nextInt();
		if(age>=12)
		{
			if(wt>=50)
			{
				System.out.println("Can do Bungy Jumping");
				if(wt>=110)
				{
					System.out.println("Extra Ropes will be Added.");
				}
				else
				{
					System.out.println("Cannot do Bungy Jumping.");
				}
		
		    }
		}
		else
		{
			System.out.println("Cannot do Bungy Jumping.");
		}
		sc.close();

	}

}

