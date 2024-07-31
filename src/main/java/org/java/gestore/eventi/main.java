package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ParseException {
		

		Scanner scanner = new Scanner(System.in);
		
//prendo il valore di titolo dall'utente
		System.out.println("Inserisci il titolo dell'evento che desideri fare: ");
		String titolo = scanner.nextLine();
		
//prendo il valore della data dall'utente
		Boolean dataValida = false;
		String dataInserita = "dd-MM-yyyy";
		while(!dataValida) {
			System.out.println("Inserisci la data dell'evento utilizzando il modello dd-MM-yyyy: ");
			dataInserita = scanner.nextLine();
	    	if (!Evento.verificaData(dataInserita)) {
	    		System.out.println("la data inserita per l'evento è gia passata, perfavore inserisci una data valida. ");
	    	} else {
	    		dataValida = true;
	    	}
		}
		
//prendo il valore dei posti totali dall'utente		

		Boolean postiValidi = false;
		int postiTot = 0;
		while(!postiValidi) {
			System.out.println("Inserisci il numero totale di posti disponibili per l'evento: ");
			postiTot = scanner.nextInt();
			scanner.nextLine();

			if (postiTot <= 0) {
				System.out.println("attenzione! è necessario che il numero totale di posti disponibili sia maggiore di 0. ");
	    	} else {
	    		postiValidi = true;
	    	}
		}
		
//istanzio l'evento	
		Evento concerto = new Evento(titolo, dataInserita, postiTot);
		
//chiedo all'utente se vuole fare prenotazioni e quante vuole farne.
		String eseguiPrenotazione = "xx";
		while (true) {
			System.out.println("vuoi fare una prenotazione? (si/no)");
			eseguiPrenotazione = scanner.nextLine();
			
			
			if (eseguiPrenotazione.equals("no")) {
				break;
			}else if (eseguiPrenotazione.equals("si")){	
				break;
			}else {
				System.out.println("non ho capito");
			}
		}
			
		if (eseguiPrenotazione.equals("no")) {
			System.out.println("ok, arrivederci!");	
		}else {	
			int aggiungi = 0;
			Boolean prenotazioneAvvenuta = false;
			postiValidi = false;
			while(!postiValidi || !prenotazioneAvvenuta) {
				System.out.println("Inserisci il numero totale di posti che vuoi prenotare: ");
				aggiungi = scanner.nextInt();
				scanner.nextLine();

				if (aggiungi <= 0) {
					System.out.println("attenzione! è necessario che il numero sia maggiore di 0. ");
		    	} else {
		    		postiValidi = true;
		    	    prenotazioneAvvenuta = concerto.prenota(aggiungi);
					
					if (prenotazioneAvvenuta){
						System.out.println("la tua prenotazione è andata a buon fine: " + aggiungi + " posti prenotati / " + (concerto.getPostiTot() - concerto.getPostiPrenotati()) + " posti disponibili");	
						
					}else {
						System.out.println("mi dispiace, c'è stato un errore con la prenotazione.");
					}
		    	}
			}
			
			
			
		}
	

		
	}

}
