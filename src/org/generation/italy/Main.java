package org.generation.italy;

public class Main {

	public static void main(String[] args) {
		Computer c=new Computer();		//nuovo oggetto Computer
		
		c.marca="Asus";				//Dotted notation
		c.modello="Predator";
		c.cpu="I7 13543";		
		c.monitor=new Monitor();		//creo un nuovo oggetto Monitor e lo assegno al c.monitor; 
		
		c.monitor.colore="Rosso";		//c => monitor => colore
		
		
		Negozio negozio=new Negozio();
		
		negozio.nome="PC futura 2000";
		negozio.indirizzo="via Verdi 27 Roma";
		
		//voglio impostare la marca del primo computer del negozio
		negozio.elencoComputer.get(0).marca="Acer";			//dotted notation
		negozio.elencoComputer.get(0).monitor.colore="Rosso";
		
		
	}

}
