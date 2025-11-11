package com.faik.IleriSeviyeJava.Item12;

import java.util.HashMap;
import java.util.Map;


public class ItemTenTest {
	public static void main(String[] args) {

		//integer type 
//		System.out.println(10 == 20);
		//char type
//		System.out.println('a' == 'b');
		
//		System.out.println('a' == 97.0 );
		
//		System.out.println(true == true);
		
//		System.out.println((int) 'a'); // char to int
//		System.out.println('a' == 97 ); // char is automaticate
//		System.out.println('a' + 1); // char is automaticali
//		System.out.println((char) 98); // cast int to char
		
//		DenemeSınıfı d = new DenemeSınıfı(1, 2);
//		DenemeSınıfı d2 = new DenemeSınıfı(1,2);
//		System.out.println(d == d2);
//		System.out.println(d.equals(d));
	
	//Part2
		DenemeSınıfı d = new DenemeSınıfı(10, 11);
		DenemeSınıfı d2 = new DenemeSınıfı(10, 11);
		
		if(d.equals(d2))
			System.out.println("Biz eşitiz");
		else 
			System.out.println("Değiliz");
		
		
		//Part7
		DenemeSınıfOvrd deneme1 = new DenemeSınıfOvrd(1, 2);
		DenemeSınıfOvrd deneme2 = new DenemeSınıfOvrd(3, 4);
		DenemeSınıfOvrd deneme3 = new DenemeSınıfOvrd(1, 2);
		
		System.out.println(deneme1.hashCode());
		System.out.println(deneme2.hashCode());
		System.out.println(deneme3.hashCode());
		

		Map<DenemeSınıfOvrd, String> map = new HashMap<>();
		map.put(new DenemeSınıfOvrd(1, 2), "İlk Eleman");
		
		System.out.println(map.get(new DenemeSınıfOvrd(1, 2)));
	}
	
	

	
}
