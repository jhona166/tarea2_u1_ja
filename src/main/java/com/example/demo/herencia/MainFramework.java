package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ClienteFfaaH cliente = new ClienteFfaaH();
	cliente.setNombre("Jhonatan Altamirano");
	cliente.setCedula("1727501510");	
	cliente.setTelefono("2316523");
	cliente.setDireccion("San Carlos");
	cliente.setCodFa("F125");
	
	VendedorH vendedor = new VendedorH();
	vendedor.setCedula("123456789");
	vendedor.setNombre("Danilo");
	
	FacturacionH factura= new FacturacionH();
	
	//int id, LocalDateTime fecha,VendedorH vh,ClienteH ch, String producto,double total
	factura.Facturacion(1, LocalDateTime.of(2022,12,2,8,30),vendedor,cliente,236.56);
	}

}
