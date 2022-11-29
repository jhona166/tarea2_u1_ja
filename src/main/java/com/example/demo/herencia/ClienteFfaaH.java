package com.example.demo.herencia;

public class ClienteFfaaH extends ClienteH {
	public String codFa;

	public String getCodFa() {
		return codFa;
	}

	public void setCodFa(String codFa) {
		this.codFa = codFa;
	}
	
	public Integer calcularDescuento() {
		System.out.println("Cliente Fuerzas armadas 20% de descuento");
		return 20; 
	}
}
