package org.tnsif.hierarchical;
import java.util.*;
public class DriverClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PetrolCar p=new PetrolCar("BMW","MRF","Petrol",22);
		DieselCar d=new DieselCar("BMW","MRF","Diesel",15);
		System.out.println(p);
		System.out.println(d);
		

	}

}
