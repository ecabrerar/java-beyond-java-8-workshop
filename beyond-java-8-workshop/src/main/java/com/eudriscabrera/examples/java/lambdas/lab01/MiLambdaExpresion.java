package com.eudriscabrera.examples.java.lambdas.lab01;

public class MiLambdaExpresion {

	public static void main(String[] args){
	    EjecutaOperacion ejeOp = new EjecutaOperacion();

	    Operacion opPar = ejeOp.esImpar();
	    boolean resultado =   ejeOp.validador(opPar,101);

	    if(resultado) {
	    	System.out.println("es Impar");
	    }
	    
	    
	    
	  }
}
