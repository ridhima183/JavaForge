package collectionsdemo;
/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :4:15:22 pm
*email :ridhima.gadalay@gmail.com
*/
public class Blog {
	
	private int blogId;
    private String title;
    private String author;
    private String content;
    
    // generate constructors 
    
	public Blog(int blogId, String title, String author, String content) {
		super();
		this.blogId = blogId;
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	//getters
	
	public int getBlogId() {
		return blogId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getContent() {
		return content;
	}
	
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setContent(String content) {
		this.content = content;
	}

	//toString()
	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", title=" + title + ", author=" + author + ", content=" + content + "]";
	}
    
}
