import java.util.ArrayList;
public class Pays {
	/**
	 * 
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 * @param uneCapitale
	 */
	private String nom;
	private String langue;
	private String monnaie;
	private Ville lesVille[];
	private ArrayList<Ville>lesVilles;
	private static int  compteurPays = 0;
	private Capital saCapitale;
	private int nbVille;

	/**
	 * 
	 * @constructeur de la classe Pays
	 */
	
	//constructeur
	public Pays (String unNom, String uneLangue, String uneMonnaie, Capital saCapitale, ArrayList<Ville>lesVille){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays + 1;
		this.saCapitale = saCapitale;
		lesVilles = new ArrayList<Ville>();
		this.lesVille = new Ville [10];
		
	}

	
	public Pays (String unNom, String uneLangue, String uneMonnaie, Capital saCapitale ){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays + 1;
		this.saCapitale = saCapitale;
		lesVilles = new ArrayList<Ville>();
		this.lesVille = new Ville [10];
		
	}
	
	public Pays (String unNom, String uneLangue, String uneMonnaie ){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays + 1;
		lesVilles = new ArrayList<Ville>();
		this.lesVille = new Ville [10];
	
		
	}
	//accesseur
	public Capital getSaCapital(){
		return this.saCapitale;
	}
	public void setSaCapital( Capital uneCapitale){
		this.saCapitale = uneCapitale;
	}

	/**
	 * 
	 * @get nom
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * 
	 * @param unNom
	 */
	
	public void setNom (String unNom){
		this.nom = unNom;
	}
	/**
	 * 
	 * @method de la class pays
	 */
	public static int getcompteurPays(){
		return compteurPays;
	}
	
	public ArrayList<Ville> getLesVilles(){
		return this.lesVilles;
	}
	
	/**
	 * @method toString de la classe Pays 
	 */
	//methodes publiques
	public String toString(){
		String chaine;
		chaine ="le nom est: "+ this.nom();
		chaine += "\nla langue est: " + this.langue + "\nla monnaie est: " + this.monnaie + "\nla capital: " + this.saCapitale;
		return chaine ;
		
	}
	/**
	 * @nomMaj methode de la classe Pays
	 * @return
	 */
	
	public String nomMaj(){
		
		return this.nom.toUpperCase();
	}
	
	private String nom(){
		String chaine="";
		chaine += this.nom.toUpperCase().charAt(0);
		chaine += this.nom.substring(1,this.nom.length()).toLowerCase(); //on part de la deuxième case on va jusqu'a la fin et on met en minuscule
	
		
		return chaine;
	}
	
	//ajouter une ville dans un tableau
	
	public void ajouterUneAutreVille(Ville uneVille){
		int i = 0;
		while (lesVille[i] != null){
			i =i+1;
		}
		if (i < lesVille.length){
			lesVille[i] = uneVille;
		}
	}
	
	//supprimer une ville avec un tableau
	
	public void supprimerUneAutreVille(Ville uneVille){
		int j ;
		int i = 0;
		if( nbVille> 1 && i != nbVille-1){
			for (j = 0; i < nbVille-2; j++ ){
				lesVille[j] = lesVille[j + i];
			}
		}
	}

	//ajouter une ville dans une collection
	
	public void ajouterUneVille(Ville uneVille){
		this.lesVilles.add(uneVille);
		
	}
	
	//rechercher une ville dans un tableau
	public boolean rechercherUneAutreVille(String unNom){
		int i = 0;
		boolean trouver;
		while (i<nbVille && !unNom.equals(lesVille[i].getNom())){
			i++;
		}
		if(i<nbVille){
			trouver = true;
			System.out.println("Cette ville existe au " + this.nom);
		}
		else{
			trouver = false;
			System.out.println("Cette ville n'existe pas");
		}
		return trouver;
	}
	
	//rechercher une ville dans une collection
	public boolean rechercherUneVille(String unNom){
			    int i=0;
			    boolean trouver = false;
			    if (this.lesVilles.size() == 0){
			    	System.out.println("la collection est vide");
			    }
			    else{
			    	
			    
			    while (i<this.lesVilles.size() && !unNom.equals(lesVilles.get(i).getNom())){
			    	i = i + 1;
			    }
			    if(i<this.lesVilles.size()){
			    	trouver = true;
			    	System.out.println("Cette ville existe au : " + this.nom);
			    }
			    else{
			    	System.out.println("Cette ville n'existe pas");
			    }
			    }
			    return trouver;
	}
	
	//supprimer ville
	
	public void supprimerUneVille(String unNom){
		
		this.lesVilles.remove(unNom);
	}
	
	public void supprimerUneVille( int position){
		this.lesVilles.remove(position);
	}

}
