package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	protected String getNom() {
		return nom;
	}
	
	public static void mainB(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());

	}
	
	public void parler(String texte) {
        System.out.println("Le gaulois " + this.nom + " : « " + texte + " ».");
    }

	
}
