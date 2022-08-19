package com.eudriscabrera.examples.java.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 
 * @author eudriscabrera
 *
 */
public class CriterioBusqueda {

	private void printPersonas(List<Persona> personas) {


		
		for (Persona persona : personas) {
			persona.printPersona();
		}

		personas.removeIf((Persona p)-> p.getEdad() < 18);  
		// forEach(Persona::printPersona);
	}

	private void printPersonasMayoresQue(List<Persona> personas, int edad) {

		for (Persona persona : personas) {
			if (persona.getEdad() > edad) {
				persona.printPersona();
			}
		}
	}

	private void printPersonasMayoresQueConInterface(List<Persona> personas, Validador validador) {

		for (Persona persona : personas) {
			if (validador.validar(persona)) {
				persona.printPersona();
			}
		}
	}

	private void printPersonasMayoresQueConPredicate(List<Persona> personas, Predicate<Persona> validador) {

		for (Persona persona : personas) {
			if (validador.test(persona)) {
				persona.printPersona();
			}
		}
	}

	
	private void printPersonasEntreDosEdades(List<Persona> personas, int edadMenor, int edadMayor) {
		for (Persona persona : personas) {
			if (persona.getEdad() > edadMenor && persona.getEdad() < edadMayor) {
				persona.printPersona();
			}
		}

	}

	public void ejecutar() {
		System.out.println("Criterio de busqueda en Java");

		List<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Rita", "Perez", Genero.FEMENINO, 15));
		personas.add(new Persona("Maria", "Rosa", Genero.FEMENINO, 25));
		personas.add(new Persona("Luz", "Santos", Genero.FEMENINO, 30));
		personas.add(new Persona("Juan", "Perez", Genero.MASCULINO, 55));
		personas.add(new Persona("Victor", "Martinez", Genero.MASCULINO, 32));
		personas.add(new Persona("Rafael", "Santos", Genero.MASCULINO, 47));
		personas.add(new Persona("Manuel", "Cabral", Genero.MASCULINO, 0));
		personas.add(new Persona("Marta", "Rodriguez", Genero.FEMENINO, 18));
		personas.add(new Persona("Andres", "Jimenez", Genero.MASCULINO, 52));
		personas.add(new Persona("Hector", "Perez", Genero.MASCULINO, 51));

//		printPersonas(personas);
//		printPersonasMayoresQue(personas, 50);
//		printPersonasEntreDosEdades(personas, 25, 50);
//		printPersonasMayoresQueConInterfaca(personas, new PersonaMayorCincuenta());
		printPersonasMayoresQueConInterface(personas, 
				(Persona persona) -> persona.getEdad() > 18);


		printPersonasMayoresQueConPredicate(personas, 
				(Persona persona) -> persona.getEdad() > 18);
		
	}

	public static void main(String[] args) {

		CriterioBusqueda busqueda = new CriterioBusqueda();
		busqueda.ejecutar();

	}
	
	interface Validador {
		boolean validar(Persona persona);
		
		default void print() {
			System.out.println("Es un default method");
		}
	}
	
	class PersonaMayorCincuenta implements Validador{

		@Override
		public boolean validar(Persona persona) {
			
			return persona.getEdad() > 50;
		}
		
	}
	
	class PersonaMayorDiesocho implements Validador{

		@Override
		public boolean validar(Persona persona) {
			
			return persona.getEdad() > 18;
		}
		
	}
}
