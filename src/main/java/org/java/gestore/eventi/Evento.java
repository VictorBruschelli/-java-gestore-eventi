package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Evento {
	protected String titolo;
	protected String dataInserita;
	protected int postiTot;
	protected int postiPrenotati;
	
	
 //costruttore che viene compilato dal main atraverso la console.
	public  Evento(String titolo, String dataInserita, int postiTot) throws ParseException{
		this.titolo = titolo;
		this.dataInserita = dataInserita;
		this.postiTot = postiTot;
		this.postiPrenotati = 0;
		}
	
		
// get e set
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
	
		public int getPostiPrenotati() {
			return postiPrenotati;
		}
		
		
		@Override
		public String toString() {
			return (dataInserita + " - " + titolo);  //toString non serve per stampare a video ma per salvare valori in una variabile
		}
		
//metodo per comparare le date
		public static Boolean verificaData(String dataInserita) throws ParseException {
			//dichiaro la data in tempo reale e la formatto in testo
			LocalDate realDate = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
			String text = realDate.format(formatter);

			//comparatore per le date 
		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		    Date dateUtente = sdf.parse(dataInserita);
		    Date dateAttuale = sdf.parse(text);
		
		    int result = dateUtente.compareTo(dateAttuale);

	    	if (result < 0) { // se la data inserita dall'utente è gia passata comparandola a quella attuale allora
	    		return false;
		    }	else {
		    	return true;
		    }
		}
			 			
			
		public Boolean prenota(int aggiungi) throws ParseException {
			if (postiTot >= this.postiPrenotati + aggiungi && verificaData(this.dataInserita) ) {
				this.postiPrenotati = aggiungi + this.postiPrenotati;
				return true;
			}else {
				return false;
			}
		}
			
		public Boolean disdici(int elimina) throws ParseException {
			if (this.postiPrenotati >= elimina && verificaData(this.dataInserita) ) {
				this.postiPrenotati = this.postiPrenotati - elimina;
				return true;
			}else {
				return false;
			}

		}
	
}
	
