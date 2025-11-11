package com.faik.IleriSeviyeJava.Item10;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemTenTest {

	private static Random random = new Random();
	/*
	 * Bir statiği garbageCollection temizleyemez
	 * */
	public static final ArrayList<Double> list = new ArrayList<Double>(100000);
	
	
	@GetMapping("/hello1")
	public static void main(String[] args)  throws InterruptedException{
		for(int i=0;i<100000;i++) {
			list.add(random.nextDouble());
		}
	}
}
