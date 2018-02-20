/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionAPI {
	//Reflection
	//: Ŭ������ ������ Ȯ�� �� �̸� ������� ���α׷��� �������� ��ü ����
	
	public static void main(String[] ar) throws Exception {
		//Class obj = Class.forName("java.lang.String");
		Class obj = Class.forName("com.eun1310434.API.StringBuilderAPI");
		Field[] fields = obj.getFields();
		Method[] methods = obj.getMethods();
		
		System.out.println("01) Class Name= " + obj.getName());
		System.out.println("02) Fields");
		for(Field field: fields) {
			System.out.println("     Type : "+field.getType().getSimpleName() + ", Name : " + field.getName());
		}
		System.out.println("03) Methods");
		for(Method method: methods) {
			System.out.println("     Type : "+method.getReturnType().getSimpleName() + ", Name : " + method.getName() + "()");
		}
	}
}
