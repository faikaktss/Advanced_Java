package com.faik.IleriSeviyeJava.Item12;

public class DenemeSınıfOvrd {
	private  int a , b;
	
	public DenemeSınıfOvrd(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(!(o instanceof DenemeSınıfOvrd))
			return false;
		
		DenemeSınıfOvrd c = (DenemeSınıfOvrd) o;
		
		return Integer.compare(a, c.a) == 0 && Integer.compare(b, c.b) == 0;
	}
	
	
	
	/*
	 * Bunun amacı hash-tabanlı koleksiyonlarda performanıs artırmak 
	 * ve çakışmaları en aza indirmek için yapılmıştır
	 * */
	@Override
	public int hashCode() {
		int result = Integer.hashCode(b);		
		result = 31*result + Integer.hashCode(a);
		return result;
	}
}
