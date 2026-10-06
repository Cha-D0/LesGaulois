package personnages;

public class Druide {
	private String nom;
	private int force;
	
	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+ "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		Chaudron chaudron = new Chaudron(quantite, forcePotion);
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté "+ quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
		
		
	}
	
	
	public void booster(Gaulois gaulois) {
		Chaudron chaudron = new Chaudron(0, force);
		if(chaudron.resterPotion()) {
			Druide druide = new Druide(nom, force);
			druide.parler("Non "+ gaulois.getNom() + " Non ! Et tu le sait très bien !");
			
			int forcePotion = chaudron.prendreLouche();
			gaulois.boirePotion(forcePotion);
			
			druide.parler("Tiens "+ gaulois.getNom()+" un peu de potion magique");
			
		}
		else {
			druide.parler("Désolé "+ gaulois.getNom()+" il n'y a plus une seule goutte de potion");
		
		}
		
	}

}
