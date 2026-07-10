package oopsdemo2;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :10:13:42 am
*email :ridhima.gadalay@gmail.com
*/
public class Exam {
	private String examName;
	private int duration;
	private QuestionPaper questionPaper; //COMPOSITION HAS-A 
	
	
	public Exam(String examName, int duration, String syllabus, int totalQuestions) {
		super();
		this.examName = examName;
		this.duration = duration;
		//QuestionPaper object created inside exam 
		this.questionPaper = new QuestionPaper(syllabus,totalQuestions);
	}
	
	  public void displayExamDetails() {
			System.out.println("Exam Name         : " + examName);
			System.out.println("Duration (Minutes): " + duration);
			questionPaper.displayQuestionPaperDetails();
		}
	
	
}
