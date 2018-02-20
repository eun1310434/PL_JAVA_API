package com.eun1310434.API;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeTest {
	public static void main(String[] ar) {
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		
		System.out.println("���� = " + zonedDateTime.getYear());
		System.out.println("�� = " + zonedDateTime.getMonthValue());
		System.out.println("�� = " + zonedDateTime.getDayOfMonth());
		System.out.println("�� = " + zonedDateTime.getHour());
		System.out.println("�� = " + zonedDateTime.getMinute());
		System.out.println("�� = " + zonedDateTime.getSecond());
		
		System.out.println("���ݺ��� 3�� �ĸ� ? ");
		ZonedDateTime zonedDateTimeAfter = zonedDateTime.plusDays(3);
		System.out.println("�� = " + zonedDateTimeAfter.getMonthValue());
		System.out.println("�� = " + zonedDateTimeAfter.getDayOfMonth());
	}
}
