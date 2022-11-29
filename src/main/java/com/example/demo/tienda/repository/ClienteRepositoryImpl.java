package com.example.demo.tienda.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;
@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	@Override
	public Cliente buscarPorNumero(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscar(Integer id) {
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
