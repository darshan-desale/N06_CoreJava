package org.tnsif.operator;
import java.util.*;
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Subtraction is: "+(num1-num2));
		System.out.println("Multiplication is: "+(num1*num2));
		System.out.println("Division is: "+(num1/num2));
		System.out.println("Modulo is :"+(num1%num2));




		sc.close();
	}

}
