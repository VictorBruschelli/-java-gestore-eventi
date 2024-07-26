package org.java.gestore.eventi;

import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Evento disney = new Evento("Mikey", 2024-10-20, 80000);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("inserisci la data dell'evento: yyyy-mm-dd");
		String dataUtente = scanner.nextLine();
		System.out.println("la data inserita è: " + dataUtente);
		
	}

}
