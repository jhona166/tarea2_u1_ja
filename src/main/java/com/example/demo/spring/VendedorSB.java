package com.example.demo.spring;
import org.springframework.stereotype.Component;

@Component
public class VendedorSB extends PersonaSB {
	String codVend;

	public String getCodVend() {
		return codVend;
	}

	public void setCodVend(String codVend) {
		this.codVend = codVend;
	}	

	
}
