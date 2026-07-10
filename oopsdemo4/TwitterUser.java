package oopsdemo4;

/**
 * Author : Bhavna
 * Date   : 09-Jul-2026
 * Time   : 9:36:32 am
 * Email  : ridhima.gadalay@gmail.com
 */
public class TwitterUser implements TwitterOperations {

	// Attributes
	private int userId;
	private String userName;
	private String email;
	private boolean loginStatus;
	private int tweetCount;
	private int followingCount;
	private int totalLikes;

	// Constructor 
	public TwitterUser(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.loginStatus = false; // Explicit default initialization
		this.tweetCount = 0;
		this.followingCount = 0;
		this.totalLikes = 0;
	}

	@Override
	public void login() {
		if (!loginStatus) {
			loginStatus = true;
			System.out.println(userName + " logged in successfully.");
		} else {
			System.out.println(userName + " is already logged in.");
		}
	}

	@Override
	public void postTweet(String tweet) {
		if (loginStatus) {
			tweetCount++;
			System.out.println("\nTweet Posted Successfully");
			System.out.println("Tweet : " + tweet);
			System.out.println("Total Tweets : " + tweetCount);
		} else {
			System.out.println("Please login first.");
		}
	}

	@Override
	public void likeTweet(int likes) {
		if (loginStatus) {
			totalLikes += likes;
			System.out.println("Received " + likes + " likes.");
			System.out.println("Total Likes : " + totalLikes);
		} else {
			System.out.println("Please login first.");
		}
	}

	@Override
	public void followUser(String username) {
		if (loginStatus) {
			followingCount++;
			System.out.println("Started following @" + username);
			System.out.println("Following : " + followingCount);
		} else {
			System.out.println("Please login first.");
		}
	}

	@Override
	public void logout() {
		if (loginStatus) {
			loginStatus = false;
			System.out.println(userName + " logged out successfully.");
		} else {
			System.out.println("User is already logged out.");
		}
	}

	// Display Profile
	public void displayProfile() {
		System.out.println("\n==============================");
		System.out.println("User ID         : " + userId);
		System.out.println("User Name       : " + userName);
		System.out.println("Email           : " + email);
		System.out.println("Tweets          : " + tweetCount);
		System.out.println("Following       : " + followingCount);
		System.out.println("Total Likes     : " + totalLikes);
		System.out.println("Login Status    : " + (loginStatus ? "Online" : "Offline"));
		System.out.println("==============================");
	}

	// Getters and Setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public int getTweetCount() {
		return tweetCount;
	}

	public int getFollowingCount() {
		return followingCount;
	}

	public int getTotalLikes() {
		return totalLikes;
	}
}
