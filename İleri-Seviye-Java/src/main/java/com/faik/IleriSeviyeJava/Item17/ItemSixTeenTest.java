package com.faik.IleriSeviyeJava.Item17;

public class ItemSixTeenTest {
	//Encapsulation
	/*
	 * 1 -> Doğrudan erişilebilirliği kes
	 * 2 -> Verilerime kontrol sağlıyorum
	 * 3 -> Read only
	 * 4 -> Data hiding ...
 	 * */
	
	public static void main(String[] args) {
		
		Futbol fbFutbol = new Futbol("Fenerbahçe", 35);
		
		fbFutbol.setTakimOyuncuSayisi(35);
	}
	
	
}
