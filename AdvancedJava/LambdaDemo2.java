package newfeatures;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :10:35:21 am
 *email :ridhima.gadalay@gmail.com
 *Block Lambda Expression
 */
public class LambdaDemo2 {
	public static void main(String[] args) {

		//lambda expression to reverse a string
		MyString reverseStr = (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		
		System.out.println(reverseStr.myStringFunction("Lambda Expression"));
		System.out.println(reverseStr.myStringFunction("Madam"));
		System.out.println(reverseStr.myStringFunction("Hello World Java"));
		
		//lambda Expression with single parameter 
	    MyString myName = (name) -> {return "Hello "+name;};
	    
	    System.out.println(myName.myStringFunction("ridhima"));
	    
	    //lambda expression with single parameter with no parenthesis 
	    
	    MyString myName1 = name -> {return "hello " +name;};
	    
	    System.out.println(myName1.myStringFunction("James Gosling"));
	    
	    MyString lenString = (str) -> { return "the Length of " +str+ " is : " +str.length();};
	    System.out.println(lenString.myStringFunction("Lambda Expression"));
	    System.out.println(lenString.myStringFunction("James Gosling"));
	    System.out.println(lenString.myStringFunction("RIdhima"));
	    
	    
	}
	
}

