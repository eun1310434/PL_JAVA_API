/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.util.Calendar;
import java.util.TimeZone;
public class CalendarAPI {
	//Calendar Ŭ����
	//: ��¥�� �ð��� �����Ѵ� Ŭ����
	//: ���� ���� ����
	//: Factory �������� ��ü ����
	//: GregorianCalendar Ŭ����
	//: �׷����°� �����콺���� ���� ������ Calendar�� ���� Ŭ����
	
	public static void main(String[] ar) {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calendar = Calendar.getInstance(timeZone);
		
		System.out.println("01) " + calendar.get(Calendar.YEAR) + "��");
		System.out.println("02) " + (calendar.get(Calendar.MONTH) + 1 + "��"));
		System.out.println("03) " + calendar.get(Calendar.DAY_OF_MONTH) + "��");
		System.out.println("04) " + calendar.get(Calendar.HOUR_OF_DAY) +"��");
		System.out.println("05) " + calendar.get(Calendar.MINUTE) + "��");
		System.out.println("06) " + calendar.get(Calendar.SECOND) + "��");
		
		System.out.print("07) ����� ���� 3�� �� : ");
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.print((calendar.get(Calendar.YEAR))+"�� ");
		System.out.print((calendar.get(Calendar.MONTH) + 1)+"�� ");
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"��");
	}
}
