/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;

public class StringBufferAPI {
	//StringBuffer : ���ڿ� ����, ��Ƽ�����忡 ����, ����
	
	public static void main(String[] ar) {
		StringBuffer str = new StringBuffer("12345");
		System.out.println("01) StringBuffer��� : new StringBuffer() = "+str);
		
		str.replace(0, 3, "000");
		System.out.println("02) Ư����ġ ���� : str.replace() = "+str);
		
	}
}
