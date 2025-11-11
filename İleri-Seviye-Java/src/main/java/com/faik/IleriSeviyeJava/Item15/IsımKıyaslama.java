package com.faik.IleriSeviyeJava.Item15;

import java.util.Comparator;

public class IsımKıyaslama implements Comparator<Kitap>{

	public int compare(Kitap m1, Kitap m2) {
		return m1.getIsım().compareTo(m2.getIsım());
	}
}
