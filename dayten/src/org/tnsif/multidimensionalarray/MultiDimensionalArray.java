package org.tnsif.multidimensionalarray;
import java.util.*;
public class MultiDimensionalArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		System.out.println("Enter the elements in Array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Multi Dimensional Array : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
