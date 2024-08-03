package org.java.gestore.eventi;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ParseException  {
		

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
	    		System.out.println("\n la data inserita per l'evento è gia passata, perfavore inserisci una data valida. ");
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
				System.out.println("\n attenzione! è necessario che il numero totale di posti disponibili sia maggiore di 0. ");
	    	} else {
	    		postiValidi = true;
	    	}
		}
		
//istanzio l'evento	
		Evento evento = new Evento(titolo, dataInserita, postiTot);
		
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
				System.out.println("\n non ho capito");
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
					System.out.println("\n attenzione! è necessario che il numero sia maggiore di 0. ");
		    	} else {
		    		postiValidi = true;
		    	    prenotazioneAvvenuta = evento.prenota(aggiungi);
					
					if (prenotazioneAvvenuta){
						System.out.println("la tua prenotazione è andata a buon fine: " + aggiungi + " posti prenotati / " + (evento.getPostiTot() - evento.getPostiPrenotati()) + " posti disponibili \n");	
						
					}else {
						System.out.println("\n mi dispiace, c'è stato un errore con la prenotazione.");
					}
		    	}
			}
		}
		
		System.out.println( evento.getPostiPrenotati() + " posti prenotati / " + (evento.getPostiTot() - evento.getPostiPrenotati()) + " posti disponibili" );
		
//chiedo all'utente se vuole fare cancelazioni e quante vuole farne.
		String eseguiDisdici = "xx";
		while (true) {
			System.out.println("vuoi disdire una prenotazione? (si/no)");
			eseguiDisdici = scanner.nextLine();
			
			
			if (eseguiDisdici.equals("no")) {
				break;
			}else if (eseguiDisdici.equals("si")){	
				break;
			}else {
				System.out.println("\n non ho capito");
			}
		}
			
		if (eseguiDisdici.equals("no")) {
			System.out.println("ok, arrivederci!");	
		}else {	
			int elimina = 0;
			Boolean disdiciAvvenuta = false;
			postiValidi = false;
			while(!postiValidi || !disdiciAvvenuta) {
				System.out.println("Inserisci il numero totale di posti che vuoi disdire: ");
				elimina = scanner.nextInt();
				scanner.nextLine();

				if (elimina <= 0) {
					System.out.println("\n attenzione! è necessario che il numero sia maggiore di 0. ");
		    	} else {
		    		postiValidi = true;
		    	    disdiciAvvenuta = evento.disdici(elimina);
					
					if (disdiciAvvenuta){
						System.out.println("la tua disdetta è andata a buon fine: " + "-" + elimina + " posti disdetti / " + (evento.getPostiTot() - evento.getPostiPrenotati()) + " posti disponibili");	
						
					}else {
						System.out.println("\n mi dispiace, c'è stato un errore con la disdetta.");
					}
		    	  }
			}
				
		}
		System.out.println(evento.getPostiPrenotati() + " posti prenotati / " + (evento.getPostiTot() - evento.getPostiPrenotati()) + " posti disponibili");
		

		evento.toString();
		System.out.println(evento);
		
		System.out.println("____________________________________________________________________________________________________________");
		
// -------------------------------------  dichiarando variabili e metodi per Concerto	------------------------------------------------
		
		
		//prendo il valore di titolo dall'utente
				System.out.println("Inserisci il titolo del concerto che desideri fare: ");
			    titolo = scanner.nextLine();
				
		//prendo il valore della data dall'utente
			    dataValida = false;
				dataInserita = "dd-MM-yyyy";
				while(!dataValida) {
					System.out.println("Inserisci la data del concerto utilizzando il modello dd-MM-yyyy: ");
					dataInserita = scanner.nextLine();
			    	if (!Evento.verificaData(dataInserita)) {
			    		System.out.println("\n la data inserita per il concerto è gia passata, perfavore inserisci una data valida. ");
			    	} else {
			    		dataValida = true;
			    	}
				}
				
//estraendo l'ora del concerto e eseguendo la formatazzione
		String oraInserita = "HH:mm";
		System.out.println("Inserisci l'ora del concerto usando il modello 'HH:mm': ");
        oraInserita = scanner.nextLine();
    	LocalTime ora = Concerto.formattaTime(oraInserita);

				
				
