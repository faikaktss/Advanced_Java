package com.faik.IleriSeviyeJava.Item3;

import java.util.HashMap;




//Uygulamanın tamamında yalnızca tek bir örnek oluşturmamızı sağlar
public class LazyCache implements Cache{
	//Sadece çağırıldığı zaman oluşturulur
	private static LazyCache instance;

	private HashMap<Object, Object> map;
	
	private LazyCache() {
		map = new HashMap<Object, Object>();
	}
	
	@Override
	public void put(Object key, Object value) {
		map = new HashMap<Object,Object>();
	}

	@Override
	public Object get(Object key) {
		return map.get(key);
	}
	
	public static LazyCache getIstance() {
		
		if(instance == null) {
			instance = new LazyCache();
		}
		return instance;
	}

}
