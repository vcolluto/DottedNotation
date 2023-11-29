package org.generation.italy;

import java.util.ArrayList;

public class Negozio {
	String nome,indirizzo;
	
	ArrayList<Computer> elencoComputer= new ArrayList<>(){{
		add(new Computer());		//primo computer
		add(new Computer());		//secondo computer
		add(new Computer());		//terzo computer	
	}};	
}
