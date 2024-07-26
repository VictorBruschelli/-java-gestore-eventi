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
		
		//LocalDate realDate = LocalDate.now();
		//System.out.println(realDate + " questa è la data attuale ");
		  LocalDate realDate = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  String text = realDate.format(formatter);
		//  LocalDate parsedDate = LocalDate.parse(text, formatter);
		  
		 // System.out.println(realDate);
		 
		
		
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
        
        //devo fare in modo che una data sia data dal user con scanner e laltra data sia quella corrente 
        //in modo da comparare le due date e vedere se "l'evento è passato o no"


	}

}
