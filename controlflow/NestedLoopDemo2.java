package controlflow;
/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :12:23:07 pm
*email :ridhima.gadalay@gmail.com
*/
public class NestedLoopDemo2 {
	public static void main(String[] args) {
		int weeks=3, days=7, i=1;
        while (i<=weeks){ //Outer Loop
            System.out.println("Week :"+i); // 3 times

            for (int j = 1; j <=days ; j++) {  // Inner Loop  7 times

                System.out.println("\t"+"Day :"+j);
            }
        i=i+1;
    }
	}

}
