package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Evento {
	private String titolo;
	private static String dataInserita;
	private int postiTot;
	private int postiPrenotati;
	
	

	Evento(String titolo, String dataInserita, int postiTot){
		this.titolo = titolo;
		this.dataInserita = dataInserita;
		this.postiTot = postiTot;
		this.postiPrenotati = 0;
	}

	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDataInserita() {
		return dataInserita;
	}

	public void setDataInserita(String dataInserita) {
		this.dataInserita = dataInserita;
	}

	public int getPostiTot() {
		return postiTot;
	}

	public void setPostiTot(int postiTot) {
		this.postiTot = postiTot;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	
	public static void verificaData() throws ParseException {
		//dichiaro la data in tempo reale
		  LocalDate realDate = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
		  String text = realDate.format(formatter);

		//comparatore per le date 
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Date date1 = sdf.parse(dataInserita);
    Date date2 = sdf.parse(text);

    int result = date1.compareTo(date2);

	    if (result < 0) {
	        System.out.println("la data inserita è gia passata, perfavore inserisci una data valida.");
	    } 
		

	}

	
		}
	
