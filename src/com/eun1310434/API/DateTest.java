package com.eun1310434.API;
import java.util.Date;
public class DateTest {
	public static void main(String[] ar) {
		Date date = new Date();
		
		System.out.println("���� = " + (1900 + date.getYear()));
		System.out.println("�� = " + (date.getMonth() + 1));
		System.out.println("�� = " + date.getDate());
		System.out.println("�� = " + date.getHours());
		System.out.println("�� = " + date.getMinutes());
		System.out.println("�� = " + date.getSeconds());
	}
}
