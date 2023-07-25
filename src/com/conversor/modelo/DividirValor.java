package com.conversor.modelo;

public class DividirValor extends Conversion{

	public DividirValor(double entrada, double valor) {
		super(entrada, valor);
	}
	
	@Override
	public double resultado() {
		return this.entrada / this.valor;
	}
	
}
