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
        System.out.println(donnerAuteur() + nom + " : « " + texte + " ».");
    }
	
	protected abstract String donnerAuteur();
	
	
	public void frapper(Personnage adversaire) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + adversaire.getNom());
		adversaire.recevoirCoup(force/3);
		
	}
		
	public void recevoirCoup(int coup) {
		if(coup >= force){
			force = 0;
			System.out.println("J’abandonne…");
		}
		else{
			System.out.println("Aïe !");
			force = force - coup;
		}}
}
