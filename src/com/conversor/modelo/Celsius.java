package com.conversor.modelo;

public class Celsius extends Temperatura{

	public Celsius(double valor) {
		super(valor);
	}

	@Override
	public double resultado() {
		return (this.valor-32)/1.8;
	}
}
