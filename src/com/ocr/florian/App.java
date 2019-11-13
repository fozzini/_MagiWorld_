package com.ocr.florian;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        AbstractPersonnage[] player = new AbstractPersonnage[2];

        for (int tab = 0; tab < 2; tab++) {
            System.out.println("Création du Personnage du Joueur " + (tab + 1));

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

            switch (classe) {
                case 1:
                    player[tab] = new Guerrier(classe, tab, niveau, force, agilite, intelligence);
                    //case 2 : player[i] = new Rodeur (niveau, force, agilite, intelligence);
                    //case 3 : player[i] = new Mage (niveau, force, agilite, intelligence);
            }
            System.out.println(player[tab].toString());
        }

        int a = 1;
        int b = 0;

        while (player[0].getVie() > 0 ){

            int tmp = a;
            a = b;
            b = tmp;

            int damage = player[a].fight();
            player[b].damage(damage);
        }
        System.out.println("player"+ a +" à perdu");

    }
}








