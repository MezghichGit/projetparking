package gestion_parking.model;

import java.util.ArrayList;

public class GestionParking {

	static private ArrayList<Voiture>listeVoitures = new ArrayList<>();
	
	public static void ajouterVoitureParking(Voiture v){
		listeVoitures.add(v);
	}
	
	public static void listeVoituresParking()
	{
		System.out.println(listeVoitures);
	}
}
