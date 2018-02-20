/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormatterAPI {
	//Formatter Ŭ����
	//: ��ӵ� �ܾ �������� ���� �����͸� ����
	
	public static void main(String[] ar) {
		Formatter formatter = new Formatter();
		Calendar ca = Calendar.getInstance();
		

		formatter.format("01) ���� : %B, %b %n", true, false);
		//%B : �빮��
		//%b : �ҹ���
		//%n : ����
		formatter.format("02) ������ : %d, %o, %x %n", 10, 10, 10);
		formatter.format("03) �Ǽ��� : %f, %.2f %n", 12.345, 12.345);
		formatter.format("04) ���ڿ� : %s %n", "Hello Java");
		formatter.format("05) ��¥�� : %tY�� %tm�� %te�� %tA %n", ca, ca, ca, ca);
		formatter.format("06) �ð��� : %tk�� %tM�� %tS��%n", ca, ca, ca);
		
		formatter.format(Locale.KOREA, "07) �ѱ� �� = %tB %n", ca);
		formatter.format(Locale.JAPAN, "08) �Ϻ� �� = %tB %n", ca);
		formatter.format(Locale.CHINA, "09) �߱� �� = %tB %n", ca);
		formatter.format(Locale.US, "10) �̱� �� = %tB%n", ca);
		System.out.print(formatter);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy�� MM�� d�� E���� a HH�� mm�� ss�� SSS");
		System.out.println("11) Now = " + dateFormat.format(ca.getTime()));
		
		double data = 54321.78327;
		DecimalFormat decimalFormat = new DecimalFormat("-0,000.###");
		//: -0�� ������ ǥ��
		//: 0,000�� 3�ڸ� �տ� ,�� ����
		//: .###�� �Ҽ��� 4�ڸ����� �ݿø��Ͽ� ��ȿ�� ���ڱ��� ǥ��
		System.out.println("12) 54321.78327 = " + decimalFormat.format(data));
	}
}
