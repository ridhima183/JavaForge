package newfeatures;
/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :2:17:34 pm
*email :ridhima.gadalay@gmail.com
*/
public class Car implements Vehicle{
	private String brand;
	
	Car(String brand)
	{
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Car is speeding up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Car is slowing down";
	}
	
	
	

}
