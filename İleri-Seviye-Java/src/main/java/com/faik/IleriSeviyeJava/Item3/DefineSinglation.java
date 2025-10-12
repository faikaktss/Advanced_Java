package com.faik.IleriSeviyeJava.Item3;

public class DefineSinglation {
	
	public static DefineSinglation ds = new DefineSinglation();

	private DefineSinglation() {
		super();
	}

	public static DefineSinglation getIstance() {
		return ds;
	}


	
}
