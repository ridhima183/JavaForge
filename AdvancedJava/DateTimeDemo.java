package newfeatures;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :12:46:51 pm
 *email :ridhima.gadalay@gmail.com
 */
public class DateTimeDemo {

	public static void main(String[] args) {

		// Legacy class to deal with date & Time
		Date d1 = new Date();
		System.out.println(d1);
		
		// FIXED: Using Calendar to prevent deprecated method warnings
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1); 
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + " : " + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

		// Calendar Class
		System.out.println(cal.getTime());

		System.out.println("********** Java 8 Date & Time Classes ************");

		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();

		System.out.println("Date & Time is : " + d + " -->" + t );
		System.out.println("Before Formatting :" + dt);

		LocalDateTime dt2 = dt.minusDays(100);
		System.out.println(dt2);

		LocalDateTime dt3 = dt.plusDays(50);
		System.out.println(dt3);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd-MMM-yyyy HH:mm:ss");
		String formattedDt1 = dt.format(format); // Renamed variable for clarity
		System.out.println("After Formatting : " + formattedDt1);

		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEE dd-MMMM-yyyy HH:mm:ss");
		String formattedDt5 = dt.format(format1); // Renamed variable for clarity
		System.out.println("After Formatting : " + formattedDt5);

		// Java Clock class
		Clock c1 = Clock.systemDefaultZone();
		System.out.println(c1.getZone());

		// Zoned Date time to deal with various time zones
		ZoneId z1 = ZoneId.of("Asia/Tokyo");
		LocalTime t1 = LocalTime.now(z1);
		System.out.println("Japan Time is :" + t1);

		// Zoned Date time to deal with various time zones
		ZoneId z3 = ZoneId.of("Europe/Berlin");
		LocalTime t3 = LocalTime.now(z3);
		System.out.println("Germany Time is :" + t3);

		ZonedDateTime z2 = ZonedDateTime.now();
		System.out.println(z2.getZone() + " " + z2.getDayOfWeek());
		System.out.println(z2);
	}
}
