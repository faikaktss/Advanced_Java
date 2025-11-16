package com.faik.IleriSeviyeJava.Item16;

public class Virus {
	
	public String virus() {
		
		/*
		 * Burada bir güvenlik açığı oluşuyor.
		 * Bu şekilde güvenlik açığını tespit edebilirsiniz 
		 * bunu önlemek içinse private yapmamız lazım 
		 * */
		String virusUrl = "kötühaberler.com";
		GuvenliKod.ANLASMALİ_SİTELER[0] = virusUrl;
		GuvenliKod.haberleriAl(virusUrl);
		
		return "";
	}
}
