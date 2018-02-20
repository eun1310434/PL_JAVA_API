package com.eun1310434.API;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeTest {
	public static void main(String[] ar) {
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		
		System.out.println("연도 = " + zonedDateTime.getYear());
		System.out.println("월 = " + zonedDateTime.getMonthValue());
		System.out.println("일 = " + zonedDateTime.getDayOfMonth());
		System.out.println("시 = " + zonedDateTime.getHour());
		System.out.println("분 = " + zonedDateTime.getMinute());
		System.out.println("초 = " + zonedDateTime.getSecond());
		
		System.out.println("지금부터 3일 후면 ? ");
		ZonedDateTime zonedDateTimeAfter = zonedDateTime.plusDays(3);
		System.out.println("월 = " + zonedDateTimeAfter.getMonthValue());
		System.out.println("일 = " + zonedDateTimeAfter.getDayOfMonth());
	}
}
