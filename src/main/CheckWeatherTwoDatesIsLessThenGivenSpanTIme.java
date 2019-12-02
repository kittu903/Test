package main;

import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class CheckWeatherTwoDatesIsLessThenGivenSpanTIme {
	public static void main(String[] args) {
		CheckWeatherTwoDatesIsLessThenGivenSpanTIme l = new CheckWeatherTwoDatesIsLessThenGivenSpanTIme();
		int years=1;
		if(l.checkForPeriodLimit(new Date(), new Date(), years))
			System.out.println(" given dates are less than "+years+" year");
		else
			System.out.println(" given dates is greater than "+years+" year");
	}
	public  boolean checkForPeriodLimit(Date dateFrom, Date dateTo, int noOfYeays ){

		Period p = Period.between(dateFrom.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				dateTo.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

		return ((p.getYears() < noOfYeays)?true:false);
	}
}
