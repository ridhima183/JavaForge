package packagedemo;

import com.coforge.training.microsoft.OperatingSystem;
import com.coforge.training.oracle.database;

/**
*Author : user
*Date : Jul 9, 2026
*Time : 3:35:08 PM
*Email : thejaswinivini@gmail.com
*/

public class SoftwareList {
	
	public static void main(String[] args) {
		
		database db1=new database();
		OperatingSystem os1 = new OperatingSystem();
		
		System.out.println("**********database softwares*********");
		db1.printDatabaseSoftware();
		
		System.out.println("*************OS*********************");
		
		os1.listSoftware();
				
	}

}