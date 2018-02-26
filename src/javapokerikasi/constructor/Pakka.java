package javapokerikasi.constructor;
import java.util.*;

public class Pakka {
	private ArrayList<Kortti> pakka;
	
	//Luodaan pakka ja annetaan kortti luokan avulla 52 objektille arvot
	public Pakka() {
		pakka = new ArrayList<Kortti>();
		
		for (int i = 2; i < 15; i++) {
			pakka.add(new Kortti("" + i+"", "Hertta"));
			pakka.add(new Kortti("" + i+"", "Risti"));
			pakka.add(new Kortti("" + i+"", "Ruutu"));
			pakka.add(new Kortti("" + i+"", "Pata"));
		}
	}
	
	//Sekoittaa pakan
	public void sekoita() {
		Collections.shuffle(pakka);
	}
	
	//Nostaa kortin pakan "p‰‰lt‰"
	public Kortti nosta() {
		return pakka.remove(0);
	}
	
	//Palauttaa pakan arrayn
	public ArrayList<Kortti> kortit() {
		return pakka;
	}
	
	// Heitt‰‰ koko rakennetun pakan tekstiksi
	public String toString() {
		String result = "";
		
		for (int i = 0; i < pakka.size(); i++) {
			result += pakka.get(i).getMaa() + "  " + pakka.get(i).numero() + " ";
			
			if (i < 51) {
				result += "--";
			}
		}
		
		return result;
	}

}
