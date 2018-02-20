package com.eun1310434.API;
import java.util.Random;
public class RandomTest {
	public static void main(String[] ar) {
		Random random = new Random();
		//random.setSeed(1000);
		random.setSeed(System.currentTimeMillis());
		for(int i = 0; i < 5; ++i) {
			System.out.print(random.nextInt(10) + "\t");
		}
	}
}
