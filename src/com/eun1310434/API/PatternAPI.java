/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAPI {
	//Pattern 클래스
	//: 임의의 문자열을 찾거나 비교
	
	public static void main(String[] ar) {
		Pattern pattern = Pattern.compile("^a[b-y]*z$");
		//: a로 시작해서 z까지 써지는 문자
		//: a와 z사이에는 b~y까지 문자가 0개 이상 있어야함
		
		Matcher mat1 = pattern.matcher("abcd");
		Matcher mat2 = pattern.matcher("az");
		Matcher mat3 = pattern.matcher("abcz");
		Matcher mat4 = pattern.matcher("bcdz");
				
		System.out.println("1) abcd = " + mat1.matches());
		System.out.println("2) az = " + mat2.matches());
		System.out.println("3) abcz = " + mat3.matches());
		System.out.println("4) bcdz = " + mat4.matches());
	}
}
