package com.ocr.florian;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AbstractPersonnage[] player = new AbstractPersonnage[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Création du Personnage du Joueur " + i);
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            int classe = sc.nextInt();
            System.out.println("Niveau du personnage ?");
            int niveau = sc.nextInt();
            System.out.println("Force du personnage ?");
            int force = sc.nextInt();
            System.out.println("Agilité du personnage ?");
            int agilite = sc.nextInt();
            System.out.println("Intelligence du personnage  ?");
            int intelligence = sc.nextInt();
            switch(classe){
                case 1 : player[i] = new Guerrier(niveau, force, agilite, intelligence);
                //case 2 : player[i] = new Rodeur (niveau, force, agilite, intelligence);
                //case 3 : player[i] = new Mage (niveau, force, agilite, intelligence);
            }
            System.out.println(player[i].toString());
        }
        do {
            player[0].fight(player[1]);
            player[1].fight(player[0]);
        }
        while(player[0].getVie() > 0 && player[1].getVie() > 0);
    }
}








