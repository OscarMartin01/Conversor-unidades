package com.conversor.modelo;

public abstract class Conversion {
	
	public double entrada;
	public double valor;
	 
	Conversion(double entrada, double valor){
		this.entrada= entrada;
		this.valor= valor;
	}
	
	public abstract double resultado();
	 
}
