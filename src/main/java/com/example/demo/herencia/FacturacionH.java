package com.example.demo.herencia;

import java.time.LocalDateTime;

public class FacturacionH {
	


	private LocalDateTime fecha;
	private VendedorH vendedor;
	private ClienteH cliente;
	private ProductoH producto;
	private double total;
	
	private int id;
	@Override
	public String toString() {
		return "FacturacionH [id=" + id + ", fecha=" + fecha + ", vendedor=" + vendedor + ", cliente=" + cliente
				+ ", total=" + total + "]";
	}
	
	public void Facturacion(int id, LocalDateTime fecha,VendedorH vh,
		ClienteH ch,double total) {
		
		this.id = id;
		this.fecha = LocalDateTime.now();
		this.total = total;
		
		Integer valorDescuento = ch.calcularDescuento();
		System.out.println("Valor: "+valorDescuento);
		this.cliente = ch;
		this.vendedor = vh;
		
		this.generarFactura(this);
	}
	
	public void generarFactura(FacturacionH factura) {
		System.out.println("Se ha generado la factura");
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
	public VendedorH getVendedor() {
		return vendedor;
	}
	public void setVendedor(VendedorH vendedor) {
		this.vendedor = vendedor;
	}
	public ClienteH getCliente() {
		return cliente;
	}
	public void setCliente(ClienteH cliente) {
		this.cliente = cliente;
	}
	public ProductoH getProducto() {
		return producto;
	}
	public void setProducto(ProductoH producto) {
		this.producto = producto;
	}
	
	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}

	//ToString
	


}
