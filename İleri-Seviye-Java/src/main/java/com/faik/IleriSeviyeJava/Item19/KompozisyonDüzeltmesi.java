package com.faik.IleriSeviyeJava.Item19;

import java.util.HashSet;
import java.util.Set;

public class KompozisyonDüzeltmesi {

	//Burada ise sadece add metodunu kullanmak istediğim için en iyi kullanım bu olur
	private static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
		set.add("Kötü");
		set.forEach(System.out::println);
	}
}
