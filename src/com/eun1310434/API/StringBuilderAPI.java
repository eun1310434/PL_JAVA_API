/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
public class StringBuilderAPI {
	
	//StringBuilder : 문자열 조작, 멀티스레드에 안전하지 않음, 빠름
	
	public static String appendData(String source, String[] data) {
		// 문자열 추가 : source 뒤에 data 배열을 첨부
		
		StringBuilder builder = new StringBuilder(source);
		for(String str: data) {
			builder.append("&" + str);
		}
		return builder.toString();
	}
	
	public static String insertData(String source, int pos, String data) {
		// 문자열 추가 : source의 원하는 pos에 data 배열을 첨부
		
		StringBuilder builder = new StringBuilder(source);
		builder.insert(pos, data);
		return builder.toString();
	}
	
	public static void main(String[] ar) {
		String source = "A";
		System.out.println("source = " + source);
		
		String[] data = new String[]{"B", "C"};
		source = appendData(source, data);
		System.out.println("source = " + source);
		
		source = insertData(source, 1, "Z");
		System.out.println("source = " + source);
	}
}
