package org.tnsif.hierarchical;

public class DieselCar extends Car
{

	private String modeOfFuelD;
	private int mileage;
	public DieselCar(String brandName, String wheelBrand,String modeOfFuelD,int mileage)
	{
		super(brandName, wheelBrand);
		this.modeOfFuelD=modeOfFuelD;
		this.mileage=mileage;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DieselCar [modeOfFuelD=" + modeOfFuelD + ", mileage=" + mileage + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
}
