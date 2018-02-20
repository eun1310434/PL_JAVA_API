/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
public class StringAPI {
	public static void main(String[] ar) {
		

		String a = "HELLO";
		String b = "HELLO";
		System.out.print("01) a와 b는 메모리 주소가 같은가? = ");
		System.out.println(a == b);
		//동일한 문자가 있으면  constant memory에 할당 되어 같음 주소 사용 --> true
		

		String c = new String("HELLO");
		String d = new String("HELLO");
		System.out.print("02) c와 d는 메모리 주소가 같은가? = ");
		System.out.println(c == d);
		//new 를 통하여 heap memory에 할당 되어 다른 주소 사용 --> false
		
		
		System.out.print("03) a와 c는 내용이 같은가? = ");
		System.out.println(a.equals(c));
		//.equals를 활용하여 내용을 비교 --> true
		
		
		String str = new String(" Hello! My name is Philip Jeong ");
		System.out.println("04) 문자열 길이 : str.length() = " + str.length());
		System.out.println("05) 첫번째 'e'문자는 몇 번째 위치 : str.indexOf(e) = " + str.indexOf("e"));
		System.out.println("06) 마지막 'e'문자는 몇 번째 위치 : str.lastIndexOf(e) = " + str.lastIndexOf("e"));
		System.out.println("07) 3 ~ 7번째 위치의 문자열 : str.substring(3, 7) = " + str.substring(3, 7));
		System.out.println("08) 12번째 위치의 문자 : str.charAt(12) = " + str.charAt(12));
		System.out.println("09) 시작하는 문자열이 ' He'인가? : str.startsWith(He) = " + str.startsWith(" He"));
		System.out.println("10) 끝나는 문자열이 '?!' 인가? : str.endsWith(?!) =" + str.endsWith("?!"));
		System.out.println("11) 문자열 뒤에 'ok?!'를 추가 : str.concat(ok?!) = " + str.concat("ok?!"));
		System.out.println("12) 앞 뒤 공백을 제거하고 출력 : str.trim() = "+ str.trim());
		System.out.println("13) ' Hello! '와 비교하면 몇글자나 더 큰가 : str.compareTo(Hello!) = " + str.compareTo(" Hello! "));
		
		byte[] data = str.getBytes();
		System.out.println("14) 이 문자열을 byte 배열로 변경 : str.getBytes() = " + data);
		System.out.println("15) 문자열이 비어 있나? : str.isEmpty() = " + str.isEmpty());
		System.out.println("16) 공백을 기준으로 나누기 : str.split() =");
		String[] data2 = str.split(" ");
		for(int n = 0; n < data2.length; ++n) {
			System.out.println(n + " - " + data2[n]);
		}
		System.out.println("17) 전체를 대문자로 바꾸면 = " + str.toUpperCase());
		System.out.println("18) 전체를 소문자로 바꾸면 = " + str.toLowerCase());
	}
}
