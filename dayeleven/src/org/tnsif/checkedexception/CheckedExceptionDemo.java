package org.tnsif.checkedexception;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f=new FileInputStream("D:\\CoreJava-N06\\dayeleven\\src\\org\\tnsif\\checkedexception\\demo");
		
			System.out.println("file exist!!!");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
		}
		// TODO Auto-generated method stub
	}

}
