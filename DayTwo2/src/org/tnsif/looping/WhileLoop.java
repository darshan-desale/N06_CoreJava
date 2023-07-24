package org.tnsif.looping;
import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		while(n!=0)
		{
			System.out.print(n+" ");
			n--;
		}
		sc.close();
	}

}
