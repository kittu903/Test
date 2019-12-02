package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class checkingDateWeatherItIsBeforeOrAfter {
	public static void main(String[] args) {
		String date = "2019-01-01";
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(new Date());
		Date da=null;
		try {
			da = simpleDateFormat.parse(date);
		} catch (ParseException exception) {
			System.out.println("-------"+exception);
		}
			System.out.println(da.before(new Date()));
	}
}
