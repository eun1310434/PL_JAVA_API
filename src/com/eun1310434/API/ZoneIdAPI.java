/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdAPI {
	public static void main(String[] ar) {
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		
		System.out.println("01) " + zonedDateTime.getYear()+"년");
		System.out.println("02) " + zonedDateTime.getMonthValue()+"월");
		System.out.println("03) " + zonedDateTime.getDayOfMonth()+"일");
		System.out.println("04) " + zonedDateTime.getHour()+"시");
		System.out.println("05) " + zonedDateTime.getMinute()+"분");
		System.out.println("06) " + zonedDateTime.getSecond()+"초");
		
		System.out.print("07) 지금부터 3일 후 : ");
		ZonedDateTime zonedDateTimeAfter = zonedDateTime.plusDays(3);
		System.out.print(zonedDateTimeAfter.getMonthValue()+"월");
		System.out.println(zonedDateTimeAfter.getDayOfMonth()+"일");
	}
}
