package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void mainA(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
		asterix.parler("Arah");
	}
}
