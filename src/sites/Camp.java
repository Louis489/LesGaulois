package sites;
import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[80];
	private int nbsoldat = 0;
	
	public Camp(Soldat commandant){
		this.commandant = commandant;
	}
		
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
        if (nbsoldat < soldats.length) {
            soldats[nbsoldat] = soldat;
            nbsoldat++;
            soldat.parler(" Je mets mon épée au service de Rome dans le camp dirigé par" + commandant.getNom() + ".");

        } else {
            commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
        }
    }
	
	public void afficherCamp() {
	    System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :" );
	    for (int i = 0; i < nbsoldat; i++) {
	        System.out.println("- " + soldats[i].getNom());
	    }
	}
	
    public void changerCommandant(Soldat nouveauCommandant) {
        if(nouveauCommandant.getGrade().equals(Grade.CENTURION)) {
        	commandant = nouveauCommandant;
        	commandant.parler("Moi " + commandant.getNom() + " je prends la direction du camp romain.");
        	
        }else {
        	nouveauCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ");
        }
    }
    
}
