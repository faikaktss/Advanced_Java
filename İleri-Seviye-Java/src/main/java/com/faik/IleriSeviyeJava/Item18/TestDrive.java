package com.faik.IleriSeviyeJava.Item18;

import java.sql.Date;

public class TestDrive {

	public static void main(String[] args) {
		//Mutable Immutable Nedir?
		
		//Immutable
		String  isim = new String("İsim");
		System.out.println(isim.toLowerCase());
		System.out.println(isim);
		
		//Mutable
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
		
		date.setDate(7);
		System.out.println(date);
		
	}
}
