package org.tnsif.customexeception;
import java.util.*;
/*
 * Program to demonstrate custom Exception
 */
public class CustomExecptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the used id:");
		String userid=sc.nextLine();
		System.out.println("Enter the password: ");
		String password=sc.nextLine();
		try
		{
			if(userid.equals("darshandesale@gmail.com") && password.equals("yes"))
			{
				System.out.println("Credentials are mathched.");
			}
			else
			{
				throw new LoginCredentials("Invalid Exception");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}
		finally
		{
			sc.close();
		}
	}

}
