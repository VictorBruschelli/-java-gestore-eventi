package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
//import java.util.Scanner;


	public class utilMethods extends Evento {
	
		utilMethods(String titolo, String dataInserita, int postiTot) throws ParseException {
			super(titolo, dataInserita, postiTot);
			
		}

//metodo per comparare la data dentro il costruttore con la data reale.
		public static void verificaData() throws ParseException {
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
        System.out.println("la data inserita per l'evento è gia passata, perfavore inserisci una data valida.");
		    }			 
		}
		
//metodo per conferire se il numero di posti totali dentro il costruttore è positivo
		public static void verificaPostiTot() {
		if (getPostiTot() <= 0) {
		System.out.println("atenzione! è necessario che il numero totale di posti disponibili sia maggiore di 0");
		   }
		}
	
	
//// metodo per verificare se la data inserita dall utente è valida.
//		public static void dataUtente() throws ParseException {
//		// chiedo all utete di inserire la data 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("inserisci la data per levento 'dd-MM-yyyy'");
//		String dataEvento = scanner.nextLine();
//		//
//		//dichiaro la data in tempo reale
//		  LocalDate realDate = LocalDate.now();
//		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
//		  String dateReal = realDate.format(formatter);

//		//comparatore per le date 
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        Date date1 = sdf.parse(dataEvento);
//        Date date2 = sdf.parse(dateReal);
//
//        System.out.println("date1 : " + sdf.format(date1) + " data inserita dall utente");
//        System.out.println("date2 : " + sdf.format(date2) + " data attuale");
//
//        int result = date1.compareTo(date2);
//        System.out.println("result: " + result);
//
//        if (result == 0) {
//            System.out.println("la tua data è uguale alla data corrente");
//        } else if (result > 0) {
//            System.out.println("la tua data è dopo la data corrente");
//        } else if (result < 0) {
//            System.out.println("attenzione! la data da te inserita è gia passata, perfavore inserire una data valida");
//        } else {
//            System.out.println("perfavore inserire una data valida");
//        }
//	}
		

		
		
////metodo per vedere le informazioni del costruttore.
//		public static void info() {
//			System.out.println("\n Dati Evento");
//			System.out.println("\n-------------------------------\n");
//			System.out.println("nome evento: " + getTitolo());
//			System.out.println("data evento: " + getDataInserita());
//			System.out.println("posti disponibili: " + getPostiTot());
//		}
		
		
//		public String setDataInserita(String dataInserita) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("inserisci la data dell'evento utilizando il modello 'dd-MM-yyyy':");
//			dataInserita = scanner.nextLine();
//			return this.dataInserita = dataInserita;
//		}
		
		
}