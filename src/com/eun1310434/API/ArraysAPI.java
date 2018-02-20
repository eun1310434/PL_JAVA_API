/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.API;
import java.util.Arrays;
public class ArraysAPI {
	//Arrays Class
	//: �迭�� ����, �ʱ�ȭ, ���ĵ��� ����
	
	
	public static void main(String[] ar) {
		char[] data1 = new char[]{'e', 'u', 'n', '1', '3', '1', '0', '4', '3', '4'};
		char[] data2 = "eun1310434".toCharArray();
		
		
		boolean check = Arrays.equals(data1, data2);
		System.out.println("01) data1 and data2 equals check = " + check);
		
		
		String str = Arrays.toString(data1);
		System.out.println("02) data1 to String : Arrays.toString(data1) = " + str);
		
		
		char[] copy = Arrays.copyOfRange(data1, 1, 3);
		System.out.println("03) copy : Arrays.copyOfRange(data1, 1, 3) = " + Arrays.toString(copy));
		
		Arrays.sort(data1);
		System.out.println("04) sort data1 : Arrays.sort(data1) = " + Arrays.toString(data1));
		
		int pos = Arrays.binarySearch(data1, 'u');
		System.out.println("05) 'u' position : Arrays.binarySearch(data1, 'u') = " + pos+"��° ��ġ�� ����");
		
		Arrays.fill(data2, 'Z');
		System.out.println("06) 'A' initialize : Arrays.fill(data2, 'Z')= " + Arrays.toString(data2));
	}
}
