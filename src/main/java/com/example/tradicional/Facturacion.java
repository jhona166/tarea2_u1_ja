package com.example.tradicional;

import java.time.LocalDateTime;

public class Facturacion {
	private int id;
	private LocalDateTime fecha;
	private Vendedor vendedor;
	private Cliente cliente;
	private Productos productos;
	private double total;
	
	
	public void Facturacion(int id, LocalDateTime fecha, String vendedor,
			String cliente, String productos,double total) {
		
		this.id = id;
		this.fecha = LocalDateTime.now();
		
		this.total = total;
		this.generarFactura(this);
		
		Cliente clienteObjeto = new Cliente();
		clienteObjeto.setNombre(cliente);
		this.cliente = clienteObjeto;
		
		System.out.println("Se ha generado la Factura ");
		this.generarFactura(this);
		
	}
	
	public void generarFactura(Facturacion factura) {
		System.out.println(factura);
	}
	
	//Set and Get
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getFechaAgenda() {
		return fecha;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fecha = fechaAgenda;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	
	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}

	//ToString
	@Override
	public String toString() {
		return "Facturacion [id=" + id + ", fecha=" + fecha + ", vendedor=" + vendedor + ", cliente=" + cliente
				+ ", productos=" + productos + ", total=" + total + "]";
	}


}
