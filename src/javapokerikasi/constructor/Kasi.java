package javapokerikasi.constructor;
import java.util.*;
import java.util.Arrays;

public class Kasi {
	 private ArrayList<Kortti> kasi;
	    private int[] numerot;
	    private String[] maat;

	   //rakennetaan käsi luokka korttiluokan arrayn pohjalta
	    public Kasi(ArrayList<Kortti> kortit) {
	        kasi = kortit;
	        numerot = numerot();
	        maat = maat();

	        Arrays.sort(numerot);
	        Arrays.sort(maat);
	    }
	    
	   //palauttaa käden arrayna
	    public ArrayList<Kortti> kortit() {
	        return kasi;
	    }
	    
	   // Tarkistetaan mikä käsi on ja numeraalisella arvolla laitetaan eteenpäin
	    public int paraskasi() {
	        int ranking = 0;
	        
	        if (varisuora() == 8.0) {
	            ranking = varisuora();
	        } else if (neloset() == 7.0) {
	            ranking = neloset();
	        } else if (tayskasi() == 6.0) {
	            ranking = tayskasi();
	        } else if (vari() == 5.0) {
	            ranking = vari();
	        } else if (suora() == 4.0) {
	            ranking = suora();
	        } else if (kolmoset() == 3.0) {
	            ranking = kolmoset();
	        } else if (kaksiparia() == 2.0) {
	            ranking = kaksiparia();
	        }   else if (pari() == 1.0) {
	            ranking = pari();
	        } else {
	            // WTF?
	        }
	        
	        return ranking;
	    }
	    
	    
	    //Luodaan käden korttien arvojen lista
	    private int[] numerot() {
	        int[] numtulos = new int[5];
	        
	        for (int i = 0; i < kasi.size(); i++) {
	            numtulos[i] = kasi.get(i).getNumero();
	        }
	        
	        return numtulos;
	    }
	    
	    //Luodaan käden maiden lista
	    private String[] maat() {
	        String[] maatulos = new String[5];
	        
	        for (int i = 0; i < kasi.size(); i++) {
	            maatulos[i] = kasi.get(i).getMaa();
	        }
	        
	        return maatulos;
	    }
	    
	    // Katsotaan onko kädessä pari
	    public int pari() {
	        int tulos = 0;
	        
	        for (int i = 0; i < numerot.length - 1; i++) {
	            if (numerot[i] == numerot[i + 1]) {
	                tulos = 1;
	            }
	        }
	        
	        return tulos;
	    }
	    
	    // Katsotaan onko kädessä kaksi paria
	    public int kaksiparia() {
	        int tulos = 0;
	        int laskuri = 0; // Parien määrä
	        
	        for (int i = 0; i < numerot.length - 1; i++) {
	            if (numerot[i] == numerot[i + 1]) {
	                laskuri++;
	                
	            }
	        }
	        
	        if (laskuri == 2) {
	            tulos = 2;
	        }
	        
	        return tulos;
	    }
	    
	    // Katsotaan onko kädessä kolmoset
	    public int kolmoset() {
	        int tulos = 0;
	       
	        for (int i = 0; i < numerot.length - 2; i++) {
	            if (numerot[i] == numerot[i + 1] && numerot[i] == numerot[i + 2]) {
	                tulos = 3;
	            }
	        }
	        
	        return tulos;
	    }
	    
	    // Katsotaan onko kädessä suora
	    public int suora() {
	        int tulos = 0;
	        Arrays.sort(numerot);
	        int laskuri = 0;
	        for (int i = 0; i < numerot.length-1; i++){
	            if (numerot[i]+1 == numerot[i+1]) {
	            	laskuri++;
	            }
	        }
	        if (laskuri == 4){
	        	tulos = 4;
	        }
	        else{
	        	tulos = 0;
	        }
	        
	        return tulos;
	    }
	    
	    // Katsotaan onko kädessä väri
	    public int vari() {
	        int tulos = 0;
	        
	        String maa = maat[0];
	        
	        for (int i = 0; i < maat.length; i++) {
	            tulos = 5;

	            if (maat[i].equals(maa) == false) {
	                tulos = 0;
	            }
	        }
	        
	        return tulos;
	    }
	    
	    // Katsotaan onko kädessä täyskäsi
	    public int tayskasi() {
	        int tulos = 0;
	        boolean eka = false;
	        boolean toka = false;
	        
	        for (int i = 0; i < numerot.length - 2; i++) {
	            if (numerot[i] == numerot[i + 1] && numerot[i] == numerot[i + 2]) {
	                eka = true;
	            }
	        }
	        
	        if (numerot[3] == numerot[4]) {
	            toka = true;
	        }
	        
	        if (eka && toka) {
	            tulos = 6;
	        }
	        
	        return tulos;
	    }
	    
	    // Katsotaan onko kädessä neloset
	    public int neloset() {
	        int tulos = 0;
	       
	        for (int i = 0; i < numerot.length - 3; i++) {
	            if (numerot[i] == numerot[i + 1] && numerot[i] == numerot[i + 2] && numerot[i] == numerot[i + 3]) {
	                tulos = 7;
	            }
	        }
	        
	        return tulos;
	    }
	    
	    
	    //Katsotaan onko kädessä värisuora
	    public int varisuora() {
	        int tulos = 0;
	        
	        if (suora() == 4.0 && vari() == 5.0) {
	            tulos = 8;
	        }
	        
	        return tulos;
	    }
	    
	    public void hai(){
	    	Arrays.sort(numerot);
	    	int hai = numerot[4];
	    	System.out.println("Pelaajan hai on " + hai);
	    }

	    
	    // Tulostaa käden Kortti luokan toString käskyn pohjalta
	    public String toString(){
	        String result = "";
	        result += kasi.get(0).toString();
	        
	        for (int i = 1; i < 5; i++) {
	            result += ", "+ kasi.get(i).toString();
	        }
	        
	        return result;
	    }

}
