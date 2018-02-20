/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.StringTokenizer;
public class StringTokenizerAPI {
	
	public static void splitSet(String source) {
		//split 메서드 
		//: 문자열을 특정 토큰을 기준으로 잘라서 사용, 토큰을 기준으로 잘랐을 때 null이 나오는 영역은 표시
		String[] data = source.split("&"); // +가 나오는 곳을 기준으로 자름
		for(int n = 0; n < data.length; ++n) {
			System.out.println(n + ") " + data[n]);
		}
	}
	
	public static void stringTokenizerSet(String source) {
		//StringTokenizer 클래스 
		//: 문자열을 특정 토큰을 기준으로 잘라서 사용, 토큰을 기준으로 잘랐을 때 null이 나오는 영역은 무시
		StringTokenizer data = new StringTokenizer(source, "&"); // +가 나오는 곳을 기준으로 자름
		int n = 0;
		while(data.hasMoreTokens()) {
			System.out.println(n + ") " + data.nextToken());
			n++;
		}
	}
	
	public static void main(String[] ar) {
		String source = "A&B&C&&&E&F";

		System.out.println("splitSet(source)");
		splitSet(source);
		System.out.println();
		

		System.out.println("stringTokenizerSet(source)");
		stringTokenizerSet(source);
	}
}
