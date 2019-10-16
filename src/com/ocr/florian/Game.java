package com.ocr.florian;

import java.util.Scanner;

public class Game {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //création du Joueur1===========================================================================================

        Player player1 = new Player(1, 0, 0, 0, 0, 0, 0);

        System.out.println("Création du Personnage du Joueur" + Player.getJ());
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        player1.setNom(sc.nextInt());
        System.out.println("Niveau du personnage ?");
        player1.setNiveau(sc.nextInt());
        player1.setVie(Player.getNiveau() * 5);
        System.out.println("Force du personnage ?");
        player1.setForce(sc.nextInt());
        System.out.println("Agilité du personnage ?");
        player1.setAgilite(sc.nextInt());
        System.out.println("Intelligence du personnage  ?");
        player1.setIntelligence(sc.nextInt());
        System.out.println(player1.citation());

        //création du Joueur2===========================================================================================

        Player player2 = new Player(2, 0, 0, 0, 0, 0, 0);

        System.out.println("Création du Personnage du Joueur" + Player.getJ());
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        player2.setNom(sc.nextInt());
        System.out.println("Niveau du personnage ?");
        player2.setNiveau(sc.nextInt());
        player2.setVie(Player.getNiveau() * 5);
        System.out.println("Force du personnage ?");
        player2.setForce(sc.nextInt());
        System.out.println("Agilité du personnage ?");
        player2.setAgilite(sc.nextInt());
        System.out.println("Intelligence du personnage  ?");
        player2.setIntelligence(sc.nextInt());
        System.out.println(player2.citation());

        //début du jeu==================================================================================================

        while ((player1.getVie() >= 0) || player2.getVie() >= 0) {
            player1.attaque();
            if (player2.getVie() <= 0) {
                System.out.println("Joueur 2 à perdu !");
                return;
            }
            player2.attaque();

            if (player1.getVie() >= 0) {
                System.out.println("Joueur 1 à perdu !");
                return;

            }
        }
    }
}



