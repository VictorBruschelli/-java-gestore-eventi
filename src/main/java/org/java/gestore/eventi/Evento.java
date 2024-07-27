package org.java.gestore.eventi;

import java.text.ParseException;

public class Evento {
	private String titolo;
	private static String dataInserita;
	private int postiTot;
	private int postiPrenotati;
	
	
// creo il costruttore
	 Evento(String titolo, String dataInserita, int postiTot) throws ParseException{
		this.titolo = titolo;
		this.dataInserita = dataInserita;
		this.postiTot = postiTot;
		this.postiPrenotati = 0;
		utilMetod.verificaData(); // in questa maniera quando creo il costruttore il metodo verifica automaticamente la data 
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

	public int getPostiTot() {
		return postiTot;
	}

	public void setPostiTot(int postiTot) {
		this.postiTot = postiTot;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	
//	//metodo per comparare la data dentro il costruttore con la data reale.
//	public static void verificaData() throws ParseException {
//		//dichiaro la data in tempo reale e la formatto in testo
//		  LocalDate realDate = LocalDate.now();
//		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
//		  String text = realDate.format(formatter);
//
//		//comparatore per le date 
//    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//    Date date1 = sdf.parse(dataInserita);
//    Date date2 = sdf.parse(text);
//
//    int result = date1.compareTo(date2);
//
//	    if (result < 0) {
//	        System.out.println("la data inserita è gia passata, perfavore inserisci una data valida.");
//	    } 
//	}

	
		}
	
