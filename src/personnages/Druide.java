package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
    private Random random;
    private int forcePotion;
    private int nbDoses;

    public Druide(String nom, int force) {
        super(nom, force);
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public int getForcePotion(){
    	return forcePotion;
    }
    
    public int getNombreDeDoses(){
    	return nbDoses;
    }
    
    public void fairePotionMagique(int nombreDeDoses) {        
        forcePotion = random.nextInt(5) + 2;
        nbDoses = nombreDeDoses;
        parler(getNom() + " J'ai concocté " + nombreDeDoses + " doses de potion magique. Elle a une force de " + forcePotion);
    }
    
    public void booster(Gaulois buveur) {
        if (getNom().equals("Obélix")) {
            parler(" Non, Obélix Non !... Et tu le sais très bien !");
        } else {
            parler("Tiens " + getNom() + " un peu de potion magique.");
            forcePotion -= 0.5;
        }
    }
}
