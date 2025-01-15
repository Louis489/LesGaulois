package personnages;

public class Gaulois extends Personnage{
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		super(nom,force);
	}
	
	protected String donnerAuteur() {
		return "Gaulois ";
	}
}
