package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		
		Romain minus = new Romain("Minus", 6);
		int i=0;
		
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("oui très bonne idée.");
		System.out.println("Dans la forêt" + asterix.getNom() + " et  "+ obelix.getNom() + " tombe nez à nez sur le romain " + minus.getNom());
		
		while (i<3) {
			asterix.frapper(minus);
			if (i>=2) {
				minus.parler("J'abandonne !");
			}
			else {
				minus.parler("Aïe");
			}
			i+=1;
			
		}
		
	}
}
