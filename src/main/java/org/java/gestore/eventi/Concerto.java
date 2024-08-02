package org.java.gestore.eventi;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;


public class Concerto extends Evento {
	private String ora;
	private double prezzo;

	public Concerto(String titolo, String dataInserita, int postiTot, String oraInserita, double prezzoInserito) throws ParseException {
		super(titolo, dataInserita, postiTot);
		
		this.ora = oraInserita;
		this.prezzo = prezzoInserito;
	
	}

	public String getOra() {
		return ora;
	}


	public void setOra(String ora) {
		this.ora = ora;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
//metodo per formattare l'ora
	public static void formattaTime(String oraInserita) {
	 LocalTime localTime = LocalTime.parse("22:40");
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		 LocalTime oraUtente = LocalTime.parse(oraInserita, formatter);
	}

//metodo per formattare il prezzo
     public static void formattaPrezzo(double prezzoInserito){
    	   String.format("%,.2f", prezzoInserito);
     }
     
	



	@Override
	public String toString() {
		return (dataInserita + " " + ora + " - " + titolo + " " + prezzo + "€");  //toString non serve per stampare a video ma per salvare valori in una variabile
	}

	
	
	

	
//    static public String formattaData(LocalTime codice) {
//    	String paddedCode = String.format("%08d", codice);
//    	return paddedCode;
//    }
	
}
