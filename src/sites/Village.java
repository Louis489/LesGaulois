package sites;
import personnages.Gaulois;
import personnages.Soldat;


public class Village {
	private Gaulois chef;
	private Gaulois[] tabgaulois = new Gaulois[5];
	private int nbVillageois;

		public Village(Gaulois chef){
			this.chef = chef;
		}
			
		public Gaulois getChef() {
			return chef;
		}
		
		
		public void ajouterGaulois(Gaulois gaulois) {
	        if (nbVillageois < tabgaulois.length) {
	            tabgaulois[nbVillageois] = gaulois;
	            nbVillageois++;
	            chef.parler("Bienvenue" +  gaulois.getNom() + "!");
	        } else {
	            chef.parler("Désolé" + gaulois.getNom() + "mon village est déjà bien rempli.");
	        }
	    }
}

