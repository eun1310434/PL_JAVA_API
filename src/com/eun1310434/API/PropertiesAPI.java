/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.Properties;
public class PropertiesAPI {
	public static void main(String[] ar) {
		//프로그램을 작성시 운영체제(OS)나 JVM 에 의존적인 정보를 알아야 할 때 사용
		Properties properties = System.getProperties();
		properties.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
