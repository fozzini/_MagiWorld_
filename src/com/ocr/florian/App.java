package com.ocr.florian;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int intelligence;
    private static int agilite;
    

    public static void main(String[] args) {

        //création du Joueur1===========================================================================================
        System.out.println("Création du Personnage du Joueur1");
        AbstractPersonnage.builder();
        Guerrier player1 = new Guerrier(1,nom,niveau,vie,force,agilite,intelligence);

        //création du Joueur2===========================================================================================
        System.out.println("Création du Personnage du Joueur2");
        AbstractPersonnage.builder();
        Guerrier player2 = new Guerrier(2,nom,niveau,vie,force,agilite,intelligence);




        //début du jeu==================================================================================================

        while ((player1.getVie() >= 0) || player2.getVie() >= 0) {
            //player1.attaque();
            if (player2.getVie() <= 0) {
                System.out.println("Joueur 2 à perdu !");
                return;
            }
            //player2.attaque();

            if (player1.getVie() >= 0) {
                System.out.println("Joueur 1 à perdu !");
                return;

            }
        }
    }
}



