package com.ocr.florian;

import static java.lang.System.out;

public class Guerrier {

    private static int j;
    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int agilite;
    private static int intelligence;

    public static int getVie() {
        return vie;
    }

    Guerrier(int j, int nom, int niveau, int vie, int force, int agilite, int intelligence) {
        this.j = j;
        Guerrier.nom = nom;
        Guerrier.niveau = niveau;
        Guerrier.vie = vie;
        Guerrier.force = force;
        Guerrier.agilite = agilite;
        Guerrier.intelligence = intelligence;
    }

    public static String talk () {
        String s = "Woarg je suis le Guerrier Joueur"+j+" niveau " + niveau + " je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence !";
        return s;

    }

    static int attaqueBasique () {
            out.println("Joueur1 utilise Coup d'Epée et inflige " + force + " dommages.");
            out.println("Joueur 2 perd " + force + " points de vie");
            return force;

    }
    static int attaqueSpeciale () {
        out.println("Joueur 1 utilise Coup de Rage et inflige " + force * 2 + " dommages.");
        out.println("Joueur 2 perd " + force * 2 + " points de vie");
        out.println("Joueur 1 perd " + force / 2 + " points de vie");
        return (force * 2);

    }
}

