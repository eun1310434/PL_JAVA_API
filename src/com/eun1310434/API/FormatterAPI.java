/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormatterAPI {
	//Formatter 클래스
	//: 약속된 단어를 기준으로 실제 데이터를 맵핑
	
	public static void main(String[] ar) {
		Formatter formatter = new Formatter();
		Calendar ca = Calendar.getInstance();
		

		formatter.format("01) 논리형 : %B, %b %n", true, false);
		//%B : 대문자
		//%b : 소문자
		//%n : 개행
		formatter.format("02) 정수형 : %d, %o, %x %n", 10, 10, 10);
		formatter.format("03) 실수형 : %f, %.2f %n", 12.345, 12.345);
		formatter.format("04) 문자열 : %s %n", "Hello Java");
		formatter.format("05) 날짜형 : %tY년 %tm월 %te일 %tA %n", ca, ca, ca, ca);
		formatter.format("06) 시간형 : %tk시 %tM분 %tS초%n", ca, ca, ca);
		
		formatter.format(Locale.KOREA, "07) 한국 월 = %tB %n", ca);
		formatter.format(Locale.JAPAN, "08) 일본 월 = %tB %n", ca);
		formatter.format(Locale.CHINA, "09) 중국 월 = %tB %n", ca);
		formatter.format(Locale.US, "10) 미국 월 = %tB%n", ca);
		System.out.print(formatter);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy년 MM월 d일 E요일 a HH시 mm분 ss초 SSS");
		System.out.println("11) Now = " + dateFormat.format(ca.getTime()));
		
		double data = 54321.78327;
		DecimalFormat decimalFormat = new DecimalFormat("-0,000.###");
		//: -0는 음수로 표현
		//: 0,000는 3자리 앞에 ,를 찍음
		//: .###는 소숫점 4자리에서 반올림하여 유효한 숫자까지 표현
		System.out.println("12) 54321.78327 = " + decimalFormat.format(data));
	}
}
