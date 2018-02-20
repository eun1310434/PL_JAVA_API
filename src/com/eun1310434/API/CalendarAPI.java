/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.Calendar;
import java.util.TimeZone;
public class CalendarAPI {
	//Calendar 클래스
	//: 날짜와 시간을 관리한는 클래스
	//: 지역 정보 포함
	//: Factory 패턴으로 객체 생성
	//: GregorianCalendar 클래스
	//: 그레고리력과 율리우스력을 같이 구현한 Calendar의 하위 클래스
	
	public static void main(String[] ar) {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calendar = Calendar.getInstance(timeZone);
		
		System.out.println("01) " + calendar.get(Calendar.YEAR) + "년");
		System.out.println("02) " + (calendar.get(Calendar.MONTH) + 1 + "월"));
		System.out.println("03) " + calendar.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println("04) " + calendar.get(Calendar.HOUR_OF_DAY) +"시");
		System.out.println("05) " + calendar.get(Calendar.MINUTE) + "분");
		System.out.println("06) " + calendar.get(Calendar.SECOND) + "초");
		
		System.out.print("07) 현재로 부터 3일 후 : ");
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.print((calendar.get(Calendar.YEAR))+"년 ");
		System.out.print((calendar.get(Calendar.MONTH) + 1)+"월 ");
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"일");
	}
}
