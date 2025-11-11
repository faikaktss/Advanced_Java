package com.faik.IleriSeviyeJava.Item14;

public class ItemThirteenTest {
	
	public static void main(String[] args) {
		
		
		/*
		 * ShallowCopy sadece nesnenin kendisini kopyalar
		 * içindeki referansları kopyalamaz
		 * */
		Stack st = new Stack();
		Stack st1 = st;
		
		
		//Deep Copy
		Stack stc = new Stack();
		stc.stackName = "furkan";
		
		Stack stc2 = new Stack();
		stc2.stackName = stc.stackName;
	}
}
