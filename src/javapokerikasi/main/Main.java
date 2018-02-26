package javapokerikasi.main;

import java.util.*;

import javapokerikasi.constructor.Kasi;
import javapokerikasi.constructor.Kortti;
import javapokerikasi.constructor.Pakka;

public class Main {

	public static void main(String[] args) {
		Pakka pakka=new Pakka();
		pakka.sekoita();
		
		ArrayList<Kortti> kasi1 = new ArrayList<Kortti>();
        ArrayList<Kortti> kasi2 = new ArrayList<Kortti>();
        ArrayList<Kortti> kasi3 = new ArrayList<Kortti>();
        
        for (int i=0; i<5; i++){
        	kasi1.add(pakka.nosta());
        }
        for (int i=0; i<5; i++){
        	kasi2.add(pakka.nosta());
        }
        for (int i=0; i<5; i++){
        	kasi3.add(pakka.nosta());
        } 
        
        Kasi KASI1 = new Kasi(kasi1);
        Kasi KASI2 = new Kasi(kasi2);
        Kasi KASI3 = new Kasi(kasi3);
        
        System.out.println("Pelaajan 1 käsi");
        System.out.println((KASI1.toString()));
        System.out.println("Pelaajan 2 käsi/n");
        System.out.println((KASI2.toString()));
        System.out.println("Pelaajan 3 käsi/n");
        System.out.println((KASI3.toString()));
        
        System.out.println("");
        
        int tulos = KASI1.paraskasi();
        if (tulos == 8){
        	System.out.println("Pelaajalla 1 on värisuora");
        }
        else if (tulos == 7){
        	System.out.println("Pelaajalla 1 on neloset");
        }
        else if (tulos == 6){
        	System.out.println("Pelaajalla 1 on täyskäsi");
        }
        else if (tulos == 5){
        	System.out.println("Pelaajalla 1 on väri");
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
        	System.out.println("Pelaajalla 1 ei ole mitään");
        	KASI1.hai();
        }
        
        System.out.println("");
        
        int tulos2 = KASI2.paraskasi();
        if (tulos2 == 8){
        	System.out.println("Pelaajalla 2 on värisuora");
        }
        else if (tulos2 == 7){
        	System.out.println("Pelaajalla 2 on neloset");
        }
        else if (tulos2 == 6){
        	System.out.println("Pelaajalla 2 on täyskäsi");
        }
        else if (tulos2 == 5){
        	System.out.println("Pelaajalla 2 on väri");
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
        	System.out.println("Pelaajalla 2 ei ole mitään");
        	KASI2.hai();
        }
        
        System.out.println("");
        
        int tulos3 = KASI3.paraskasi();
        if (tulos3 == 8){
        	System.out.println("Pelaajalla 3 on värisuora");
        }
        else if (tulos3 == 7){
        	System.out.println("Pelaajalla 3 on neloset");
        }
        else if (tulos3 == 6){
        	System.out.println("Pelaajalla 3 on täyskäsi");
        }
        else if (tulos3 == 5){
        	System.out.println("Pelaajalla 3 on väri");
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
        	System.out.println("Pelaajalla 3 ei ole mitään");
        	KASI3.hai();
        }
	}

}
