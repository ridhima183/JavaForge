package miscellaneous;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :4:24:35 pm
 *email :ridhima.gadalay@gmail.com
 */
public class converse {

	void tobeConvert() {
		String binary, hex, octal;
		int num = 100;

		binary = Integer.toBinaryString(num);
		hex = Integer.toHexString(num);
		octal = Integer.toOctalString(num);

		System.out.println("Decimal value : " + num);
		System.out.println("Binary equivalent = " + binary);
		System.out.println("Hexadecimal equivalent = " + hex);
		System.out.println("Octal equivalent = " + octal);
	}
	
	public static void main(String[] args) {
		
		converse c=new converse();
		c.tobeConvert();

		System.out.println(Integer.sum(20, 30));
		System.out.println(Integer.max(30,50));
		System.out.println(Integer.min(30,50));

		System.out.println(Double.sum(34000.50, 55000.35));

		
	}

	
}
