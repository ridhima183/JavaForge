package oopsdemo4;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :9:34:46 am
*email :ridhima.gadalay@gmail.com
*/
public interface TwitterOperations {
	
	void login();

    void postTweet(String tweet);

    void likeTweet(int likes);

    void followUser(String username);

    void logout();

}
