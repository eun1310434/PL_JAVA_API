/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.API;
import java.util.Random;
public class RandomAPI {
	//Random Class
	//: 난수 발생를 관리하는 클래스
	//: Math.random()보다 고르게 분포
	//: 다양한 난수 발생
	//: 좀더 깊게 들어가면 난수발생되 패턴을 발견할 수 있다.
	
	public static void main(String[] ar) {
		Random random = new Random();
		
		//setSeed(int) 난수 발생의 기준값
		random.setSeed(241);
		//random.setSeed(System.currentTimeMillis());
		System.out.println("01) random.nextInt(10) = "+random.nextInt(10));
		System.out.println("02) random.nextInt(100) = "+random.nextInt(100));
		System.out.println("03) random.nextInt(1000) = "+random.nextInt(1000));
		System.out.println("04) random.nextInt(10000) = "+random.nextInt(10000));
	}
}
