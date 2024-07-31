package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Evento {
	private String titolo;
	private String dataInserita;
	private int postiTot;
	private int postiPrenotati;
	
	
 //costruttore che viene compilato alla creazione.
	 Evento(String titolo, String dataInserita, int postiTot) throws ParseException{
		this.titolo = titolo;
		this.dataInserita = dataInserita;
		this.postiTot = postiTot;
		this.postiPrenotati = 0;
		//utilMethods.verificaData(); // in questa maniera quando creo il costruttore il metodo verifica automaticamente la data 
		//utilMethods.verificaPostiTot(); // metodo che verifica se i postiTot siano positivi
		//utilMethods.info();
		}
	
//costruttore che viene compilato atraverso dati forniti tramite terminale.
//	 Evento() throws ParseException{
//		this.titolo = valoreTitolo();
//		this.dataInserita = valoreData();
//		this.postiTot = valorePosti();
//		this.postiPrenotati = 0;
		//toString();
		//utilMethods.verificaData(); // in questa maniera quando creo il costruttore il metodo verifica automaticamente la data 
		//utilMethods.verificaPostiTot(); // metodo che verifica se i postiTot siano positivi
		//utilMethods.info(); // metodo test per vedere tutte le info del costruttore
		//}
	 
	 
	
		
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
		
		
		
////metodo per prendere dal terminale i valori delle propieta per inserirle nel costruttore.		
//		public static String valoreTitolo() {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("inserisci il titolo dell'evento che desideri fare: ");
//			titolo = scanner.nextLine();
//			return titolo;
//		}
//		
//		public static String valoreData() throws ParseException {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("inserisci la data dell'evento utilizzando il modello dd-MM-yyyy: ");
//			dataInserita = scanner.nextLine();
//			utilMethods.verificaData(); // in questa maniera quando creo il costruttore il metodo verifica automaticamente la data 
//			return dataInserita;
//		}
//		
//		public static int valorePosti() {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("inserisci il numero totale di posti disponibili per l'evento: ");
//			postiTot = scanner.nextInt();
//			utilMethods.verificaPostiTot(); // metodo che verifica se i postiTot siano positivi
//			return postiTot;
//			
//		}
		
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
			
				
			
		
		//aggiunge  ai posti prenotati il vlore che mi fornisce lutente atraverso uno scanner (il valore denro lo scanner viene preso dal main in una 
		//		variabile int postiRichiesti)
		}

	
}
	
