/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;

public class StringBufferAPI {
	//StringBuffer : 문자열 조작, 멀티스레드에 안전, 느림
	
	public static void main(String[] ar) {
		StringBuffer str = new StringBuffer("12345");
		System.out.println("01) StringBuffer사용 : new StringBuffer() = "+str);
		
		str.replace(0, 3, "000");
		System.out.println("02) 특정위치 변경 : str.replace() = "+str);
		
	}
}
