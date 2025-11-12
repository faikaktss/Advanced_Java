package com.faik.IleriSeviyeJava.Item17;

public class Futbol {
	
	public String takimAdi;
	public int takimOyuncuSayisi;
	
	public Futbol(String takimAdi, int takimOyuncuSayisi) {
		super();
		this.takimAdi = takimAdi;
		this.takimOyuncuSayisi = takimOyuncuSayisi;
	}

	public String getTakimAdi() {
		return takimAdi;
	}

	public void setTakimAdi(String takimAdi) {
		this.takimAdi = takimAdi;
	}

	public int getTakimOyuncuSayisi() {
		return takimOyuncuSayisi;
	}

	public void setTakimOyuncuSayisi(int takimOyuncuSayisi) {
		this.takimOyuncuSayisi = takimOyuncuSayisi;
	}
	
	
}
