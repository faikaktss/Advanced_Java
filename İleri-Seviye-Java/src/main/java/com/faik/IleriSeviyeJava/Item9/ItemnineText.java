package com.faik.IleriSeviyeJava.Item9;

public class ItemnineText {
	
	
	private static long topla() {
		
		long sum = 0;
		
		for(int i=0;i<100;i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		String kelime = new String("bikini");
		String kelime2 = "bikini";
		String kelime3 = "bikini";
		
		//System.out.println( kelime == kelime2);
		
		long start = System.nanoTime();
		topla();
		long end = System.nanoTime();
		long totalTime = end-start;
		
		System.out.println(totalTime);
	}
}
