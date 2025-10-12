package com.faik.IleriSeviyeJava.Item5;

import java.util.function.Supplier;

public class ItemFiveTest {
	
	public static void main(String[] args) {
		
		YazıAnaliziDependencyInjection asd = new YazıAnaliziDependencyInjection(new Sözlük("Türkçe"));
		asd.isValid();
		
		//Lambda function
		Supplier<String> fs = () -> "Faik";
		fs.get();
		
		Supplier<String> dahakısa = () -> YazıAnaliziUtility.upuzunbirmetotyazıyorumşuanaklımagelenkelimelerile();
		
		dahakısa.get();
		
		////
		
		double  randomSayi = Math.random();
		System.out.println(randomSayi);
		System.out.println(randomSayi);
		
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		
	}
}
