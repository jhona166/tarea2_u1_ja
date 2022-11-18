package com.example.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facturacion factura = new Facturacion();
		factura.Facturacion(1,LocalDateTime.of(2022,12,2,8,30),"Jhonatan Arias","Jimmy Ortiz","Aparador",236.36,"AF");
		
		factura.Facturacion(2,LocalDateTime.of(2022,12,2,8,30),"Susana Saenz","Karla Mera","Zapatera",396.36,"FA");
	}
}
