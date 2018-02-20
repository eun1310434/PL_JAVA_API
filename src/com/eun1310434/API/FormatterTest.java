package com.eun1310434.API;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
public class FormatterTest {
	public static void main(String[] ar) {
		Formatter formatter = new Formatter();
		Calendar ca = Calendar.getInstance();
		
		formatter.format("논리형 %B와 %b%n", true, false);
		formatter.format("정수형 %d와 %o와 %x%n", 10, 10, 10);
		formatter.format("실수형 %f와 %.2f%n", 12.345, 12.345);
		formatter.format("문자열 %s%n", "Hello Java");
		formatter.format("날짜형 %tY년 %tm월 %te일 %tA%n", ca, ca, ca, ca);
		formatter.format("시간형 %tk시 %tM분 %tS초%n%n", ca, ca, ca);
		
		formatter.format(Locale.KOREA, "한국 월 = %tB%n", ca);
		formatter.format(Locale.JAPAN, "일본 월 = %tB%n", ca);
		formatter.format(Locale.CHINA, "중국 월 = %tB%n", ca);
		formatter.format(Locale.US, "미국 월 = %tB%n", ca);
		
		System.out.println(formatter);
	}
}
