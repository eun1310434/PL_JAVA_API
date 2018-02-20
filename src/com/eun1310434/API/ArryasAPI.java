/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/

package com.eun1310434.API;
import java.util.Arrays;
public class ArryasAPI {
	public static void main(String[] ar) {
		char[] data = new char[]{'H', 'E', 'L', 'L', 'O'};
		char[] data2 = "HELLO".toCharArray();
		
		boolean check = Arrays.equals(data, data2);
		System.out.println("data vs data2 equals ? " + check);
		
		String str = Arrays.toString(data);
		System.out.println("data = " + str);
		
		char[] copy = Arrays.copyOfRange(data, 1, 3);
		System.out.println("copy = " + Arrays.toString(copy));
		
		Arrays.sort(data);
		System.out.println("sort data = " + Arrays.toString(data));
		
		int pos = Arrays.binarySearch(data, 'O');
		System.out.println("'O' position = " + pos);
		
		Arrays.fill(data2, 'A');
		System.out.println("'A' initialize = " + Arrays.toString(data2));
	}
}
