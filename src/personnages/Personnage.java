package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	
    public Personnage(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
        System.out.println("Le " + donnerAuteur() + nom + " : « " + texte + " ».");
    }
	
	protected abstract String donnerAuteur();
	
	
    public void frapper(Personnage adversaire) {
  
        System.out .println(donnerAuteur() + getNom() + " donne un grand coup au " + adversaire.donnerAuteur() + adversaire.getNom());
        adversaire.recevoirCoup(force / 3);
    }
		
	public void recevoirCoup(int coup) {
		if(coup >= force){
			force = 0;
			parler("J’abandonne…");
		}
		else{
			parler("Aïe !");
			force = force - coup;
		}}
}
