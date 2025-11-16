package com.faik.IleriSeviyeJava.Item16;

public class GuvenliKod {
	
	public static final String[] ANLASMALİ_SİTELER = new String[] {"http://hızlıguvenlitemizhbaber.com,"
			+ "http://engercekcihaberler.com"};
	
	public static void haberleriAl(String url) {
		for(String haberler: ANLASMALİ_SİTELER) {
			if(url.equals(haberler))
				//Bla bla
		}
	}
}
