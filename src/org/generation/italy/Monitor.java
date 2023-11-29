package org.generation.italy;

public class Monitor {
	//attributi
	private int pollici;
	private String colore;
	private boolean stato=false;  		//stato del monitor
	
	
	
	public Monitor(int pollici, String colore) {
		
		this.pollici = pollici;
		this.colore = colore;
		stato=false;		//spento
	}

	//metodi
	void accendi() {
		stato=true;
	}
	
	void spegni() {
		stato=true;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isStato() {
		return stato;
	}

	public void setStato(boolean stato) {
		this.stato = stato;
	}

}
