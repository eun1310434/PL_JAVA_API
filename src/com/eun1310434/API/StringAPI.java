/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
public class StringAPI {
	public static void main(String[] ar) {
		

		String a = "HELLO";
		String b = "HELLO";
		System.out.print("01) a�� b�� �޸� �ּҰ� ������? = ");
		System.out.println(a == b);
		//������ ���ڰ� ������  constant memory�� �Ҵ� �Ǿ� ���� �ּ� ��� --> true
		

		String c = new String("HELLO");
		String d = new String("HELLO");
		System.out.print("02) c�� d�� �޸� �ּҰ� ������? = ");
		System.out.println(c == d);
		//new �� ���Ͽ� heap memory�� �Ҵ� �Ǿ� �ٸ� �ּ� ��� --> false
		
		
		System.out.print("03) a�� c�� ������ ������? = ");
		System.out.println(a.equals(c));
		//.equals�� Ȱ���Ͽ� ������ �� --> true
		
		
		String str = new String(" Hello! My name is Philip Jeong ");
		System.out.println("04) ���ڿ� ���� : str.length() = " + str.length());
		System.out.println("05) ù��° 'e'���ڴ� �� ��° ��ġ : str.indexOf(e) = " + str.indexOf("e"));
		System.out.println("06) ������ 'e'���ڴ� �� ��° ��ġ : str.lastIndexOf(e) = " + str.lastIndexOf("e"));
		System.out.println("07) 3 ~ 7��° ��ġ�� ���ڿ� : str.substring(3, 7) = " + str.substring(3, 7));
		System.out.println("08) 12��° ��ġ�� ���� : str.charAt(12) = " + str.charAt(12));
		System.out.println("09) �����ϴ� ���ڿ��� ' He'�ΰ�? : str.startsWith(He) = " + str.startsWith(" He"));
		System.out.println("10) ������ ���ڿ��� '?!' �ΰ�? : str.endsWith(?!) =" + str.endsWith("?!"));
		System.out.println("11) ���ڿ� �ڿ� 'ok?!'�� �߰� : str.concat(ok?!) = " + str.concat("ok?!"));
		System.out.println("12) �� �� ������ �����ϰ� ��� : str.trim() = "+ str.trim());
		System.out.println("13) ' Hello! '�� ���ϸ� ����ڳ� �� ū�� : str.compareTo(Hello!) = " + str.compareTo(" Hello! "));
		
		byte[] data = str.getBytes();
		System.out.println("14) �� ���ڿ��� byte �迭�� ���� : str.getBytes() = " + data);
		System.out.println("15) ���ڿ��� ��� �ֳ�? : str.isEmpty() = " + str.isEmpty());
		System.out.println("16) ������ �������� ������ : str.split() =");
		String[] data2 = str.split(" ");
		for(int n = 0; n < data2.length; ++n) {
			System.out.println(n + " - " + data2[n]);
		}
		System.out.println("17) ��ü�� �빮�ڷ� �ٲٸ� = " + str.toUpperCase());
		System.out.println("18) ��ü�� �ҹ��ڷ� �ٲٸ� = " + str.toLowerCase());
	}
}
