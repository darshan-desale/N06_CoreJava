//Program to demonstrate Ternary Operator
package org.tnsif.operator;
import java.util.*;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		String res=(num%2==0)? "even":"odd";
		System.out.println("Number is "+res);
		sc.close();
	}

}
