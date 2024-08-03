package org.java.gestore.eventi;

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Concerto extends Evento {
	private String ora;
	private String prezzo;

	public Concerto(String titolo, String dataInserita, int postiTot, String ora, String prezzo) throws ParseException {
		super(titolo, dataInserita, postiTot);
		
		this.ora = ora;
		this.prezzo = prezzo;
	
	}

	public String getOra() {
		return ora;
	}


	public void setOra(String ora) {
		this.ora = ora;
	}


	public String getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	
//metodo per formattare l'ora
	public static LocalTime formattaTime(String oraInserita) {
	 LocalTime localTime = LocalTime.parse("22:40");
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		LocalTime oraFormattata = LocalTime.parse(oraInserita, formatter);
		return oraFormattata;
	}

//metodo per formattare il prezzo
     public static String formattaPrezzo(double prezzoInserito){
     return String.format("%,.2f", prezzoInserito);
     }
      
     
	@Override
	public String toString() {
		return (dataInserita + " " + ora + " - " + titolo + " " + prezzo + "€");  //toString non serve per stampare a video ma per salvare valori in una variabile
	}

	
}
