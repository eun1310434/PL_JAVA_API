/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.Date;
public class DateAPI {
	//Date 클래스
	//: 날짜와 시간을 관리하는 클래스
	//: 지역 정보 없음
	//: 자바의 초기 버전부터 존재
	//: 현재는 Deprecated 된 메서드들이 존재
	
	public static void main(String[] ar) {
		Date date = new Date();
		
		System.out.println("01) " + (1900 + date.getYear())+"년");
		System.out.println("02) " + (date.getMonth() + 1)+"월");
		System.out.println("03) " + date.getDate()+"일");
		System.out.println("04) " + date.getHours()+"시");
		System.out.println("05) " + date.getMinutes()+"분");
		System.out.println("06) " + date.getSeconds()+"초");
	}
}
