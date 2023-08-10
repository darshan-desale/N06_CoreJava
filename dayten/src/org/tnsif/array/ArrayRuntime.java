package org.tnsif.array;
import java.util.*;
public class ArrayRuntime 
{

	public static void greaterElement(int arr[])
	{
		int n=arr.length;
		int maxElement=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>maxElement)
			{
				maxElement=arr[i];
			}
			if(arr[i]<maxElement && arr[i]>secondMax)
			{
				secondMax=arr[i];
			}
		}
		System.out.println("Max element from the array is :"+secondMax);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		greaterElement(arr);
		
		sc.close();

	}

}
