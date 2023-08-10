package org.tnsif.array;
//Program to demonstrate array using compile time input
public class ArrayExample 
{

	public static void main(String[] args) 
	{
		//Array initialization at the compile time
		int arr[]= {66,33,22,55,11};
		System.out.println(arr[1]);
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}

}
