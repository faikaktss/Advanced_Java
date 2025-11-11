package com.faik.IleriSeviyeJava.Item12;

import java.awt.Color;

public class ColorPointInherit extends Point{
	
	private final Color color;
	
	public ColorPointInherit(int x, int y,Color color) {
		super(x, y);
		this.color = color;
	}

	
	/*
	 * Point ten miras alıp override edersek 
	 * Simetri bozulur
	 * Bunu yapmak yerine Point'i component olarak verin diyor
	 * */
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof ColorPointInherit))
			return false;
		return super.equals(o) && ((ColorPointInherit) o ).color == color;
	}

}
