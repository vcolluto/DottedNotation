package org.generation.italy;

public class Main {

	public static void main(String[] args) {
		Monitor m=new Monitor(15,"Verde");
		
		Computer c=new Computer("Asus", "Predator", "I7", 16, 700, new Monitor(17,"Nero"));		//nuovo oggetto Computer
		
		//c.prezzo=-500;		//non se po fa
		
		c.setPrezzo(500);	//chiamo il setter
		
		System.out.println("Adesso il prezzo è: "+c.getPrezzo());		//chiamo il getter
	    
		
		Negozio negozio=new Negozio();
		
		negozio.nome="PC futura 2000";
		negozio.indirizzo="via Verdi 27 Roma";
		
		//voglio impostare la marca del primo computer del negozio
		negozio.elencoComputer.get(0).setMarca("Acer");			//dotted notation
		negozio.elencoComputer.get(0).getMonitor().setColore("Rosso");
		
		
	}

}
