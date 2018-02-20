/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/


package com.eun1310434.API;
public class MathAPI {
	//Math Class
	//: 수학과 관련된 계산을 지원하는 클래스
	
	public static void main(String[] ar) {
		System.out.println("01) e : Math.E = " + Math.E);
		System.out.println("02) pi : Math.PI = " + Math.PI);
		System.out.println("03) 절대값(-75.12) : Math.abs(-75.12) = " + Math.abs(-75.12));
		System.out.println("04) 버림(12.98) : Math.floor(12.98) = " + Math.floor(12.98));
		System.out.println("05) 반올림(12.5) : Math.round(12.5) = " + Math.round(12.5));
		System.out.println("06) 올림(12.01) : Math.ceil(12.01) = " + Math.ceil(12.01));
		System.out.println("07) 최대값(50, 80) : Math.max(50, 80) = " + Math.max(50, 80));
		System.out.println("08) 최소값(50, 80) : Math.min(50, 80) = " + Math.min(50, 80));
		System.out.println("09) 4의 2제곱 : Math.pow(4, 2) = " + Math.pow(4, 2));
		System.out.println("10) 4의 제곱근 : Math.sqrt(4) = " + Math.sqrt(4));
		System.out.println("11) 0 ~ 1 사이의 난수 : Math.random() = " + Math.random());
		System.out.println("12) 정수 1 ~ 10 사이의 난수 : ((int)(Math.random() * 10) + 1) = " + ((int)(Math.random() * 10) + 1));
		System.out.println("13) 각도 180도의 라디안 : Math.toRadians(180) = " + Math.toRadians(180));
		System.out.println("14) 2파이 라디안의 각도 : Math.toDegrees(2 * Math.PI) = " + Math.toDegrees(2 * Math.PI));
	}
}
