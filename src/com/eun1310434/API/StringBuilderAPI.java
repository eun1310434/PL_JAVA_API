/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
public class StringBuilderAPI {
	
	//StringBuilder : ���ڿ� ����, ��Ƽ�����忡 �������� ����, ����
	
	public static String appendData(String source, String[] data) {
		// ���ڿ� �߰� : source �ڿ� data �迭�� ÷��
		
		StringBuilder builder = new StringBuilder(source);
		for(String str: data) {
			builder.append("&" + str);
		}
		return builder.toString();
	}
	
	public static String insertData(String source, int pos, String data) {
		// ���ڿ� �߰� : source�� ���ϴ� pos�� data �迭�� ÷��
		
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
