package com.faik.IleriSeviyeJava.Item5;

public class YazıAnaliziDependencyInjection {

	/*
	 * Buradaki esneklik Bağımlılık kurucu metottan gelir
	 * Utilitiy ve singletion da böyle bir şey yoktur
	 * */ 
	
	private final Sözlük sözlük;
	
	public YazıAnaliziDependencyInjection(Sözlük sözlük) {
		this.sözlük = sözlük;
	}
	
	public boolean isValid() {
		return true;
	}
}
