package main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Test1 {
	public static void main(String[] args) {
		
		DecimalFormat df2 = new DecimalFormat("#.###");
		
		Double a =2.000;
		System.out.println(2/(1*1.000)*1.000);
		
		System.out.println(df2.format("2.12334"));
		
//		BigDecimal bd = new BigDecimal(2).
//        double newInput = bd.doubleValue();
//        System.out.println(newInput);
        
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3);
		System.out.println(a);
	}
}
