/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.StringTokenizer;
public class StringTokenizerTest {
	public static void splitData(String source) {
		String[] data = source.split(",");
		for(int n = 0; n < data.length; ++n) {
			System.out.println(n + " : " + data[n]);
		}
	}
	public static void stringTokenizerData(String source) {
		StringTokenizer data = new StringTokenizer(source, ",");
		int n = 0;
		while(data.hasMoreTokens()) {
			System.out.println(n + " : " + data.nextToken());
			n++;
		}
	}
	public static void main(String[] ar) {
		String source = "A,B,C,,E,F";
		splitData(source);
		System.out.println();
		stringTokenizerData(source);
	}
}
