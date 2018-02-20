/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAPI {
	//Pattern Ŭ����
	//: ������ ���ڿ��� ã�ų� ��
	
	public static void main(String[] ar) {
		Pattern pattern = Pattern.compile("^a[b-y]*z$");
		//: a�� �����ؼ� z���� ������ ����
		//: a�� z���̿��� b~y���� ���ڰ� 0�� �̻� �־����
		
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
