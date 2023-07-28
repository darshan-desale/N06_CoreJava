/*
 * There are n people standing in a circle waiting to be executed. The counting out begins at some point in 
 * the circle & proceeds around the circle in the fix direction.
 * In each step, a certain no of peoples are skipped & next person is executed.
 * the elimination proceeds around the circle (which is becoming smaller and smaller as the executed peoples
 * are removed), until only the last person remains, who is given freedom.
 * Given the total no of person n & no K which indicates that k-1 person are skipped & k'th person is killed
 * in the circle. The task is to choose the person in the initial circle that survives. 
 */
package org.tnsif.dayfourchallenge;
import java.util.*;
public class CircleSurviveChallenge 
{
	public static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
		{
			return (survive(n-1,k)+k-1)%n+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n & K");
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(survive(n,k));
		survive(n,k);
		sc.close();
	}

}
