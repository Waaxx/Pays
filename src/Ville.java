
public class Ville {
	
	private String nom;
	private int nbHabitants;
	private int superficie;
	private Pays sonPays;
	
	public Ville(String unNom, int unNbHabitant, int uneSuperficie ){
		this.nom = unNom;
		this.nbHabitants = unNbHabitant;
		this.superficie = uneSuperficie;
	}
	public Ville(String unNom){
		this.nom = unNom;
		
	}
	public String getNom(){
		return nom; 
	}
	public void setNom( String unNom){
		this.nom = unNom;
	}
	public int getNbHabitants(){
		return this.nbHabitants;
	}
	public void setNbHabitants(int unHabitant){
		this.nbHabitants = unHabitant;
	}
	
	public int getSuperficie(){
		return this.superficie;
	}
	public void setSuperficie(int uneSuperficie){
		this.superficie = uneSuperficie;
	}
	
	public String toString(){
		String chaine;
		chaine = "Le nom est: " + this.nom;
		chaine += "\nLe nombre d'habitants: " + this.nbHabitants + "\nsuperficie: " + this.superficie;
		return chaine;
		
	}
}
