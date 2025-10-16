package com.faik.IleriSeviyeJava.Item10;

/*
 * Programın ihtiyacı olmadığı bellekleri bulup onları temizlemeye yarar
 * */
public class GarbageCollection {
	
	public void finalize() {
		System.out.println("Çöpler temizlendi");
	}

	public static void main(String[] args) {
		GarbageCollection ali = new GarbageCollection();
		GarbageCollection mehmet = new GarbageCollection();
		GarbageCollection sıla = new GarbageCollection();
		
		ali = null;
		sıla = mehmet;
		
		System.gc();
	}
}
