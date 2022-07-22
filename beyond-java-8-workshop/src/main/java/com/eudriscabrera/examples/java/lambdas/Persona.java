package com.eudriscabrera.examples.java.lambdas;

/**
 * 
 * @author eudriscabrera
 * @date Sep 21, 2021
 *
 */
public class Persona {
	private String nombre;
	private String apellido;
	private Genero genero;
	private int edad;

	public Persona(String nombre, String apellido, Genero genero, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	public void printPersona() {
		System.out.println(String.format("Nombre : %s Gnero: %s edad:%d", getNombre(), getGenero(), getEdad()));
	}

}
