package com.example.demo.herencia;

public class ClienteH extends PersonaH{
  boolean afiliado;

public boolean isAfiliado() {
	return afiliado;
}

public void setAfiliado(boolean afiliado) {
	this.afiliado = afiliado;
}
public Integer calcularDescuento() {
	System.out.println("Cliente con 5% de descuento");
	return 5; 
}
	
}
