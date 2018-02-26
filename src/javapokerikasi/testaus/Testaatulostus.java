package javapokerikasi.testaus;

import java.util.*;
import java.util.Arrays;

import javapokerikasi.constructor.Kasi;
import javapokerikasi.constructor.Kortti;
import javapokerikasi.constructor.Pakka;

public class Testaatulostus {
	public static void main(String[] args) {
		//Luodaan testaukseen oma k�si jota muutetaan tarvittaessa.
		    Kortti kortti1 = new Kortti("4", "Ruutu");
		    Kortti kortti2 = new Kortti("5", "Ruutu");
		    Kortti kortti3 = new Kortti("6", "Ruutu");
		    Kortti kortti4 = new Kortti("7", "Ruutu");
		    Kortti kortti5 = new Kortti("8", "Ruutu");
		    ArrayList<Kortti> kortit = new ArrayList<Kortti>();
		    kortit.add(kortti1);
		    kortit.add(kortti2);
		    kortit.add(kortti3);
		    kortit.add(kortti4);
		    kortit.add(kortti5);
		//Luodaan uusi pakka    
		    Pakka pakka=new Pakka();
		//Tarkistetaan pakan tulostus
	    	System.out.println(pakka.toString());
	    // Kokeillaan uudestaan mutta sekoitetulla pakalla
		    System.out.println("-----------  Sekotuksen j�lkeen ----------\n");
	        pakka.sekoita();
	        System.out.println(pakka.toString());
        // Luodaan testik�det
	        System.out.println("-----------  Kokeillaan k�sia ----------\n");
	        ArrayList<Kortti> kasi1 = new ArrayList<Kortti>();
	        ArrayList<Kortti> kasi2 = new ArrayList<Kortti>();
	        ArrayList<Kortti> kasi3 = new ArrayList<Kortti>();
	        ArrayList<Kortti> kasi4 = new ArrayList<Kortti>();
	        for (int i=0; i<5; i++){
	        	kasi1.add(pakka.nosta());
	        }
	        for (int i=0; i<5; i++){
	        	kasi2.add(pakka.nosta());
	        }
	        for (int i=0; i<5; i++){
	        	kasi3.add(pakka.nosta());
	        } 
	        for (int i=0; i<5; i++){
	        	kasi4.add(pakka.nosta());
	        }
	        Kasi KASI1 = new Kasi(kasi1);
	        Kasi KASI2 = new Kasi(kasi2);
	        Kasi KASI3 = new Kasi(kasi3);
	        Kasi KASI4 = new Kasi(kasi4);
	        Kasi KASI5 = new Kasi(kortit);
	        System.out.println("Pelaajan 1 k�si");
	        System.out.println((KASI1.toString()));
	        System.out.println("Pelaajan 2 k�si/n");
	        System.out.println((KASI2.toString()));
	        System.out.println("Pelaajan 3 k�si/n");
	        System.out.println((KASI3.toString()));
	        System.out.println("Pelaajan 4 k�si/n");
	        System.out.println((KASI4.toString()));
	        System.out.println("Pelaajan 5 k�si/n");
	        System.out.println((KASI5.toString()));

	        //Tulostetaan mahdolliset voittok�det, vain paras tulostetaan
		        int tulos = KASI1.paraskasi();
		        if (tulos == 8.0){
		        	System.out.println("Pelaajalla 1 on v�risuora");
		        }
		        else if (tulos == 7){
		        	System.out.println("Pelaajalla 1 on neloset");
		        }
		        else if (tulos == 6){
		        	System.out.println("Pelaajalla 1 on t�ysk�si");
		        }
		        else if (tulos == 5){
		        	System.out.println("Pelaajalla 1 on v�ri");
		        }
		        else if (tulos == 4){
		        	System.out.println("Pelaajalla 1 on suora");
		        }
		        else if (tulos == 3){
		        	System.out.println("Pelaajalla 1 on kolmoset");
		        }
		        else if (tulos == 2){
		        	System.out.println("Pelaajalla 1 on kaksi paria");
		        }
		        else if (tulos == 1){
		        	System.out.println("Pelaajalla 1 on pari");
		        }
		        else{
		        	System.out.println("Pelaajalla 1 ei ole mit��n");
		        	KASI1.hai();
		        }
		        
		        int tulos2 = KASI2.paraskasi();
		        if (tulos2 == 8.0){
		        	System.out.println("Pelaajalla 2 on v�risuora");
		        }
		        else if (tulos2 == 7){
		        	System.out.println("Pelaajalla 2 on neloset");
		        }
		        else if (tulos2 == 6){
		        	System.out.println("Pelaajalla 2 on t�ysk�si");
		        }
		        else if (tulos2 == 5){
		        	System.out.println("Pelaajalla 2 on v�ri");
		        }
		        else if (tulos2 == 4){
		        	System.out.println("Pelaajalla 2 on suora");
		        }
		        else if (tulos2 == 3){
		        	System.out.println("Pelaajalla 2 on kolmoset");
		        }
		        else if (tulos2 == 2){
		        	System.out.println("Pelaajalla 2 on kaksi paria");
		        }
		        else if (tulos2 == 1){
		        	System.out.println("Pelaajalla 2 on pari");
		        }
		        else{
		        	System.out.println("Pelaajalla 2 ei ole mit��n");
		        	KASI2.hai();
		        }
		        
		        int tulos3 = KASI3.paraskasi();
		        if (tulos3 == 8){
		        	System.out.println("Pelaajalla 3 on v�risuora");
		        }
		        else if (tulos3 == 7){
		        	System.out.println("Pelaajalla 3 on neloset");
		        }
		        else if (tulos3 == 6){
		        	System.out.println("Pelaajalla 3 on t�ysk�si");
		        }
		        else if (tulos3 == 5){
		        	System.out.println("Pelaajalla 3 on v�ri");
		        }
		        else if (tulos3 == 4){
		        	System.out.println("Pelaajalla 3 on suora");
		        }
		        else if (tulos3 == 3){
		        	System.out.println("Pelaajalla 3 on kolmoset");
		        }
		        else if (tulos3 == 2){
		        	System.out.println("Pelaajalla 3 on kaksi paria");
		        }
		        else if (tulos3 == 1){
		        	System.out.println("Pelaajalla 3 on pari");
		        }
		        else{
		        	System.out.println("Pelaajalla 3 ei ole mit��n");
		        	KASI3.hai();
		        }
		        
		        double tulos4 = KASI4.paraskasi();
		        if (tulos4 == 8){
		        	System.out.println("Pelaajalla 4 on v�risuora");
		        }
		        else if (tulos4 == 7){
		        	System.out.println("Pelaajalla 4 on neloset");
		        }
		        else if (tulos4 == 6){
		        	System.out.println("Pelaajalla 4 on t�ysk�si");
		        }
		        else if (tulos4 == 5){
		        	System.out.println("Pelaajalla 4 on v�ri");
		        }
		        else if (tulos4 == 4){
		        	System.out.println("Pelaajalla 4 on suora");
		        }
		        else if (tulos4 == 3){
		        	System.out.println("Pelaajalla 4 on kolmoset");
		        }
		        else if (tulos4 == 2){
		        	System.out.println("Pelaajalla 4 on kaksi paria");
		        }
		        else if (tulos4 == 1){
		        	System.out.println("Pelaajalla 4 on pari");
		        }
		        else{
		        	System.out.println("Pelaajalla 4 ei ole mit��n");
		        	KASI4.hai();
		        }
		        double tulos5 = KASI5.paraskasi();
		        if (tulos5 == 8){
		        	System.out.println("Pelaajalla 1 on v�risuora");
		        }
		        else if (tulos5 == 7){
		        	System.out.println("Pelaajalla 1 on neloset");
		        }
		        else if (tulos5 == 6){
		        	System.out.println("Pelaajalla 1 on t�ysk�si");
		        }
		        else if (tulos5 == 5){
		        	System.out.println("Pelaajalla 1 on v�ri");
		        }
		        else if (tulos5 == 4){
		        	System.out.println("Pelaajalla 1 on suora");
		        }
		        else if (tulos5 == 3){
		        	System.out.println("Pelaajalla 1 on kolmoset");
		        }
		        else if (tulos5 == 2){
		        	System.out.println("Pelaajalla 1 on kaksi paria");
		        }
		        else if (tulos5 == 1){
		        	System.out.println("Pelaajalla 1 on pari");
		        }
		        else{
		        	System.out.println("Pelaajalla 1 ei ole mit��n");
		        }
		        
		        //Tarkistaa ett� k�sien kortit l�htiv�t pakasta
		        System.out.println(pakka.toString());

		}
}
