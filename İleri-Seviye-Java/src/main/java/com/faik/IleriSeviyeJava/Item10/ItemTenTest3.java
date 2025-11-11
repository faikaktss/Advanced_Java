package com.faik.IleriSeviyeJava.Item10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemTenTest3 {

	@GetMapping("/hello3")
	public static void main(String[] args){
		Stack stack = new Stack();
		
		for(int i=1;i<100000;i++) {
			stack.push(i);
		}
		
		for(int i=1;i<100000;i++) {
			stack.pop();
		}
		System.out.println("hello");
	}
}
