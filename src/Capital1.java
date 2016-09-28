
public class Capital1 extends Ville{
	

	
	public Capital(String unNom, int unNbHabitant, int uneSuperficie){
		super(unNom, unNbHabitant,uneSuperficie);
		
		
	}
	

	
	public String toString(){
		String chaine;
		chaine = "Le nom est: " + super.getNom();
		chaine += "\nLe nombre d'habitants: " + super.getNbHabitants() + "\nsuperficie: " + super.getSuperficie();
		return chaine;
		
	}

}
// bla bla 
//vive les licornes