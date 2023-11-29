package org.generation.italy;

import java.util.ArrayList;

public class Negozio {
	String nome,indirizzo;
	
	ArrayList<Computer> elencoComputer= new ArrayList<>(){{
		add(new Computer("Acer","A515","I5",12,500,new Monitor(15, "Grigio")));		//primo computer
		add(new Computer("Asus","PXX","I4",8,300,new Monitor(15, "Nero")));		//secondo computer
		add(new Computer("Lenovo","IdeaPad","I7",16,800,new Monitor(17, "Grigio")));		//terzo computer	
	}};	
}
