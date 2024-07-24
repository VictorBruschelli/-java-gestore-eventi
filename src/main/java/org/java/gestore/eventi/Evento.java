package org.java.gestore.eventi;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date;

public class Evento {
	private String titolo;
	private Date dataInserita;
	private int postiTot;
	private int postiPrenotati;
	
	Evento(String titolo, Date data, int postiTot){
		this.titolo = titolo;
		this.dataInserita = data;
		this.postiTot = postiTot;
		this.postiPrenotati = 0;
	}
	

	public static  LocalDate realDate = LocalDate.now(); // Create a date object
	
	public static void controlloData() {
	if (!realDate.isBefore(dataInserita)) {
	    System.out.println("la data è gia passata");
	}
	System.out.println(dataInserita);
	
	}
		}
	
