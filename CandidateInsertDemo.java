package jdbcdemo;
import java.util.Scanner;

/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 3:07:40 PM
 * Email : sirinandini.a@gmail.com
 */

public class CandidateInsertDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CandidateDAO dao = new CandidateDAO();

		System.out.println("==================================");
		System.out.println(" Candidate Registration System");
		System.out.println("==================================");

		System.out.print("How many candidate records do you want to insert? ");

		int count = sc.nextInt();
		sc.nextLine(); // consume newline

		for (int i = 1; i <= count; i++) {

			System.out.println("\nEnter Candidate " + i + " Details");

			Candidate candidate = new Candidate();

			System.out.print("First Name : ");
			candidate.setFirstName(sc.nextLine());

			System.out.print("Last Name  : ");
			candidate.setLastName(sc.nextLine());

			System.out.print("DOB (yyyy-mm-dd) : ");
			candidate.setDob(sc.nextLine());

			System.out.print("Phone Number : ");
			candidate.setPhone(sc.nextLine());

			System.out.print("Email : ");
			candidate.setEmail(sc.nextLine());
			
			

			boolean status = dao.insertCandidate(candidate);

			if (status) {
				System.out.println("✅ Candidate " + i + " inserted successfully.");
			} else {
				System.out.println("❌ Failed to insert Candidate " + i);
			}
		}

		System.out.println("\n==================================");
		System.out.println("All records processed.");
		System.out.println("==================================");

		sc.close();

	}

}
