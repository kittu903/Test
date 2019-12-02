package main;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class MonthName {
public static void main(String[] args) {
	//passing month number fetching month name
	System.out.println(new SimpleDateFormat("MMMM").format(1));
//	Month.valueOf(monthName.toUpperCase()).getValue();
	System.out.println(Month.valueOf("SEPTEMBER").getValue());
//	System.out.println(new SimpleDateFormat("DDDD").format("SEPTEMBER"));
}
}
