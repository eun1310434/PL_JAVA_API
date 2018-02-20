/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.API;
import java.util.Arrays;
public class ArraysAPI {
	public static void main(String[] ar) {
		char[] data1 = new char[]{'H', 'E', 'L', 'L', 'O'};
		char[] data2 = "HELLO".toCharArray();
		
		
		boolean check = Arrays.equals(data1, data2);
		System.out.println("data and data2 equals check = " + check);
		
		
		String str = Arrays.toString(data1);
		System.out.println("data = " + str);
		
		
		char[] copy = Arrays.copyOfRange(data1, 1, 3);
		System.out.println("copy = " + Arrays.toString(copy));
		
		Arrays.sort(data1);
		System.out.println("sort data = " + Arrays.toString(data1));
		
		int pos = Arrays.binarySearch(data1, 'O');
		System.out.println("'O' position = " + pos);
		
		Arrays.fill(data2, 'A');
		System.out.println("'A' initialize = " + Arrays.toString(data2));
	}
}
