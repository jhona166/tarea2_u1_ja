package com.example.demo.herencia;

public class ClienteAfiliadoH extends ClienteH {
		public String codA;

		public String getCodA() {
			return codA;
		}

		public void setCodA(String codA) {
			this.codA = codA;
		}
		public Integer calcularDescuento() {
			System.out.println("Cliente afiliado 30% de descuento");
			return 30; 
		}
}
