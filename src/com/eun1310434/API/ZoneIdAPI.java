/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdAPI {
	public static void main(String[] ar) {
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
		
		System.out.println("01) " + zonedDateTime.getYear()+"��");
		System.out.println("02) " + zonedDateTime.getMonthValue()+"��");
		System.out.println("03) " + zonedDateTime.getDayOfMonth()+"��");
		System.out.println("04) " + zonedDateTime.getHour()+"��");
		System.out.println("05) " + zonedDateTime.getMinute()+"��");
		System.out.println("06) " + zonedDateTime.getSecond()+"��");
		
		System.out.print("07) ���ݺ��� 3�� �� : ");
		ZonedDateTime zonedDateTimeAfter = zonedDateTime.plusDays(3);
		System.out.print(zonedDateTimeAfter.getMonthValue()+"��");
		System.out.println(zonedDateTimeAfter.getDayOfMonth()+"��");
	}
}
