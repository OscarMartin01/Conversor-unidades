package com.conversor.modelo;

public class DividirDistancia extends Conversion{

	public DividirDistancia(double distancia, double valor) {
		super(distancia, valor);
	}

	@Override
	public double resultado() {
		return this.entrada*(1/this.valor);
	}
	
	

}
