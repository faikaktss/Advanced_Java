package com.faik.IleriSeviyeJava.Item15;

//Comparable ile bu oluşturduğumuz değerleri belirli bir sıraya koyabiliyoruz
public class Kitap implements Comparable<Kitap>{

	private String isim;
	private int sayfa;
	
	public Kitap(String isim, int Sayfa) {
		this.isim = isim;
		this.sayfa = sayfa;
	}
	
	public String getIsım() {
		return isim;
	}
	
	public void setIsım(String isim) {
		this.isim = isim;
	}
	
	public int getSayfa() {
		return sayfa;
	}
	
	public void setSayfa(int sayfa) {
		this.sayfa = sayfa;
	}
	
	@Override
	public int compareTo(Kitap o) {
		return this.sayfa - o.sayfa;
	}
	
	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", sayfa=" + sayfa + "]";
	}
}
