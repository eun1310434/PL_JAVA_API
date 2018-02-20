/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionAPI {
	//Reflection
	//: 클래스의 정보를 확인 및 이를 기반으로 프로그램을 동적으로 객체 생성
	
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
