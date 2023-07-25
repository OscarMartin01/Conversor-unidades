package com.conversor.modelo;

public abstract class Temperatura {

	public double valor;
	
	public Temperatura(double valor) {
		this.valor= valor;
	}
	
	public abstract double resultado();
}
