/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/


package com.eun1310434.API;
public class MathAPI {
	//Math Class
	//: ���а� ���õ� ����� �����ϴ� Ŭ����
	
	public static void main(String[] ar) {
		System.out.println("01) e : Math.E = " + Math.E);
		System.out.println("02) pi : Math.PI = " + Math.PI);
		System.out.println("03) ���밪(-75.12) : Math.abs(-75.12) = " + Math.abs(-75.12));
		System.out.println("04) ����(12.98) : Math.floor(12.98) = " + Math.floor(12.98));
		System.out.println("05) �ݿø�(12.5) : Math.round(12.5) = " + Math.round(12.5));
		System.out.println("06) �ø�(12.01) : Math.ceil(12.01) = " + Math.ceil(12.01));
		System.out.println("07) �ִ밪(50, 80) : Math.max(50, 80) = " + Math.max(50, 80));
		System.out.println("08) �ּҰ�(50, 80) : Math.min(50, 80) = " + Math.min(50, 80));
		System.out.println("09) 4�� 2���� : Math.pow(4, 2) = " + Math.pow(4, 2));
		System.out.println("10) 4�� ������ : Math.sqrt(4) = " + Math.sqrt(4));
		System.out.println("11) 0 ~ 1 ������ ���� : Math.random() = " + Math.random());
		System.out.println("12) ���� 1 ~ 10 ������ ���� : ((int)(Math.random() * 10) + 1) = " + ((int)(Math.random() * 10) + 1));
		System.out.println("13) ���� 180���� ���� : Math.toRadians(180) = " + Math.toRadians(180));
		System.out.println("14) 2���� ������ ���� : Math.toDegrees(2 * Math.PI) = " + Math.toDegrees(2 * Math.PI));
	}
}
