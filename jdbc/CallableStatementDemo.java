package jdbcdemo;
import java.util.Scanner;
/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 4:18:22 PM
 * Email : sirinandini.a@gmail.com
 */

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			Skills s=new Skills();
			Scanner scan=new Scanner(System.in);

			System.out.println("Enter Candidate Details to get Skills:");

			System.out.println("Enter Candidate Id : ");
			int id=scan.nextInt();

			s.getSkils(id); //Invokes getSkills method to call stored procedure
			scan.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
