package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.ClienteAfiliadoSB;
import com.example.demo.spring.FacturacionSB;
import com.example.demo.spring.VendedorSB;
import com.example.tradicional.ClienteFfaa;

@SpringBootApplication
public class Deber1U1JaApplication implements CommandLineRunner{
	@Autowired 
	private ClienteAfiliadoSB clienteAF;
	@Autowired 
	private VendedorSB vendedorSB;
	@Autowired
	private FacturacionSB facturaSB;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Deber1U1JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SpringBoot");
		this.clienteAF.setCodA("AF12");
		this.clienteAF.setId(16);
		this.clienteAF.setNombre("Franklin Alvear");
		this.clienteAF.setCedula("1727501516");
		this.clienteAF.setDireccion("San Carlos");
		
		this.vendedorSB.setNombre("Geovana Caceres");
		System.out.println(clienteAF);
		
		facturaSB.Facturacion(12, LocalDateTime.of(2022,12,2,8,30), vendedorSB, clienteAF, 216.30);
	}

}
