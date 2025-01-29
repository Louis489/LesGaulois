package sites;
import personnages.Gaulois;
import personnages.Soldat;


public class Village {
	private Gaulois chef;
	private Gaulois[] tabgaulois = new Gaulois[6];
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
	            chef.parler("Bienvenue " +  gaulois.getNom() + " !");
	        } else {
	            chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
	        }
	    }
		
	    public void afficherVillage() {
	        System.out.println("Le village de " + chef.getNom() + " est habité par :");
	        for (int i = 0; i < nbVillageois; i++) {
	            System.out.println("- " + tabgaulois[i].getNom());
	        }
	    }
	    
	    public void changerChef(Gaulois nouveauChef) {
	        chef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom());
	        chef = nouveauChef;
	        chef.parler("merci !");
	    }
	    
}

