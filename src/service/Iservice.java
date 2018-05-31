package service;

import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.Conseiller;



public interface Iservice {
	
	// ---------  CRUD Compte ---------
	
	public void creerCompte (Compte compte) ;
	public void lireCompte (Compte compte) ;
	public void modifierCompte (Compte compte) ;
	public void supprimerCompte (Compte compte);
	public List <Compte> listerComptes () ;
	public void crediterCompte (Compte compte, double montant) ;
	public void debiterCompte (Compte compte, double montant) ;
	public void ajouterTitulaire(Compte compte, Client client) ;
	
	// ---------  CRUD Client ---------
	
	public void creerClient (Client client) ;
	public void lireClient (Client client) ;
	public void modifierClient (Client client) ;
	public void supprimerClient (Client client) ;
	public void listerClients (List <Client> clients) ;
	public void attribuerCompte(Client client, Compte compte);
	public void attribuerConseiller(Client client, Conseiller conseiller) ;
	public void attribuerCarte(Client client, CarteBancaire carte) ;
	
	// ---------  CRUD CarteBancaire ---------
	
	public void creerCarte (CarteBancaire carte);
	public void lireCarteBancaire (CarteBancaire carte) ;
	public void modifierCarteBancaire (CarteBancaire carte) ;
	public void supprimerCarteBancaire (CarteBancaire carte) ;
	
	
	
	
	
	
	
	
	


}
