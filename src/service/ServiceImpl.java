package service;

import java.util.ArrayList;
import java.util.List;

import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;

public class ServiceImpl implements Iservice {

	private List<Compte> comptes = new ArrayList<Compte>();
	private List<Client> clients = new ArrayList<Client>();
	private List<Conseiller> conseillers = new ArrayList<Conseiller>();
	private List<CarteBancaire> cartes = new ArrayList<CarteBancaire>();

	// ------------ methodes CRUD-----------------

	@Override
	public void creerCompte(Compte compte) {

		comptes.add(compte);
	}

	@Override
	public Compte lireCompte(int idCompte) {

		return comptes.get(idCompte);

	}

	@Override
	public void modifierCompte(Compte compte) {
		int index = compte.getIdCompte();
		comptes.set(index, compte);
	}

	@Override
	public void supprimerCompte(Compte compte) {

		comptes.remove(compte);
	}

	@Override
	public List<Compte> listerComptes() {

		return comptes;
	}

	@Override
	public void creerClient(Client client) {

		clients.add(client);
	}

	@Override
	public Client lireClient(int idClient) {
		return clients.get(idClient);
	}

	@Override
	public void modifierClient(Client client) {
		clients.set(client.getIdClient(), client);

	}

	@Override
	public void supprimerClient(Client client) {
		clients.remove(client);

	}

	@Override
	public List<Client> listerClients() {
		return clients;
	}

	@Override
	public void creerCarte(CarteBancaire carte) {
		cartes.add(carte);
	}

	@Override
	public CarteBancaire lireCarteBancaire() {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public void modifierCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerCarteBancaire(CarteBancaire carte) {
		cartes.remove(carte);

	}

	/**************************************
	 * Fonctionnalités métiers
	 ************************************************************/

	@Override
	public void crediterCompte(Compte compte, double montant) {

		double solde = compte.getSolde();
		compte.setSolde(solde + montant);

	}

	@Override
	public void debiterCompte(Compte compte, double montant) {

		double solde = compte.getSolde();
		compte.setSolde(solde - montant);

	}

	@Override
	public void ajouterTitulaire(Compte compte, Client client) {

		compte.setClient(client);
		client.getComptes().add(compte);

	}

	@Override
	public void attribuerConseiller(Client client, Conseiller conseiller) {
		client.setConseiller(conseiller);
		conseiller.getClients().add(client);
	}

	@Override
	public void attribuerCarte(Client client, CarteBancaire carte) {
		client.setCarte(carte);
		carte.setProprietaire(client);

	}

	@Override
	public void eliminerClientduSysteme(Client client) {
		cartes.remove(client.getCarte());
		comptes.removeAll(client.getComptes());
		clients.remove(client);
	}

	@Override
	public void effectuerVirement(Compte compteDebiteur, Compte compteCrediteur, double montant) {
		double soldeD = compteDebiteur.getSolde();
		double soldeC = compteCrediteur.getSolde();

		if (compteDebiteur instanceof CompteEpargne) {

			if (montant <= soldeD) {

				compteDebiteur.setSolde(soldeD - montant);
				compteCrediteur.setSolde(soldeC + montant);
			}
		} else {
			
			double decouvert = ((CompteCourant)compteDebiteur).getDecouvert();
			
			if (montant <= soldeD + decouvert) {
				compteDebiteur.setSolde(soldeD - montant);
				compteCrediteur.setSolde(soldeC + montant);
			}
			
		}

	}
	
	@Override
	public void effectuerVirement(Compte compteDebiteur, double montant) {
		double soldeD = compteDebiteur.getSolde();
		if (compteDebiteur instanceof CompteEpargne) {

			if (montant <= soldeD) {

				compteDebiteur.setSolde(soldeD - montant);
			}
		} else {
			
			double decouvert = ((CompteCourant)compteDebiteur).getDecouvert();
			
			if (montant <= soldeD + decouvert) {
				compteDebiteur.setSolde(soldeD - montant);
			}
			
		}

	}

}
