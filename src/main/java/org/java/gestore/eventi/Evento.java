package org.java.gestore.eventi;

import java.text.ParseException;

public class Evento {
	private String titolo;
	private static String dataInserita;
	private static int postiTot;
	private int postiPrenotati;
	
	
// creo il costruttore
	 Evento(String titolo, String dataInserita, int postiTot) throws ParseException{
		this.titolo = titolo;
		this.dataInserita = dataInserita;
		this.postiTot = postiTot;
		this.postiPrenotati = 0;
		utilMethods.verificaData(); // in questa maniera quando creo il costruttore il metodo verifica automaticamente la data 
		utilMethods.verificaPostiTot(); // metodo che verifica se i postiTot siano positivi
	}

	
	// get e set
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public static String getDataInserita() {
		return dataInserita;
	}

	public void setDataInserita(String dataInserita) {
		this.dataInserita = dataInserita;
	}

	public static int getPostiTot() {
		return postiTot;
	}

	public void setPostiTot(int postiTot) {
		this.postiTot = postiTot;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	
		}
	
