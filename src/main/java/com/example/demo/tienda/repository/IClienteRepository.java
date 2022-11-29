package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;

public interface IClienteRepository {
	public Cliente buscarPorNumero(String cedula);
	
	//CRUD
	public Cliente buscar(Integer id);
	//Vamos a necesitar
	public void actualizar(Factura cuentaBancaria);
	public void insertar(Factura cuentaBancaria);
	public void borrar(Integer id);
}
