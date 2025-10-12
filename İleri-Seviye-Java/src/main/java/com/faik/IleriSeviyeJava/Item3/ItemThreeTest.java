package com.faik.IleriSeviyeJava.Item3;

public class ItemThreeTest {

	public static void main(String[] args) {
		//İki thread aynı anda benim single'ıma girerse ne olur?
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println("Hashcode of Lazy: "+ LazyCache.getIstance().hashCode());
				System.out.println("Hashcode of Enum: "+ CacheSinglation.INSTANCE.hashCode());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hashcode of Lazy: "+ LazyCache.getIstance().hashCode());
				System.out.println("Hashcode of Enum: "+ CacheSinglation.INSTANCE.hashCode());				
			}
		}).start();
	}
}