//prendo il valore dei posti totali dall'utente		

		postiValidi = false;
		postiTot = 0;
		while(!postiValidi) {
			System.out.println("Inserisci il numero totale di posti disponibili per il concerto: ");
			postiTot = scanner.nextInt();
			scanner.nextLine();

			if (postiTot <= 0) {
				System.out.println("\n attenzione! è necessario che il numero totale di posti disponibili sia maggiore di 0. ");
	    	} else {
	    		postiValidi = true;
	    	}
		}	

//valorizzo prezzoInserito
		double prezzoInserito;
		System.out.println("inserisci il prezzo per il concerto: ");
        prezzoInserito = scanner.nextDouble();
        String prezzo = Concerto.formattaPrezzo(prezzoInserito);
        scanner.nextLine();
		

		
		Concerto concerto = new Concerto(titolo, dataInserita, postiTot, oraInserita, prezzo);

		
		//chiedo all'utente se vuole fare prenotazioni e quante vuole farne.
				 eseguiPrenotazione = "xx";
				while (true) {
					System.out.println("vuoi fare una prenotazione? (si/no)");
					eseguiPrenotazione = scanner.nextLine();
					
					
					if (eseguiPrenotazione.equals("no")) {
						break;
					}else if (eseguiPrenotazione.equals("si")){	
						break;
					}else {
						System.out.println("\n non ho capito");
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
							System.out.println("\n attenzione! è necessario che il numero sia maggiore di 0. ");
				    	} else {
				    		postiValidi = true;
				    	    prenotazioneAvvenuta = concerto.prenota(aggiungi);
							
							if (prenotazioneAvvenuta){
								System.out.println("la tua prenotazione è andata a buon fine: " + aggiungi + " posti prenotati / " + (concerto.getPostiTot() - concerto.getPostiPrenotati()) + " posti disponibili \n");	
								
							}else {
								System.out.println("\n mi dispiace, c'è stato un errore con la prenotazione.");
							}
				    	}
					}
				}
				
				System.out.println( concerto.getPostiPrenotati() + " posti prenotati / " + (concerto.getPostiTot() - concerto.getPostiPrenotati()) + " posti disponibili \n" );
				
		//chiedo all'utente se vuole fare cancelazioni e quante vuole farne.
				 eseguiDisdici = "xx";
				while (true) {
					System.out.println("vuoi disdire una prenotazione? (si/no)");
					eseguiDisdici = scanner.nextLine();
					
					
					if (eseguiDisdici.equals("no")) {
						break;
					}else if (eseguiDisdici.equals("si")){	
						break;
					}else {
						System.out.println("\n non ho capito");
					}
				}
					
				if (eseguiDisdici.equals("no")) {
					System.out.println("ok, arrivederci!");	
				}else {	
					int elimina = 0;
					Boolean disdiciAvvenuta = false;
					postiValidi = false;
					while(!postiValidi || !disdiciAvvenuta) {
						System.out.println("Inserisci il numero totale di posti che vuoi disdire: ");
						elimina = scanner.nextInt();
						scanner.nextLine();

						if (elimina <= 0) {
							System.out.println("\n attenzione! è necessario che il numero sia maggiore di 0. ");
				    	} else {
				    		postiValidi = true;
				    	    disdiciAvvenuta = concerto.disdici(elimina);
							
							if (disdiciAvvenuta){
								System.out.println("la tua disdetta è andata a buon fine: " + "-" + elimina + " posti disdetti / " + (concerto.getPostiTot() - concerto.getPostiPrenotati()) + " posti disponibili \n");	
								
							}else {
								System.out.println("\n mi dispiace, c'è stato un errore con la disdetta.");
							}
				    	  }
					}
						
				}
				System.out.println(concerto.getPostiPrenotati() + " posti prenotati / " + (concerto.getPostiTot() - concerto.getPostiPrenotati()) + " posti disponibili \n");
				

			 concerto.toString();
				System.out.println(concerto);
		
//        LocalTime localTime = LocalTime.parse("10:25:30");
//
//		// return the output value
//		System.out.println("LocalTime : " + localTime);
//		
//		// create a formater
//		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
//		
//		LocalTime localTime1 = LocalTime.parse("12:30:50");
//		// parse a string to get a LocalTime object in return
//		
//		LocalTime.parse("12:30:50", formatter);
//		// print the output
//		System.out.println("LocalTime : " + localTime1);

		




		
	}

}
