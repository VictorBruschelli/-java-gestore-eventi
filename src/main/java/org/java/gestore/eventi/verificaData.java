package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class verificaData extends Evento{

	verificaData(String titolo, String dataInserita, int postiTot) throws ParseException {
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
		    Date date1 = sdf.parse(getDataInserita());
		    Date date2 = sdf.parse(text);

		    int result = date1.compareTo(date2);

			    if (result < 0) {
			        System.out.println("la data inserita è gia passata, perfavore inserisci una data valida.");
			    } 

	}
}
