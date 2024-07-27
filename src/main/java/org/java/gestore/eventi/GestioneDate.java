package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class GestioneDate {

	public static void main(String[] args)  throws ParseException{
		//dichiaro la data in tempo reale
		  LocalDate realDate = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Formattatore per la stampa e l'analisi di oggetti data-ora 
		  String text = realDate.format(formatter);

		//comparatore per le date 
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      Date date1 = sdf.parse("10-12-2023");
      Date date2 = sdf.parse(text);

      int result = date1.compareTo(date2);

      if (result < 0) {
          System.out.println("la data inserita è gia passata, perfavore inserisci una data valida.");
      }  else  {
          System.out.println("Date1 è dopo Date2");
      }
		
	}
}