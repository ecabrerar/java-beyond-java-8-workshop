/**
 * 
 */
package lcom.eudriscabrera.examples.java.changes.java9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ecabrerar
 *
 */
public class StreamNewMethods {

	
	public static void main(String[] args) {  
		
		List<Team> teamsList = new ArrayList<Team>();
		
		teamsList.stream()
        .dropWhile(t -> t.isHasWonWoldSeries())
        .collect(Collectors.toList());
		
		
		teamsList.stream()
        .takeWhile(t -> t.isHasWonWoldSeries())
        .collect(Collectors.toList());
		
	
		List<String> teams = List.of("Astros",
				"Mets", 
                "Cardinals", 
                "Red Sox",
                 "Orioles",
                 "Rays");

		
		System.out.print(" DropWhile >> \n");
		
		teams.stream()
		.sorted(Comparator.comparing(String::length))
        .dropWhile(t -> t.length() < 8)
        .forEach(s -> { System.out.println(s);});
	
	
		
		System.out.print(" takeWhile >> \n");
		
		teams.stream()
        .takeWhile(t -> t.length() < 8)
        .peek(System.out::println)
        .collect(Collectors.toList());
		
		
		
	}
}
