package com.example.demo.spring;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class FacturacionSB {
	


	private LocalDateTime fecha;
	private VendedorSB vendedor;
	private ClienteSB cliente;
	private ProductoSB producto;
	private double total;
	
	private int id;
	@Override
	public String toString() {
		return "FacturacionH [id=" + id + ", fecha=" + fecha + ", vendedor=" + vendedor + ", cliente=" + cliente
				+ ", total=" + total + "]";
	}
	
	public void Facturacion(int id, LocalDateTime fecha,VendedorSB vh,
		ClienteSB ch,double total) {
		
		this.id = id;
		this.fecha = LocalDateTime.now();
		this.total = total;
		
		Integer valorDescuento = ch.calcularDescuento();
		System.out.println("Valor: "+valorDescuento);
		this.cliente = ch;
		this.vendedor = vh;
		
		this.generarFactura(this);
	}
	
	public void generarFactura(FacturacionSB factura) {
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
	public VendedorSB getVendedor() {
		return vendedor;
	}
	public void setVendedor(VendedorSB vendedor) {
		this.vendedor = vendedor;
	}
	public ClienteSB getCliente() {
		return cliente;
	}
	public void setCliente(ClienteSB cliente) {
		this.cliente = cliente;
	}
	public ProductoSB getProducto() {
		return producto;
	}
	public void setProducto(ProductoSB producto) {
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
