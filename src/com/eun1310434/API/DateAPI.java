/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.util.Date;
public class DateAPI {
	//Date Ŭ����
	//: ��¥�� �ð��� �����ϴ� Ŭ����
	//: ���� ���� ����
	//: �ڹ��� �ʱ� �������� ����
	//: ����� Deprecated �� �޼������ ����
	
	public static void main(String[] ar) {
		Date date = new Date();
		
		System.out.println("01) " + (1900 + date.getYear())+"��");
		System.out.println("02) " + (date.getMonth() + 1)+"��");
		System.out.println("03) " + date.getDate()+"��");
		System.out.println("04) " + date.getHours()+"��");
		System.out.println("05) " + date.getMinutes()+"��");
		System.out.println("06) " + date.getSeconds()+"��");
	}
}
