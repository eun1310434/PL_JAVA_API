package com.eun1310434.API;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaTextFormatTest {
	public static void main(String[] ar) {
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy년 MMM월 d일 E요일 a HH시 mm분 ss초 SSS");
		System.out.println("지금 = " + dateFormat.format(ca.getTime()));
		
		double data = 54321.78987;
		DecimalFormat decimalFormat = new DecimalFormat("-0,000.000");
		System.out.println("54321.78987 = " + decimalFormat.format(data));
	}
}
