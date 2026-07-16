package newfeatures;
/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :2:09:57 pm
*email :ridhima.gadalay@gmail.com
*/
public interface Vehicle {
	
	//by default all are abstract methods
		String getBrand();
		String speedUp();
		String slowDown();
	 
	  // Any non-abstract methods must be made default to add any new feature
		default String turnAlarmOn()
		{
			return "turning the Vehicle Alarm ON.";
		}
		default String turnAlarmOff()
		{
			return "Turning the Vehicle Alarm OFF.";
		}
		static int getHorsePower(int rpm,  int torque)
		{
			return (rpm*torque)/5252;
		}
}
