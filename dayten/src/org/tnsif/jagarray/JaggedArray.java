package org.tnsif.jagarray;
import java.util.*;
public class JaggedArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		
//		arr[0][0]=12;
//		arr[0][1]=13;
//		arr[0][2]=13;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
