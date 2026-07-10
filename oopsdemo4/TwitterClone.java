package oopsdemo4;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :9:46:01 am
*email :ridhima.gadalay@gmail.com
*/
public class TwitterClone {
	
	public static void main(String[] args) {
		//Array Objects 
		TwitterUser users[] = new TwitterUser[3];
		users[0] = new TwitterUser(101, "Rajshekar", "xyz@email.com");
		users[1] = new TwitterUser(102, "amit", "amit@email.com");
		users[2] = new TwitterUser(103, "sheja", "sheja@email.com");
		
		// Processing array of objects 
		
		for (TwitterUser user : users) {
			
			user.login();
			
			user.postTweet(("Learning Java Interfaces"));
			user.postTweet(("Today was a productive day"));
			
			user.followUser("OpenAI");
			user.followUser("Java");
			
			user.likeTweet(25);
			user.likeTweet(15);
			
			user.displayProfile();
			
			user.logout();
			
			System.out.println();
		}
			
		
	}

}
