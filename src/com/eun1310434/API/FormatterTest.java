package com.eun1310434.API;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
public class FormatterTest {
	public static void main(String[] ar) {
		Formatter formatter = new Formatter();
		Calendar ca = Calendar.getInstance();
		
		formatter.format("���� %B�� %b%n", true, false);
		formatter.format("������ %d�� %o�� %x%n", 10, 10, 10);
		formatter.format("�Ǽ��� %f�� %.2f%n", 12.345, 12.345);
		formatter.format("���ڿ� %s%n", "Hello Java");
		formatter.format("��¥�� %tY�� %tm�� %te�� %tA%n", ca, ca, ca, ca);
		formatter.format("�ð��� %tk�� %tM�� %tS��%n%n", ca, ca, ca);
		
		formatter.format(Locale.KOREA, "�ѱ� �� = %tB%n", ca);
		formatter.format(Locale.JAPAN, "�Ϻ� �� = %tB%n", ca);
		formatter.format(Locale.CHINA, "�߱� �� = %tB%n", ca);
		formatter.format(Locale.US, "�̱� �� = %tB%n", ca);
		
		System.out.println(formatter);
	}
}
