package org.generation.italy;

public class Computer {
	String marca, modello, cpu;
	int ram;	//GB
	int prezzo;
	boolean stato=false;	//stato computer
	Monitor monitor;		//Monitor: classe; 		monitor:oggetto 

	
	void accendi() {
		stato=true;					//computer
		System.out.println("Ho acceso il computer");
		monitor.stato=true;			//monitor  		(dotted notation)
		System.out.println("Ho acceso il monitor di "+monitor.pollici+" pollici");
	}
	
	void spegni() {		
		monitor.stato=false;
		System.out.println("Ho spento il monitor di "+monitor.pollici+" pollici");
		stato=false;
		System.out.println("Ho spento il computer");
	}
}
