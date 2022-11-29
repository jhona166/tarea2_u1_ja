package com.example.demo.tienda.repository;

import com.example.demo.tienda.modelo.Factura;

public interface IFacturaRepository {

		public Factura buscarPorNumero(String numero);
		
		//CRUD
		public Factura buscar(Integer id);
		//Vamos a necesitar
		public void actualizar(Factura cuentaBancaria);
		public void insertar(Factura cuentaBancaria);
		public void borrar(Integer id);
}

