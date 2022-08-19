package com.eudriscabrera.examples.java.lambdas.lab01;

public class EjecutaOperacion {
	public static boolean validador (Operacion op, int numero){
	    return op.validar(numero);
	  }
	
	 //Agregar su codigo aquí
	
	public Operacion esPar() {
		return (int numero) -> numero % 2 ==0;
	}
	
	public Operacion esImpar() {
		return (int numero) -> numero % 2 !=0;
	}
	
	

}
