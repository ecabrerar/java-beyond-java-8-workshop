package com.eudriscabrera.examples.java.streams;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HandlingStream {

	public static void main(String[] args) {
		
		//1. Usando el API Stream generar los números del 1 al 10 y retornar la suma de ellos.
		IntSummaryStatistics total = IntStream.range(1,10).summaryStatistics();
		
		System.out.println(total.getSum());

		//2. Procesar la siguiente lista de palabras para que solamente contenga cadena de caracteres impares y en letra minúscula.

		Stream.of("JSON","MongoDB","Java","Neo4J","Wildfly","Red Hat","microcks","Apache","Eclipse","Liberica","Corretto")
		.map(String::toLowerCase)
		.filter(s -> s.length() %2 !=0)
//		.findFirst()
//		.orElseThrow(RuntimeException::new);
//		.orElseThrow(() -> new RuntimeException("No encontrado"));
//		.ifPresent(s ->System.out.println(s));
		.forEach(s ->System.out.println(s));
		
		Optional.empty();
		Optional.ofNullable(null);
		Optional.of(null);

		//Dado la siguiente lista, escribir un programa que tome de la lista todas las palabras que tengan longitud par y se agreguen a un set.
	   Set<String> setPares = Stream.of("Edificio","Casa ","Escuela","Apartamento","Carro","Tienda","Farmacia","Supermercado","Plaza","Cine","Hotel")
		.map(String::toLowerCase)
		.filter(s -> s.length() %2 ==0)
		.collect(Collectors.toSet());
		
		//Dado la siguiente lista,escribir programa que retorne un HashMap que contenga la palabra y la cantidad de veces que
	   //aparece en la lista.
	    Map<String, Long> cuentaPalabra = 
	    		Stream.of("Edificio","Casa","Escuela","Apartamento","Edificio","Tienda","Farmacia","Apartamento","Plaza","Farmacia","Hotel")
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	    Stream.of("Hotel","Plaza","Escuela","Uno","Cinco","Siete","Oro","SQL","Lider","Ecuador")
	    .filter(s -> s.length() %2 ==0)
	    .findAny();
	    
	}

}
