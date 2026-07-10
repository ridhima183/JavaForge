package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :10:12:36 am
 *email :ridhima.gadalay@gmail.com
 */
public class QuestionPaper {

	private String syllabus;
	private int totalQuestions;

	//generate constructors using fields 
	
	public QuestionPaper(String syllabus, int totalQuestions) {
		super();
		this.syllabus = syllabus;
		this.totalQuestions = totalQuestions;
	}

	public void displayQuestionPaperDetails() {
		System.out.println("Syllabus          : " + syllabus);
		System.out.println("Total Questions   : " + totalQuestions);
	}
}
