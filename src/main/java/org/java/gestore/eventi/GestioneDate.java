package org.java.gestore.eventi;
import java.time.LocalDate;
import java.util.Scanner;

public class GestioneDate {
	
		public static  LocalDate realDate = LocalDate.now(); // Create a date object
		
		public static int controlloData(); 

	

	
	public static void main(String[] args) {
	    System.out.println(realDate + " questa è la data attuale"); // Display the current date
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci la data dell'evento: yyyy-mm-dd");
		String dataUtente = scanner.nextLine();
		System.out.println("la data inserita è: " + dataUtente);
		
		

	}
}
