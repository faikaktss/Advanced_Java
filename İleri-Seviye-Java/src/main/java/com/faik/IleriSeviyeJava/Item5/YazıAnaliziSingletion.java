package com.faik.IleriSeviyeJava.Item5;

public class YazıAnaliziSingletion {
	
	private static final Sözlük türkçe = new Sözlük("Türkçe");
	private static YazıAnaliziSingletion INSTANCE = new YazıAnaliziSingletion();
	
	private YazıAnaliziSingletion() {}
	
	public static boolean isValid() {
		return true;
	}
}
