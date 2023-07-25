package org.tnsif.looping;
import java.util.*;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int counter=0;
		while(n!=0)
		{
			n=n/10;
			counter++;
		}
		System.out.println("No of digits are:"+counter);
		
		sc.close();
	}

}
