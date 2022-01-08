package gestion_parking.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Bus b = new Bus();
		Voiture v1 = new Voiture("2008","100TUN2018","Peugeot",LocalDate.of(2022, 1, 1),LocalDate.of(2022, 1, 5),11223344,"Amine"); // nbVoitures++ => 1
		Voiture v2 = new Voiture("3008","20TUN2019","Peugeot",LocalDate.of(2020, 1, 1),LocalDate.of(2020, 2, 4),11223634,"Ali"); // nbVoitures++ => 2
		Voiture v3 = new Voiture("208","10TUN2010","Peugeot",LocalDate.of(2022, 10, 12),LocalDate.of(2022, 1, 5),13223344,"Mouna");
		Voiture v4 = new Voiture("308","11TUN2012","Peugeot",LocalDate.of(2022, 3, 1),LocalDate.of(2022, 1, 6),16223344,"Safa");
		
		GestionParking.ajouterVoitureParking(v1);
		GestionParking.ajouterVoitureParking(v2);
		GestionParking.ajouterVoitureParking(v3);
		GestionParking.ajouterVoitureParking(v4);
		GestionParking.listeVoituresParking();
		
		System.out.println("Nombre de voitures dans le parking = "+Voiture.getNbVoitures());
		/*System.out.println(v1.getNbVoitures());
		
		ArrayList<String>names = new ArrayList<>();
		System.out.println(names.size());
		System.out.println(names.isEmpty());
		names.add("Oussama");
		names.add("Mohamed");
		System.out.println(names);*/
		//System.out.println(v1.toString());
		//System.out.println(v1);
		
		/*
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);
		
		LocalDate ld2 = LocalDate.of(2016, 7, 12);
		System.out.println(ld2);
		
		
		DateTimeFormatter myformat = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter myformat2 = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println(ld2.format(myformat));
		System.out.println(ld2.format(myformat2));*/

	}

}
