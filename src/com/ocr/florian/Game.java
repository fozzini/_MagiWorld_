package com.ocr.florian;

import java.util.Scanner;
public class Game {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AbstractPersonnage AbstractPersonnage = new AbstractPersonnage();
        AbstractPersonnage Guerrier = new AbstractPersonnage();
        AbstractPersonnage Rodeur = new AbstractPersonnage();
        AbstractPersonnage Mage = new AbstractPersonnage();
        for (int i = 1; i < 3; i++) {
            System.out.println("Création du Personnage du Joueur" + i);
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            int nom = sc.nextInt();
            System.out.println("Niveau du personnage ?");
            int niveau = sc.nextInt();
            int vie = niveau * 5;
            System.out.println("Force du personnage ?");
            int force = sc.nextInt();
            System.out.println("Agilité du personnage ?");
            int agilite = sc.nextInt();
            System.out.println("Intelligence du personnage  ?");
            int intelligence = sc.nextInt();
            if (i ==1) {
                Player player1 = new Player(i,nom, niveau, vie, force, agilite, intelligence);
                System.out.println(Player.string());
            }
            else if (i == 2) {
                Player player2 = new Player(i,nom, niveau, vie, force, agilite, intelligence);
                System.out.println(Player.string());
            }
        }
    }
}


