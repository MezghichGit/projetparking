package gestion_parking.model;

import java.time.LocalDate;

public class Voiture{
	private String marque ;
	private String immatriculation ;
	private String modele;
	private LocalDate dateArrive ;
	private LocalDate dateSortie ;
	private int cinClient;
	private String nomClient;
	
	private static int nbVoitures;
	
	public static int getNbVoitures()
	{
		return nbVoitures;
	}
	
	public Voiture(String marque, String immatriculation, String modele, LocalDate dateArrive, LocalDate dateSortie,
			int cinClient, String nomClient) {
		nbVoitures++;
		this.marque = marque;
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.dateArrive = dateArrive;
		this.dateSortie = dateSortie;
		this.cinClient = cinClient;
		this.nomClient = nomClient;
		
	}
	
	public Voiture() {
		nbVoitures++;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public LocalDate getDateArrive() {
		return dateArrive;
	}
	public void setDateArrive(LocalDate dateArrive) {
		this.dateArrive = dateArrive;
	}
	public LocalDate getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}
	public int getCinClient() {
		return cinClient;
	}
	public void setCinClient(int cinClient) {
		this.cinClient = cinClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", immatriculation=" + immatriculation + ", modele=" + modele
				+ ", dateArrive=" + dateArrive + ", dateSortie=" + dateSortie + ", cinClient=" + cinClient
				+ ", nomClient=" + nomClient + "]";
	}
}
