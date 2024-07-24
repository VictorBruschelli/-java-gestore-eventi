package org.java.gestore.eventi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testGestoreDate {

	public static void main(String[] args) throws ParseException{
		
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = sdf.parse("05-12-2025");
        Date date2 = sdf.parse("10-12-2028");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        int result = date1.compareTo(date2);
        System.out.println("result: " + result);

        if (result == 0) {
            System.out.println("Date1 is equal to Date2");
        } else if (result > 0) {
            System.out.println("Date1 is after Date2");
        } else if (result < 0) {
            System.out.println("Date1 is before Date2");
        } else {
            System.out.println("How to get here?");
        }
        
        //devo fare in modo che una data sia data dal user con scanner e laltra data sia quella corrente 
        //in modo da comparare le due date e vedere se "l'evento è passato o no"


	}

}
