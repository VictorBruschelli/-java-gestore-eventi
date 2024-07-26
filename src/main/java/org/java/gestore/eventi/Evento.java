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
	

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getDataInserita() {
		return dataInserita;
	}

	public void setDataInserita(Date dataInserita) {
		this.dataInserita = dataInserita;
	}

	public int getPostiTot() {
		return postiTot;
	}

	public void setPostiTot(int postiTot) {
		this.postiTot = postiTot;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}





	public static  LocalDate realDate = LocalDate.now(); // Create a date object
	
		}
	
