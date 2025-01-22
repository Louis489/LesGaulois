package sites;
import personnages.Gaulois;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[3];
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

}
