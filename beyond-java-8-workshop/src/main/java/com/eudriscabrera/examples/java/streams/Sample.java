package com.eudriscabrera.examples.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		
		List<String> nbaTeam = Arrays.asList("Celtics","Warriors","Knicks","Thunder");
		
//		List<String> nbaTeamM = new ArrayList<>();
//		
//		for (String team : nbaTeam) {
//			nbaTeamM.add(team.toUpperCase());
//		}
//		
//		List<String> nbaTeamM = 
				
		nbaTeam
		.stream().map(String::toUpperCase)
		.collect(Collectors.toList())
		.forEach(System.out::println);
//		
//		for (String string : nbaTeamM) {
//				System.out.println(string);
//		}

		List<String> nbaTeamM = new ArrayList<>();
		int count = 0;
		
		nbaTeam
		.stream().count();
		
		// 
		
	}

}
