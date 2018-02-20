/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.API;
import java.util.Random;
public class RandomAPI {
	//Random Class
	//: ���� �߻��� �����ϴ� Ŭ����
	//: Math.random()���� ���� ����
	//: �پ��� ���� �߻�
	//: ���� ��� ���� �����߻��� ������ �߰��� �� �ִ�.
	
	public static void main(String[] ar) {
		Random random = new Random();
		
		//setSeed(int) ���� �߻��� ���ذ�
		random.setSeed(241);
		//random.setSeed(System.currentTimeMillis());
		System.out.println("01) random.nextInt(10) = "+random.nextInt(10));
		System.out.println("02) random.nextInt(100) = "+random.nextInt(100));
		System.out.println("03) random.nextInt(1000) = "+random.nextInt(1000));
		System.out.println("04) random.nextInt(10000) = "+random.nextInt(10000));
	}
}
