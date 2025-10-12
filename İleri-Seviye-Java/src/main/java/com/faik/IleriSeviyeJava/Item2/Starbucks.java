package com.faik.IleriSeviyeJava.Item2;

import java.security.PublicKey;

public class Starbucks {

	// Gerekli
	private  String kahveBoyutu;
	
	// Seçime göre değişir
	private String laktosuzSütMiktarı;
	private String yumuşatıcı;
	

	
	public static class Builder {
		
		//Gerekli 
		private String kahveBoyutu;
		
		//Seçime göre değişir
		private String laktosuzSütMiktarı;
		private String yumuşatıcı;
		
		public Builder(String kahveBoyutu) {
			super();
			this.kahveBoyutu = kahveBoyutu;
		}
		
		public Builder laktosuzTafya(String laktosuzSüt) {
			laktosuzSütMiktarı = laktosuzSüt;
			return this;
		}
		
		public Builder yumuşatıcı(String yumuşatıcıı) {
			yumuşatıcı =  yumuşatıcıı;
			return this;
		}
		
		public Starbucks build() {
			return new Starbucks(this);
		}
		
	}
	
	public Starbucks (Builder builder) {
		kahveBoyutu = builder.kahveBoyutu;
		laktosuzSütMiktarı = builder.laktosuzSütMiktarı;
		yumuşatıcı = builder.yumuşatıcı;
	}
	

}
