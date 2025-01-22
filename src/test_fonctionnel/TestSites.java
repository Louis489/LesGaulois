package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		
		 // Création des Gaulois
        Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obelix", 15);
        Gaulois prolix = new Gaulois("Prolix", 2);

        // Création des Soldats
        Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
        Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
        Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
        Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		

		
		
		
		
		Gaulois vercingétorix = new Gaulois("Vercingétorix",5);
		Village village = new Village(vercingétorix);
		Soldat minus = new Soldat("Minus",2, Grade.SOLDAT);
		Camp camp = new Camp(minus);
		vercingétorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler(" Je suis en charge de créer un nouveau camp romain.");
        camp.ajouterSoldat(brutus);
        camp.ajouterSoldat(milexcus);
        camp.ajouterSoldat(tulliusOctopus);
        camp.ajouterSoldat(ballondebaudrus);
		
	}
}
