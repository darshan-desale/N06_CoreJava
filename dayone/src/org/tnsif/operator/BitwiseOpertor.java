//Program to Demonstrate bitwise Operator
package org.tnsif.operator;

public class BitwiseOpertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8; //1000
		int y=3; //0011
		System.out.println(x & y); //0000
		System.out.println(x | y); //1011
		System.out.println(x ^ y); //1011

		//Left shift operator
		System.out.println("Left shift operator");
		System.out.println(8<<1);
		//Right shift operator
		System.out.println("Right Shift operator");
		System.out.println(8>>1);
		

	}

}
