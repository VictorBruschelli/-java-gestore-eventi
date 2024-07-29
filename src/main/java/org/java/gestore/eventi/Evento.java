package org.java.gestore.eventi;

import java.text.ParseException;
import java.util.Scanner;

public class Evento {
	private static String titolo;
	private static String dataInserita;
	private static int postiTot;
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
		public static String getTitolo() {
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
	
		public static int getPostiTot() {
			return postiTot;
		}
	
		public int getPostiPrenotati() {
			return postiPrenotati;
		}
		
//metodo per prendere dal terminale i valori delle propieta per inserirle nel costruttore.		
		public static String valoreTitolo() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("inserisci il titolo dell'evento che desideri fare: ");
			titolo = scanner.nextLine();
			return titolo;
		}
		
		public static String valoreData() throws ParseException {
			Scanner scanner = new Scanner(System.in);
			System.out.println("inserisci la data dell'evento utilizzando il modello dd-MM-yyyy: ");
			dataInserita = scanner.nextLine();
			utilMethods.verificaData(); // in questa maniera quando creo il costruttore il metodo verifica automaticamente la data 
			return dataInserita;
		}
		
		public static int valorePosti() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("inserisci il numero totale di posti disponibili per l'evento: ");
			postiTot = scanner.nextInt();
			utilMethods.verificaPostiTot(); // metodo che verifica se i postiTot siano positivi
			return postiTot;
			
		}
		
		@Override
		public String toString() {
			return (dataInserita + " - " + titolo);
		}




		
// creare un array per posti prenotati che parte da 0 in modo da creare un metodo che aggiunge un posto e un metodo che disdice un posto

	
}
	
