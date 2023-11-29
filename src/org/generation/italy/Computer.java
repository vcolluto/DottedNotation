package org.generation.italy;

public class Computer {
	private String marca, modello, cpu;		//l'unica classe che può modificare gli attributi è Computer (perché sono privati)
	private int ram;	//GB
	private int prezzo;
	private boolean stato=false;	//stato computer
	private Monitor monitor;		//Monitor: classe; 		monitor:oggetto 


	//costruttore
	public Computer(String marca, String modello, String cpu, int ram, int prezzo, Monitor monitor) {
		//attributo=parametro
		this.marca = marca;
		this.modello = modello;
		this.cpu = cpu;
		this.ram = ram;
		this.prezzo = prezzo;
		this.monitor = monitor;
	}

	void accendi() {
		stato=true;					//computer
		System.out.println("Ho acceso il computer");
		monitor.setStato(true);			//monitor  		(dotted notation)
		System.out.println("Ho acceso il monitor di "+monitor.getPollici()+" pollici");
	}
	
	void spegni() {		
		monitor.setStato(false);
		System.out.println("Ho spento il monitor di "+monitor.getPollici()+" pollici");
		stato=false;
		System.out.println("Ho spento il computer");
	}

	//public int: metodo pubblico che restituisce un intero
	public int getPrezzo() {		//getter: recupera il valore dell'attributo (intero)
		return prezzo;		//return: restituisce il valore
		//attributo
	}

	//public void: metodo pubblico che non restituisce un valore
	public void setPrezzo(int prezzo) {		//setter: imposta il valore (in maniera controllata)
		if (prezzo>0)
			this.prezzo = prezzo;
			// attributo	parametro		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (!marca.isEmpty())
			this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if (ram>0)
			this.ram = ram;
	}

	public boolean isStato() {
		return stato;
	}

	public void setStato(boolean stato) {
		this.stato = stato;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	
	
	
}
