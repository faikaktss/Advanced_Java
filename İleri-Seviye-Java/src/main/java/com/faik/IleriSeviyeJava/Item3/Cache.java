package com.faik.IleriSeviyeJava.Item3;

/*
 * Singletion nedir?
 * Singleton, yazılımda bir sınıftan sadece bir tane nesne oluşturulmasına
 * ve bu nesneye her yerden ulaşılmasını sağlayan bir tasarım desenidir.
 * */


public interface Cache <F,S>{
	//Cache veriyi buzdolabına kaydeder hızlıca ulaşmamızı sağlar
	
	public void put(F key, S value);
	public S get(F key);
}
