package com.faik.IleriSeviyeJava.Item19;

import java.awt.List;
import java.util.ArrayList;

public class Kütüphane {

	private final ArrayList<Kitap> kitaplar;
	
	public Kütüphane(ArrayList<Kitap> kitapListesi) {
		this.kitaplar = kitapListesi;
	}
	
	public ArrayList<Kitap> KütüphanedekiTümKitaplar(){
		return kitaplar;
	}
	
	
	
}
