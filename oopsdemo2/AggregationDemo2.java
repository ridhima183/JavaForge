package oopsdemo2;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :9:58:34 am
*email :ridhima.gadalay@gmail.com
*/
public class AggregationDemo2 {
	
	public static void main(String[] args) {
		
		Author author = new Author ("John",42,"USA");
		Publisher publisher = new Publisher ("Sun Publications", "JDSR-III4", "LA");
		
		//Create Book Object & associate with Author & Publisher Objects
		
		Book b = new Book("Java For Begginers", 800, author, publisher);
		
		b.display();
		
	}

}

