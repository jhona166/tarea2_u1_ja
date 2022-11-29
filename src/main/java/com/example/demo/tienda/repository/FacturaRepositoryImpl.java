package com.example.demo.tienda.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;

@Repository
public class FacturaRepositoryImpl implements IFacturaRepository {
	private static List<Factura> baseCliente = new ArrayList<>();
	@Override
	public Factura buscarPorNumero(String numeroFact) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
				//*Mock
		Factura factura = new Factura();
		factura.setNombre("Jhonatan Altamirano");
		factura.setCedula("1727501510");
		factura.setFecha(LocalDateTime.of(2022,12,2,8,30));
		factura.setNumero("001-001-256");
		factura.setTotal(new BigDecimal(240));
		return factura;
	}

	@Override
	public Factura buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Factura cuentaBancaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar(Factura cuentaBancaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}
