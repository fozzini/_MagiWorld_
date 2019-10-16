package com.ocr.florian;

import java.util.Scanner;

import static java.lang.System.out;

public class Guerrier {

    static Scanner sc = new Scanner(System.in);

    String talk;


    public static String talk () {
        String s = "Woarg je suis le Guerrier Joueur"+Player.getJ()+" niveau " + Player.getNiveau() + " je possède " + Player.getVie() + " de vitalité, " + Player.getForce() + " de force, " + Player.getAgilite() + " d'agilité et " + Player.getIntelligence() + " d'intelligence !";
        return s;

    }

    static int attaqueBasique () {
            out.println("Joueur1 utilise Coup d'Epée et inflige " + Player.getForce() + " dommages.");
            out.println("Joueur 2 perd " + Player.getForce() + " points de vie");
            return Player.getForce();

    }
    static int attaqueSpeciale () {
        out.println("Joueur 1 utilise Coup de Rage et inflige " + Player.getForce() * 2 + " dommages.");
        out.println("Joueur 2 perd " + Player.getForce() * 2 + " points de vie");
        out.println("Joueur 1 perd " + Player.getForce() / 2 + " points de vie");
        return (Player.getForce() * 2);

    }
}

