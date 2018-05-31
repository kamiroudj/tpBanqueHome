package service;

import java.util.ArrayList;
import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.Conseiller;

public class ServiceImpl implements Iservice {
	

	private List <Compte> comptes = new ArrayList <Compte> () ; 
	private List <Client> clients = new ArrayList <Client> () ;
	private List <Conseiller> conseillers = new ArrayList <Conseiller>() ;
	private List <CarteBancaire> cartes = new ArrayList <CarteBancaire> () ;
	
	//--------  Getters & Setters 
	
	/**
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	


	
	/**
	 * @return the conseillers
	 */
	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	/**
	 * @param conseillers the conseillers to set
	 */
	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

	/**
	 * @return the cartes
	 */
	public List<CarteBancaire> getCartes() {
		return cartes;
	}

	/**
	 * @param cartes the cartes to set
	 */
	public void setCartes(List<CarteBancaire> cartes) {
		this.cartes = cartes;
	}
	
	// ------------  Autres methodes -----------------


	@Override
	public void creerCompte(Compte compte) {
		// TODO Auto-generated method stub
		comptes.add(compte) ;
		 
		
	}

	

	@Override
	public Compte lireCompte(int idCompte) {
		// TODO Auto-generated method stub
		return comptes.get(idCompte) ;
		
	}

	@Override
	public void modifierCompte(Compte compte) {
		int index = compte.getIdCompte() ;
		comptes.set(index, compte);
	}

	@Override
	public void supprimerCompte(Compte compte) {
		// TODO Auto-generated method stub
		comptes.remove(compte) ;
	}

	@Override
	public List<Compte> listerComptes() {
		// TODO Auto-generated method stub
		return comptes;
	}

	@Override
	public void crediterCompte(Compte compte, double montant) {
		// TODO Auto-generated method stub
		double solde = compte.getSolde() ;
		compte.setSolde(solde + montant);
		
	}

	@Override
	public void debiterCompte(Compte compte, double montant) {
		// TODO Auto-generated method stub
		double solde = compte.getSolde();
		compte.setSolde(solde - montant);
		
	}

	@Override
	public void ajouterTitulaire(Compte compte, Client client) {
		// TODO Auto-generated method stub
		compte.setClient(client);
		client.getComptes().add(compte) ;
		
	}

	@Override
	public void creerClient(Client client) {

		// TODO Auto-generated method stub
		clients.add(client) ;
	}

	@Override
	public Client lireClient(int idClient) {
		// TODO Auto-generated method stub
		return clients.get(idClient) ;
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		clients.set(client.getIdClient(), client) ;
		
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		clients.remove(client) ;
		
	}

	@Override
	public List<Client> listerClients() {
		// TODO Auto-generated method stub
		return clients ; 
	}

	

	@Override
	public void attribuerConseiller(Client client, Conseiller conseiller) {
		// TODO Auto-generated method stub
		client.setConseiller(conseiller);
		conseiller.getClients().add(client) ;
	}

	@Override
	public void attribuerCarte(Client client, CarteBancaire carte) {
		// TODO Auto-generated method stub
		client.setCarte(carte);
		carte.setProprietaire(client);
		
	}

	@Override
	public void creerCarte(CarteBancaire carte) {
		// TODO Auto-generated method stub
		cartes.add(carte) ;
		
	}

	@Override
	public CarteBancaire lireCarteBancaire() {
		// TODO Auto-generated method stub
		return null ; 
		
	}

	@Override
	public void modifierCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub
		cartes.remove(carte) ;
		
	}

	@Override
	public void eliminerClientduSysteme(Client client) {
		// TODO Auto-generated method stub
		cartes.remove(client.getCarte()) ;
		comptes.removeAll(client.getComptes()) ;
		clients.remove(client) ;
		
	}

}
