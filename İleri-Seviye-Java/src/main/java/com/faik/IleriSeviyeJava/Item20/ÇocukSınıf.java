package com.faik.IleriSeviyeJava.Item20;

public class ÇocukSınıf extends AnaSınıf{

	final int deger;
	
	public ÇocukSınıf(int deger) {
		this.deger = deger;
	}
	
	@Override
	void overrideMe() {
		System.out.println(deger);
	}
	
	public static void main(String[] args) {
		ÇocukSınıf cocuk = new ÇocukSınıf(42);
	}
}
