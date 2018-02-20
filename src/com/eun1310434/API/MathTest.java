package com.eun1310434.API;
public class MathTest {
	public static void main(String[] ar) {
		System.out.println("e = " + Math.E);
		System.out.println("pi = " + Math.PI);
		System.out.println("���밪(-75.12) = " + Math.abs(-75.12));
		System.out.println("����(12.98) = " + Math.floor(12.98));
		System.out.println("�ݿø�(12.5) = " + Math.round(12.5));
		System.out.println("�ø�(12.01) = " + Math.ceil(12.01));
		System.out.println("�ִ밪(50, 80) = " + Math.max(50, 80));
		System.out.println("�ּҰ�(50, 80) = " + Math.min(50, 80));
		System.out.println("4�� 2���� = " + Math.pow(4, 2));
		System.out.println("4�� ������ = " + Math.sqrt(4));
		System.out.println("0 ~ 1 ������ ���� = " + Math.random());
		System.out.println("���� 1 ~ 10 ������ ���� = " + ((int)(Math.random() * 10) + 1));
		System.out.println("���� 180���� ���� = " + Math.toRadians(180));
		System.out.println("2���� ������ ���� = " + Math.toDegrees(2 * Math.PI));
	}
}
