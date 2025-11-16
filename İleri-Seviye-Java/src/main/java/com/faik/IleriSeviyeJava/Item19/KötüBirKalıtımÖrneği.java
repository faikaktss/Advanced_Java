package com.faik.IleriSeviyeJava.Item19;

import java.util.HashSet;import org.hibernate.internal.build.AllowSysOut;

public class KötüBirKalıtımÖrneği extends HashSet<Object>{
	
	public static void main(String[] args) {
		
		KötüBirKalıtımÖrneği kalıtımÖrneği = new KötüBirKalıtımÖrneği();
		
		/*
		 * Burada sadece add metodunu kullanmak istedim
		 * ama hashset'in içindeki diğer şeylerede gereksiz erişim kaplıyor
		 * */
		kalıtımÖrneği.add("kötü");
		kalıtımÖrneği.forEach(System.out::println);
	}
}
