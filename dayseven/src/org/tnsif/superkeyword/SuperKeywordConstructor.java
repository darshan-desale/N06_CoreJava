package org.tnsif.superkeyword;

class Google 
{
	String ceo="Sundar Pichai";
	String serverCapacity="1PetaByte";
	public Google(String ceo, String serverCapacity) {
		System.out.println("Parameterized Parent");
		this.ceo = ceo;
		this.serverCapacity = serverCapacity;
	}
	
	
}

class GoogleMap extends Google
{
	String userId="darshandesale@gmail.com";

	public GoogleMap(String ceo, String serverCapacity, String userId) {
		//calling to parent class parameterized constructor

		super(ceo, serverCapacity);
		System.out.println("Parameterized child");
		this.userId = userId;
	}
	
	
}
public class SuperKeywordConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleMap gm=new GoogleMap("Sundar","tb","123456789");

	}

}
