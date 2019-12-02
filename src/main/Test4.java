package main;

import java.util.Calendar;
import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		int lastTwoDigits = Calendar.getInstance().get(Calendar.YEAR) % 100;
		Random rand = new Random();
		int num = rand.nextInt(9000000) + 1000000;
		System.out.println(num+"-"+lastTwoDigits);
	}
}




//SELECT CAST(update_timestamp AS DATE),SUM(deliverd_weight*quantity)
//FROM item WHERE update_timestamp BETWEEN ?2 AND ?3 AND seller_id=?1
//		GROUP BY CAST(update_timestamp AS DATE) ORDER BY 1