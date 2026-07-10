package oopsdemo2;

/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :4:20:16 pm
*email :ridhima.gadalay@gmail.com
*/
public class MultiLevelDemo1 {
	
	public static void main(String[] args) {
		
		Director d1 = new Director(101, "keane", 5000,0);
		
		System.out.println("*************** Director Details *****************");
		
		d1.display(); // Staff
		d1.getHRA(); //Staff
		d1.getDA(); //manager
		d1.getTA(); //director 
		d1.getGross(); //director 
		
		Manager m1 = new Manager(201,"Mary",4000,0);
		
		System.out.println("************** Manager Details *********************");
		
		m1.display();
		m1.getHRA(); //Staff
		m1.getDA(); //manager
		m1.getDA(); //manager
		m1.getGross(); //manager
		
		Staff s1 = new Staff(301,"Helen",2000,0);
		System.out.println("*************** Staff Details ***********************");
		s1.display();
		s1.getHRA();
		s1.print();
		
		
	
	}

}
