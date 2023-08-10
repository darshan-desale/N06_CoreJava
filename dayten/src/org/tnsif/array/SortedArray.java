package org.tnsif.array;

import java.util.Scanner;
import java.util.*;
public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");;
		}
		sc.close();
	}

}
