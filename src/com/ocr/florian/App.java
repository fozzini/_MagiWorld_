package com.ocr.florian;

import java.util.Scanner;

import static com.ocr.florian.AbstractPersonnage.*;
import static com.ocr.florian.AbstractPersonnage.i;
import static java.lang.System.out;

public class App {

    static Scanner sc = new Scanner(System.in);

    static AbstractPersonnage[] player = new AbstractPersonnage[2];



    public static void main(String[] args) {
        creator();
        creator();
        fight();
    }

    static AbstractPersonnage creator(){

            System.out.println("Création du Personnage du Joueur " + i);
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            int nom = sc.nextInt();
            System.out.println("Niveau du personnage ?");
            int niveau = sc.nextInt();
            System.out.println("Force du personnage ?");
            int force = sc.nextInt();
            System.out.println("Agilité du personnage ?");
            int agilite = sc.nextInt();
            System.out.println("Intelligence du personnage  ?");
            int intelligence = sc.nextInt();
            switch (nom) {
                case 1:
                    System.out.println(player[i].toString());
                    return player[i] = new Guerrier(niveau, force, agilite, intelligence);
            }

        return null;
    }
    static void fight(){

        while (player[i].getVie() > 0);{

            out.println("Joueur"+i+ " " +player[i].getVie()+ " Vitalité Veuillez choisir votre action " +
                    "(1 : Attaque basique, 2 : Attaque spéciale)");
            int action = sc.nextInt();
            switch (action){
                case 1 :
                    player[j].setVie(player[j].getVie()-player[i].attaqueBasique());
                case 2 :
                    player[j].setVie(player[j].getVie()-player[i].attaqueSpeciale());
            }
        }
        System.out.println("Joueur"+i+" à perdu !");
    }


}








