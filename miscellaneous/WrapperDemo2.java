package miscellaneous;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :4:22:17 pm
*email :ridhima.gadalay@gmail.com
*/
public class WrapperDemo2 {
	
	public static void main(String[] args) {
		
		 // 1️⃣ Primitive data types
	    int num = 100;
	    double price = 99.75;
	    char grade = 'A';
	    boolean status = true;

	    // 2️⃣ Converting primitives to Wrapper objects (Boxing)
	    Integer objNum = Integer.valueOf(num);
	    Double objPrice = Double.valueOf(price);
	    Character objGrade = Character.valueOf(grade);
	    Boolean objStatus = Boolean.valueOf(status);

	    System.out.println("=== Boxing (Primitive → Object) ===");
	    System.out.println("Integer object: " + objNum);
	    System.out.println("Double object: " + objPrice);
	    System.out.println("Character object: " + objGrade);
	    System.out.println("Boolean object: " + objStatus);

	    // 3️⃣ Auto-Boxing (automatic conversion)
	    Integer autoNum = num;
	    Double autoPrice = price;
	    System.out.println("\n=== Auto-Boxing ===");
	    System.out.println("Auto-boxed Integer: " + autoNum);
	    System.out.println("Auto-boxed Double: " + autoPrice);

	    // 4️⃣ Unboxing (Object → Primitive)
	    int newNum = objNum.intValue();
	    double newPrice = objPrice.doubleValue();
	    char newGrade = objGrade.charValue();
	    boolean newStatus = objStatus.booleanValue();

	    System.out.println("\n=== Unboxing (Object → Primitive) ===");
	    System.out.println("Integer value: " + newNum);
	    System.out.println("Double value: " + newPrice);
	    System.out.println("Character value: " + newGrade);
	    System.out.println("Boolean value: " + newStatus);

	    // 5️⃣ Auto-Unboxing (automatic conversion)
	    int autoNewNum = autoNum;
	    double autoNewPrice = autoPrice;
	    System.out.println("\n=== Auto-Unboxing ===");
	    System.out.println("Auto-unboxed Integer: " + autoNewNum);
	    System.out.println("Auto-unboxed Double: " + autoNewPrice);
	    
	    
	    

	}

}
		
	
	