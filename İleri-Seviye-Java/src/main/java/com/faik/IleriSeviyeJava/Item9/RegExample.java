package com.faik.IleriSeviyeJava.Item9;

import java.util.regex.Pattern;

public class RegExample {

	
	
	private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD] | D?C(0,3)");
	
	public static boolean isRomanNumeral(String s) {
		return s.matches("^(?=.)M*(C[MD] | D?C(0,3)");
	}
	
	static boolean isNonNumeral(String s) {
		return ROMAN.matcher(s).matches();
	}
}
