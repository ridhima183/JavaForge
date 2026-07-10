package oopsdemo4;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :10:01:27 am
*email :ridhima.gadalay@gmail.com
*these interfaces are by default abstract
* * Social Media User Management System
*/
public interface IUserOperations {
	
	void login();
	void logout();

}

interface ISocialFeatures{
	void createPost(String post);
	void sendFriendRequest(String friendName);
	void likePost(int likes);
}

