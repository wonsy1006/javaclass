package javaAPI;

import java.text.DecimalFormat;

// p.543 Format Class

public class DecimalFormatEx1 {

	public static void main(String[] args) {
		double dnum = 5123.2634;
		double dnum2 = 4321.2;
		DecimalFormat df;
		df = new DecimalFormat("0.0"); // 소수점 밑 한자리, 반올림
		DecimalFormat df2 = new DecimalFormat("0.00"); // 소수점 밑 한자리, 반올림
		
		System.out.println(df.format(dnum));
		System.out.println(df2.format(dnum2)); 
		
		int num1 = 45600000;
		DecimalFormat df3 = new DecimalFormat("#,###원"); 
		System.out.println(df3.format(num1));
		
		double dnum3 = 0.024;
		DecimalFormat df4 = new DecimalFormat("0.0%"); // %로 표현
		System.out.println(df4.format(dnum3));
		
	}

}
