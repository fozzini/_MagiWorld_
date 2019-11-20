package com.ocr.florian;

import java.util.Scanner;

import static com.ocr.florian.AbstractPersonnage.getP1;
import static com.ocr.florian.AbstractPersonnage.getP2;


public class App {

    static Scanner sc = new Scanner(System.in);

    static int tableaux = 2;
    static int i ;


    static AbstractPersonnage[] players = new AbstractPersonnage[tableaux];


    public static void main(String[] args) {

        //Création des personnages.

        for (i = 0; i < 2; i++) {
        createurDePersonnages();
        System.out.println(players[i].toString());
        }

        //Combat.

        do {
            AbstractPersonnage.permuter();
            players[getP1()].fight(players);
        }
        while (players[getP2()].vie> 0);
        System.out.println("player"+ (getP2()+1) +" à perdu");
    }

        //Méthode qui retourne un personnage.

    static AbstractPersonnage createurDePersonnages(){

        int playerName;
        int niveau;
        int force;
        int agilite;
        int intelligence;

        System.out.println("Création du Personnage du Joueur " + (i + 1));


        do{
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            playerName = sc.nextInt();
        }
        while (playerName < 1 | playerName > 3 );

        do {
            System.out.println("Niveau du personnage ?");
            niveau = sc.nextInt();

            System.out.println("Force du personnage ?");
            force = sc.nextInt();

            System.out.println("Agilité du personnage ?");
            agilite = sc.nextInt();

            System.out.println("Intelligence du personnage  ?");
            intelligence = sc.nextInt();

        }while ((force|agilite|intelligence) < 0|(force|agilite|intelligence) > 100|force + agilite + intelligence != niveau);

        switch (playerName) {
            case 1:
                players[i] = new Guerrier(niveau,force,agilite,intelligence);
                    break;
            case 2:
                players[i] = new Rodeur(niveau,force,agilite,intelligence);
                    break;
            case 3:
                players[i] =new Mage(niveau,force,agilite,intelligence);
                    break;
        }

        return players[i];
    }
}









