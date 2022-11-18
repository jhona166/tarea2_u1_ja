package com.example.tradicional;

import java.time.LocalDateTime;

public class Facturacion {
	private int id;
	private LocalDateTime fecha;
	private Vendedor vendedor;
	private Cliente cliente;
	private Producto producto;
	private double total;
	private String tipo;
	
	@Override
	public String toString() {
		return "Facturacion [id=" + id + ", fecha=" + fecha + ", vendedor=" + vendedor + ", cliente=" + cliente
				+ ", producto=" + producto + ", total=" + total + ", tipo=" + tipo + "]";
	}

	public void Facturacion(int id, LocalDateTime fecha, String vendedor,
			String cliente, String producto,double total,String tipo) {
		
		this.id = id;
		this.fecha = LocalDateTime.now();
		this.total = total;
		this.tipo = tipo;
		Cliente clienteObjeto = new Cliente();
		clienteObjeto.setNombre(cliente);
		Vendedor vendedorObjeto = new Vendedor();
		vendedorObjeto.setNombre(vendedor);
		Producto productoObjeto = new Producto();
		productoObjeto.setNombre(producto);
		
		this.cliente =clienteObjeto;
		this.vendedor = vendedorObjeto;
		this.producto = productoObjeto;
		
		//Afiliado(AF),Fuerzas Armadas(FA)
		if(tipo.equals("AF")) {
			ClienteAfiliado clienteAF = new ClienteAfiliado();
			clienteAF.setCodA("A231");
			this.cliente = clienteAF;
			System.out.println("Aplica descuento de Afiliado");
			
		}else {
			ClienteFfaa clienteFA = new ClienteFfaa();
			clienteFA.setCodFa("F521");
			this.cliente = clienteFA;
			System.out.println("Aplica descuento Fuerzas Armadas");
		
		}
		
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
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
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
