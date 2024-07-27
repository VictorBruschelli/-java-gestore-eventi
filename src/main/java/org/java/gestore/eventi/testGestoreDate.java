package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class testGestoreDate {

	public static void main(String[] args) throws ParseException{
		
		// chiedo all utete di inserire la data 
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci la data per levento 'dd-MM-yyyy'");
		String dataEvento = scanner.nextLine();
		//
		//dichiaro la data in tempo reale
		  LocalDate realDate = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
		  String text = realDate.format(formatter);

		//comparatore per le date 
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = sdf.parse(dataEvento);
        Date date2 = sdf.parse(text);

        System.out.println("date1 : " + sdf.format(date1) + " data inserita dall utente");
        System.out.println("date2 : " + sdf.format(date2) + " data attuale");

        int result = date1.compareTo(date2);
        System.out.println("result: " + result);

        if (result == 0) {
            System.out.println("Date1 è uguale a  Date2");
        } else if (result > 0) {
            System.out.println("Date1 è dopo Date2");
        } else if (result < 0) {
            System.out.println("Date1 è prima Date2");
        } else {
            System.out.println("How to get here?");
        }
        
        //prossimo step 
        //fare in  modo che arrvi un avviso allutente se la sua data inserita è gia passata


	}

}
