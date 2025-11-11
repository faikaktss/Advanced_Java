package com.faik.IleriSeviyeJava.Item13;

public class Request {
	
	public String header;
	
	public String body;
	
	public String getHeader() {
		return header;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	
	//ToString override
	//Burada Override etmemizin amacı Nesnenin içeriğini okunabilir bir hale getirmek için override ediyoruz
	@Override
	public String toString() {
		return "Request[header" + header +", boyd = " + body + "] ";
	}
}
