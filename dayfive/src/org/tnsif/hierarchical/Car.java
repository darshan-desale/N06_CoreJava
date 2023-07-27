package org.tnsif.hierarchical;

public class Car 
{
	private String brandName;
	private String wheelBrand;
	
	public Car(String brandName, String wheelBrand) {
		super();
		this.brandName = brandName;
		this.wheelBrand = wheelBrand;
	}

	@Override
	public String toString() {
		return "Car [brandName=" + brandName + ", wheelBrand=" + wheelBrand + "]";
	}
	
	
	
	
}
