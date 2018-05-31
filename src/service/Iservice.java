package service;

import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.Conseiller;


public interface Iservice {
	
	// ---------  CRUD Compte ---------
	
	public void creerCompte (Compte compte) ;
	public Compte lireCompte (int idCompte) ;
	public void modifierCompte (Compte compte) ;
	public void supprimerCompte (Compte compte);
	public List <Compte> listerComptes () ;
	public void crediterCompte (Compte compte, double montant) ;
	public void debiterCompte (Compte compte, double montant) ;
	public void ajouterTitulaire(Compte compte, Client client) ;
	
	// ---------  CRUD Client ---------
	
	public void creerClient (Client client) ;
	public Client lireClient (int idClient) ;
	public void modifierClient (Client client) ;
	public void supprimerClient (Client client) ;
	public List<Client> listerClients () ;
	public void attribuerConseiller(Client client, Conseiller conseiller) ;
	public void attribuerCarte(Client client, CarteBancaire carte) ;
	
	// ---------  CRUD CarteBancaire ---------
	
	public void creerCarte (CarteBancaire carte);
	public CarteBancaire lireCarteBancaire () ;
	public void modifierCarteBancaire (CarteBancaire carte) ;
	public void supprimerCarteBancaire (CarteBancaire carte) ;
	
	public void eliminerClientduSysteme(Client client) ;
	
	
	
	
	
	
	
	
	

}
