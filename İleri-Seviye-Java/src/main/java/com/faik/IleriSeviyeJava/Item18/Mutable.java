package com.faik.IleriSeviyeJava.Item18;

import jdk.incubator.foreign.ValueLayout;

public class Mutable{
	
	private int realValue;
	
	public Mutable(int value) {
		
		realValue = value;
	}
	
	public int getValue() {
		return realValue;
	}
	
	public int setValue(int newValue) {
		return realValue = newValue;
	}
	
	public static void main(String[] args) {
		Mutable obj = new Mutable(4);
		Immutable ımbObj = (Immutable) obj;
		System.out.println(ımbObj.getValue());
		obj.setValue(8);
		System.out.println(ımbObj.getValue());
	}
}
