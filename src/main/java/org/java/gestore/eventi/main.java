package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il titolo dell'evento che desideri fare: ");
		String titolo = scanner.nextLine();
		
		Boolean dataValida = false;
		String dataInserita = "dd-MM-yyyy";
		while(!dataValida) {
			System.out.println("Inserisci la data dell'evento utilizzando il modello dd-MM-yyyy: ");
			dataInserita = scanner.nextLine();
			
			//dichiaro la data in tempo reale e la formatto in testo
			LocalDate realDate = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
			String text = realDate.format(formatter);

			//comparatore per le date 
		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		    Date dateUtente = sdf.parse(dataInserita);
		    Date dateAttuale = sdf.parse(text);
		
		    int result = dateUtente.compareTo(dateAttuale);

	    	if (result < 0) {
	    		System.out.println("la data inserita per l'evento è gia passata, perfavore inserisci una data valida. ");
	    	} else {
	    		dataValida = true;
	    	}
		}
		
		Boolean postiValidi = false;
		int postiTot = 0;
		while(!postiValidi) {
			System.out.println("Inserisci il numero totale di posti disponibili per l'evento: ");
			postiTot = scanner.nextInt();

			if (postiTot <= 0) {
				System.out.println("attenzione! è necessario che il numero totale di posti disponibili sia maggiore di 0. ");
	    	} else {
	    		postiValidi = true;
	    	}
		}
		
		Evento concerto = new Evento(titolo, dataInserita, postiTot);
		
		
		//concerto.toString();
		
	

		
	}

}
