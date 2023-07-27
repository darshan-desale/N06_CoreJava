package org.tnsif.hierarchical;

public class PetrolCar extends Car
{
	private String modeOfFuelP;
	private int mileage;
	public PetrolCar(String brandName, String wheelBrand ,String modeOfFuelP,int mileage) {
		super(brandName, wheelBrand);
		this.modeOfFuelP=modeOfFuelP;
		this.mileage=mileage;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PetrolCar [modeOfFuelP=" + modeOfFuelP + ", mileage=" + mileage + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
}
