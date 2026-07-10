package oopsdemo4;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :10:19:48 am
*email :ridhima.gadalay@gmail.com
*/
public class MultipleSocialNetworkingDemo {
	
	public static void main(String[] args) {
		
		 // Array of Objects
        SocialMediaUser users[] = new SocialMediaUser[3];

        users[0] = new SocialMediaUser(101, "Rajashekar", "raja@gmail.com");
        users[1] = new SocialMediaUser(102, "Amit", "amit@gmail.com");
        users[2] = new SocialMediaUser(103, "Sneha", "sneha@gmail.com");

        // Process each user
        for (SocialMediaUser user : users) {

            user.login();

            user.createPost("Enjoying my vacation at Goa!");
            user.createPost("Learning Java Interfaces.");

            user.sendFriendRequest("Rahul");
            user.sendFriendRequest("Kiran");

            user.likePost(45);
            user.likePost(20);

            user.displayProfile();

            user.logout();

            System.out.println();
        }

	}

}
