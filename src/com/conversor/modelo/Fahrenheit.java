package com.conversor.modelo;

public class Fahrenheit extends Temperatura {

	public Fahrenheit(double valor) {
		super(valor);
	}

	@Override
	public double resultado() {
		return (this.valor * 1.8) +32;
	}

}
