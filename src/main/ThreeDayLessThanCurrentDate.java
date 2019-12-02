package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ThreeDayLessThanCurrentDate {
	private static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
	
	public static void main(String args[]) {
	  
	GregorianCalendar cal = new GregorianCalendar(); // See note below.
	  
	cal.setLenient(false);
	  
	cal.roll(Calendar.DAY_OF_MONTH, -3);
	  
	System.out.println(cal.getTime());
	  
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	String date = simpleDateFormat.format(new Date());
	System.out.println(date);
	
	Date d = new Date();
	String date2 = simpleDateFormat.format(d.getTime()-3*MILLIS_PER_DAY);
	System.out.println(d.getTime()-3*MILLIS_PER_DAY);
	System.out.println(date2);
	  
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    