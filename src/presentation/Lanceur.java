package presentation;

import java.util.Scanner;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fenetre fen = new Fenetre() ;

		// Local variable
		int swValue;
		Scanner sc = new Scanner(System.in);
		dessinerMenuPrincipal();
		swValue = sc.nextInt();

		switch (swValue) {
		case 1:
			dessinerSousMenu1() ;
			swValue = sc.nextInt();
			if (swValue == 3)
				dessinerMenuPrincipal();
			break;
		case 2:
			dessinerSousMenu2(); break;
		case 3:
			dessinerSousMenu3(); break;
		default:
			System.out.println("QUITTER"); break;
		}
	}

	public static void dessinerMenuPrincipal() {
		// AFFICHER LE MENU DE SELECTION DES OPTIONS
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|            OPTIONS:                                                  |");
		System.out.println("|                                 [1] CREER UN COMPTE                  |");
		System.out.println("|                                 [2] MODIFIER UN COMPTE               |");
		System.out.println("|                                 [3] SUPPRIMER UN COMPTE              |");
		System.out.println("|                                 [3] LISTER LES COMPTES               |");
		System.out.println("|                                 [5] QUITTER                          |");
		System.out.println("========================================================================");
	}
	
	public static void dessinerSousMenu1(){
		
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|            CREATION D'UN COMPTE:                                     |");
		System.out.println("|                                 [1] GERER LES COMPTES                |");
		System.out.println("|                                 [2] GERER LES PERSONNES              |");
		System.out.println("|                                 [3] REVENIR EN ARRIERE               |");
		System.out.println("========================================================================");
		
	}
	
    public static void dessinerSousMenu2(){
		
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|             MODFIER UN COMPTE:                                       |");
		System.out.println("|                                 [1] GERER LES COMPTES                |");
		System.out.println("|                                 [2] GERER LES PERSONNES              |");
		System.out.println("|                                 [3] REVENIR EN ARRIERE               |");
		System.out.println("========================================================================");
   }
    
    public static void dessinerSousMenu3(){
		
		System.out.println("========================================================================");
		System.out.println("|               MENU DE GESTION DE L'AGENCE BANCAIRE                   |");
		System.out.println("========================================================================");
		System.out.println("|                          SUPPRIMER UN COMPTE:                        |");
		System.out.println("|                                 [1] GERER LES COMPTES                |");
		System.out.println("|                                 [2] GERER LES PERSONNES              |");
		System.out.println("|                                 [3] REVENIR EN ARRIERE               |");
		System.out.println("========================================================================");
		
	}
}
