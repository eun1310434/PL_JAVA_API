/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.util.Properties;
public class PropertiesAPI {
	public static void main(String[] ar) {
		//���α׷��� �ۼ��� �ü��(OS)�� JVM �� �������� ������ �˾ƾ� �� �� ���
		Properties properties = System.getProperties();
		properties.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
