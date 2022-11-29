package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Factura {
	private String nombre;
	private String cedula;
	private LocalDateTime fecha;
	private BigDecimal total;
	private String numero;
	
	
	//Set and Get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

}
