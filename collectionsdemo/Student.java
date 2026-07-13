package collectionsdemo;
/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :4:37:50 pm
*email :ridhima.gadalay@gmail.com
*/
public class Student implements Comparable<Student>{
	
	int rollno;
	String name;
	int age;
	
	//generate constructor 
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if (this.age == st.age)
			return 0;
		else if (this.age > st.age)
			return 1;
		else
			return -1;
	}
	

}
