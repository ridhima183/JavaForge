package oopsdemo3;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :10:40:32 am
*email :ridhima.gadalay@gmail.com
*/
public class MethodOverloadDemo {
	
	public static void main(String[] args) {
		Addition a1 = new Addition();
		
		//invoking add() overload methods
		
		a1.add();
		a1.add(20,30);
		a1.add(34.75f, 542.65f); //type promotion -Float --> 
		a1.add(200,300,500);
		a1.add("Hello", "world");
		//a1,add(10);  compiler error: no suitable methof found for add(int);
	}

}
