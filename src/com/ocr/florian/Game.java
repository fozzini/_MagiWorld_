package com.ocr.florian;

import java.util.Scanner;


public class Game {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int nom = 0;int niveau = 0;int vie = 0;int force = 0;int agilite = 0;int intelligence = 0;
        AbstractPersonnage AbstractPersonnage = new AbstractPersonnage();
        AbstractPersonnage Guerrier = new AbstractPersonnage();
        AbstractPersonnage Rodeur = new AbstractPersonnage();
        AbstractPersonnage Mage = new AbstractPersonnage();
        System.out.println("Création du Personnage du Joueur1");
        scanner();
        Player player1 = new Player(nom, niveau, vie, force, agilite, intelligence);
        System.out.println(Player.citation());
        System.out.println("Création du Personnage du Joueur2");
        scanner();
        Player player2 = new Player(nom, niveau, vie, force, agilite, intelligence);
        System.out.println(Player.citation());
    }


    public static void scanner(){
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        int nom = sc.nextInt(3);
        System.out.println("Niveau du personnage ?");
        int niveau = sc.nextInt(100);
        int vie = niveau * 5;
        System.out.println("Force du personnage ?");
        int force = sc.nextInt(100);
        System.out.println("Agilité du personnage ?");
        int agilite = sc.nextInt(100);
        System.out.println("Intelligence du personnage  ?");
        int intelligence = sc.nextInt(100);
    }
}


