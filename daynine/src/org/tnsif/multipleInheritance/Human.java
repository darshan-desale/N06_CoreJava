package org.tnsif.multipleInheritance;
//Implementable Class
public class Human implements ColdDrink,AlcholDrink
{

	@Override
	public void showDrink() 
	{
		System.out.println(coldDrinkName+" , "+alcholDrinkName);
		
	}
	
}
