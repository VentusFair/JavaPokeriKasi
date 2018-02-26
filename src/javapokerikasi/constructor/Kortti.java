package javapokerikasi.constructor;

import java.util.*;

public class Kortti  {
	private int numero;
	private String maa;

	//Rakentaa kortin annettujen tietojen perusteella
	public Kortti(String n, String m) {
		if (n.equals("2") || n.equals("3") || n.equals("4") || n.equals("5") || n.equals("6") || n.equals("7") || n.equals("8") || n.equals("9") || n.equals("10") || n.equals("11") || n.equals("12") || n.equals("13") || n.equals("14")) {
			numero = Integer.parseInt(n);
		} else {
			if (n.equals("Jätkä")) {
				numero = 11;
			} else if (n.equals("Kuningatar")) {
				numero = 12;
			} else if (n.equals("Kuningas")) {
				numero = 13;
			} else if (n.equals("Ässä")) {
				numero = 14;
			}
		}
		
		maa = m;
	}
	
	//Palauttaa numero arvon takaisin kortin nimeksi
	public String numero() {
		String tulos = "";
		
		// Numerokortin arvo on helppo muuttaa tekstiksi
		if (numero >= 2 && numero <= 10) {
			tulos = Integer.toString(numero);
		}
		
		// Käydään läpi kuvakorttien nimet
		else if (numero >= 11 && numero <= 14) {
			if (numero == 11) {
				tulos = "Jätkä";
			} else if (numero == 12) {
				tulos = "Kuningatar";
			} else if (numero == 13) {
				tulos = "Kuningas";
			} else if (numero == 14) {
				 tulos = "Ässä";
			} else {
				tulos = "Ei ole käypä kortin arvo";
			}
		}
		
		return tulos;
	}
	
	//Palauttaa kortin numeron
	public int getNumero() {
		return numero;
	}
	
	// Palauttaa kortin maan
	public String getMaa() {
		return maa;
	}
	

	
	// Tulostaa kortin tiedot, antaa maan kirjaimina ja numeron numeroina ja kuvakorteille kirjaimina
	public String toString() {
		return maa + " " + numero();
	}


}
