package com.eun1310434.API;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaTextFormatTest {
	public static void main(String[] ar) {
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy�� MMM�� d�� E���� a HH�� mm�� ss�� SSS");
		System.out.println("���� = " + dateFormat.format(ca.getTime()));
		
		double data = 54321.78987;
		DecimalFormat decimalFormat = new DecimalFormat("-0,000.000");
		System.out.println("54321.78987 = " + decimalFormat.format(data));
	}
}
