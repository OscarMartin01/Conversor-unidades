package com.conversor.modelo;

public class MultiplicarValor extends Conversion {

	public MultiplicarValor(double entrada, double valor) {
		super(entrada, valor);
	}

	@Override
	public double resultado() {
		return this.entrada * this.valor;
	}

}
