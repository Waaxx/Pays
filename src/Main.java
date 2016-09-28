import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner clavier = new Scanner(System.in);
		
		
		Capital uneCapitale = new Capital("Paris", 12500, 234);
		Pays unPays = new Pays ("FRANCE", "francais","euro", uneCapitale);
		System.out.println(unPays.toString());
		System.out.println("");
		
		//ajouter une ville avec un tableau
		System.out.println("La ville ajouter est: ");
		Ville uneVille1 = new Ville ("etiolle");
		unPays.ajouterUneAutreVille(uneVille1);
		System.out.println(uneVille1);
		System.out.println("");
		
		//rechercher une ville dans un tableau
		System.out.println("Rechercher le nom d'une ville");
		String uneAutreVille1 = clavier.nextLine();
		System.out.println(unPays.rechercherUneAutreVille(uneAutreVille1));
		System.out.println("");
		
		//supprimer une ville avec un tableau
		System.out.println("voulez vous supprimer une ville (o/n) ?");
		 String repon=clavier.nextLine().toLowerCase();
	        while(!repon.equals("o") && !repon.equals("n")){
	        	repon=clavier.nextLine().toLowerCase();
	        	
	        }
	        if(repon.equals("o")){
	        	System.out.println("saisir le nom de la ville");
	        	String reponse = clavier.nextLine().toLowerCase();
	        	unPays.supprimerUneAutreVille(uneVille1);
	        	if (reponse.equals(uneVille1.getNom())){
	        		System.out.println("la ville " + reponse + " a été supprimer");
	        	}
	        	else{
	        		System.out.println("Cette ville n'existe pas");
	        	}	
	        }
	        else{
	        	System.out.println("Adios");
	        }
	        System.out.println("");
	        
	   
		
		
		Capital uneAutreCapital = new Capital ("Mexico", 23456, 4567);
		Pays unAutrePays = new Pays ("Mexique", "espagnol","pesos", uneAutreCapital);
		System.out.println(unAutrePays.toString());
		System.out.println(Pays.getcompteurPays());
		System.out.println("");
		
		//avec une collection ajouter une ville
		System.out.println("la ville ajouter est:  ");
		Ville uneVille = new Ville("guadalajara"); 
		unAutrePays.ajouterUneVille(uneVille);
		System.out.println(uneVille);
		
		//rechercher une ville dans une collection
		System.out.println("Rechercher le nom d'une ville");
		String uneAutreVille = clavier.nextLine();
		System.out.println(unAutrePays.rechercherUneVille(uneAutreVille));
		
		//supprimer une ville dans une collection
		System.out.println("voulez vous supprimer une ville (o/n) ?");
		 String repo=clavier.nextLine().toLowerCase();
	        while(!repo.equals("o") && !repo.equals("n")){
	        	repo=clavier.nextLine().toLowerCase();
	        	
	        }
	        if(repo.equals("o")){
	        	System.out.println("saisir le nom de la ville");
	        	String reponse = clavier.nextLine().toLowerCase();
	        	unAutrePays.supprimerUneVille(reponse);
	        	if (reponse.equals(uneVille.getNom())){
	        		System.out.println("la ville " + reponse + " a été supprimer");
	        	}
	        	else{
	        		System.out.println("Cette ville n'existe pas");
	        	}	
	        }
	        else{
	        	System.out.println("Adios");
	        }
	        
	   }

}
