//Program to demonstrate Switch Case
package org.tnsif.decisionmaking;
import java.util.*;
public class SwitchExecute 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the song no: ");
		int songno=sc.nextInt();
		switch(songno)
		{
		    case 1:
		    {
		    	System.out.println("Jaanatein Kahan.");
		    	break;
		    }
		    case 2:
		    {
		    	System.out.println("Desi Kalakar.");
		    	break;
		    }
		    case 3:
		    {
		    	System.out.println("Ghungroo.");
		    	break;
		    }
		    default:
		    {
		    	System.out.println("Please enter valid ");
		    }
		}
		sc.close();

	}

}
