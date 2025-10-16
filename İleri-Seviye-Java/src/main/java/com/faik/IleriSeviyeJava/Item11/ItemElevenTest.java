package com.faik.IleriSeviyeJava.Item11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ItemElevenTest {
	private static final int BUFFER_SİZE = 0;
	
	
	//1
	public String firstLineofFile(String path) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		
		try {
			return bufferedReader.readLine();
		} finally {
			// TODO: handle finally clause
			bufferedReader.close();
		}
	}
	
	//2
	public String firstLineOfFileWell(String path, String defaulValue) {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			return bufferedReader.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			return defaulValue;
		}
	}
	
	
	/*
	 * Burada anlatılmak istenen Eğer try'ın ve finally'nin içinde bir hata fırlatılırsa
	 * ve catch bloğunda bunu yakalayacak bir şey olmazsa
	 * try'ın içindeki hatayı görmez
	 * Hemen bunun bi altında onun örneğini görebiliriz
	 * */
	
	
	public static void main(String[] args) {
		//try-catch finally
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("Dosya Yolu"));
			while(scanner.hasNext())
					System.out.println(scanner.nextLine());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(scanner!=null) {
				System.out.println("Hello");
				scanner.close();
			}
		}
		
		try {
			int data = 25/0;
			System.out.println(data);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Ali");
		}finally {
			int data = 25/0;
			System.out.println("Ben hep çalıştım");
		}
	}
}
