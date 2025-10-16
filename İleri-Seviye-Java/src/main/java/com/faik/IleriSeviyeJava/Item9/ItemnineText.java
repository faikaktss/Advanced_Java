package com.faik.IleriSeviyeJava.Item9;

import java.util.ArrayList;

public class ItemnineText {
	
	
	private static long topla() {
		
		//Eğer burası Long olsaydı saniye farkı daha fazla olacaktı
		long sum = 0;
		
		for(int i=0;i<100;i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		String kelime = new String("bikini");
		String kelime2 = "bikini";
		String kelime3 = "bikini";
		
		//System.out.println( kelime == kelime2);
		
		long start = System.nanoTime();
		topla();
		long end = System.nanoTime();
		long totalTime = end-start;
		
		System.out.println(totalTime);
		
		//Autoboxing Unboxing
		
		
		/*
		 * Normalde, döngü içinde ınteger.add(i); yazsaydık, Java arka planda otomatik 
		 * olarak ilkel int değerini bir Integer nesnesine 
		 * dönüştürecekti. Buna Autoboxing denir.
		 * */
		
		/*
		 * 	Özellik,İlkel Tipler (Örn: int),Sarmalayıcı Sınıflar (Örn: Integer)
			Kategori,Temel Veri Tipi (Primitive Type),Nesne/Sınıf (Object/Class)
			Bellekteki Yer,Doğrudan Yığın (Stack) bellekte tutulur.,Bir nesne oldukları için Yığın (Heap) bellekte tutulur ve Yığın'da (Stack) bu nesneye referans (adres) tutulur.
			Değer,"Doğrudan değeri tutar. (Örn: 5, 10.5)",Değeri sarmalayan (içine alan) bir nesne tutar.
			Varsayılan Değer,"Her zaman bir varsayılan değeri vardır. (int için 0, boolean için false).",Varsayılan değeri null'dur (hiçbir nesneyi işaret etmiyor).
			Null Atanabilir mi?,Hayır.,"Evet, null atanabilir."
			Performans,"Çok daha hızlıdır, çünkü ekstra nesne oluşturma maliyeti yoktur.","Performans olarak ilkel tiplere göre daha yavaştır, çünkü nesne oluşturma ve Autoboxing/Unboxing maliyeti vardır."
			Kullanım Yeri,"Hesaplamalar, döngü sayaçları gibi hızlı işlem gerektiren yerler.","Koleksiyonlar (ArrayList, HashMap), Genel Tipler (Generics), Java'nın nesne gerektiren diğer yerleri."
		 * */
		ArrayList<Integer> ınteger = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			ınteger.add(Integer.valueOf(i)); // Long ile long arasındaki fark Long'u çevirmeye çalıştığı için saniye farkı bu kadar yüksek oluyor
		}
	}
}
