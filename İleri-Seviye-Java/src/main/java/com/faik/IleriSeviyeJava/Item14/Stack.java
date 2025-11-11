package com.faik.IleriSeviyeJava.Item14;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public String stackName;
	
	public String getStackName() {
		return stackName;
	}
	
	public void setStackName(String stackName) {
		this.stackName = stackName;
	}
	
	public Stack() {
		this.elements = new Object(DEFAULT_INITIAL_CAPACITY);
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() {
		if(size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null;
		return result;
	}
	
	public boolean isEmpty() {
		return size  == 0;
	}
	
	private void ensureCapacity() {
		if(elements.length == size)
				elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
	
	//Deep Copy'e kayıyor biraz
	@Override
	public Stack clone() {
		try {
			Stack result = (Stack) super.clone();
			result.elements = elements.clone();
			return result;
		} catch (Exception e) {
			throw new AssertionError();
		}
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Stack stack = new Stack();
		String[] numaralar = {"1","2","3","4"};
		for(String arg:numaralar)
			stack.push(arg);
		
		Stack copy = (Stack) stack.clone();
		
		while(!stack.isEmpty())
			System.out.println(stack.pop() + " ");
		
		System.out.println();
		
		while(!copy.isEmpty())
			System.out.println(copy.pop() + " ");
	}
}
