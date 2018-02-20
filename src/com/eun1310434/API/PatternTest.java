package com.eun1310434.API;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] ar) {
		Pattern pattern = Pattern.compile("^a[b-y]*z$");
		
		Matcher matcher_01 = pattern.matcher("abcd");
		Matcher matcher_02 = pattern.matcher("az");
		Matcher matcher_03 = pattern.matcher("abcz");
		Matcher matcher_04 = pattern.matcher("bcdz");
				
		System.out.println("abcd = " + matcher_01.matches());
		System.out.println("az = " + matcher_02.matches());
		System.out.println("abcz = " + matcher_03.matches());
		System.out.println("bcdz = " + matcher_04.matches());
	}
}
