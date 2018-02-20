/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.util.StringTokenizer;
public class StringTokenizerAPI {
	
	public static void splitSet(String source) {
		//split �޼��� 
		//: ���ڿ��� Ư�� ��ū�� �������� �߶� ���, ��ū�� �������� �߶��� �� null�� ������ ������ ǥ��
		String[] data = source.split("&"); // +�� ������ ���� �������� �ڸ�
		for(int n = 0; n < data.length; ++n) {
			System.out.println(n + ") " + data[n]);
		}
	}
	
	public static void stringTokenizerSet(String source) {
		//StringTokenizer Ŭ���� 
		//: ���ڿ��� Ư�� ��ū�� �������� �߶� ���, ��ū�� �������� �߶��� �� null�� ������ ������ ����
		StringTokenizer data = new StringTokenizer(source, "&"); // +�� ������ ���� �������� �ڸ�
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
