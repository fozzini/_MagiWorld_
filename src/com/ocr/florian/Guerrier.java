package com.ocr.florian;

import java.util.Scanner;

import static java.lang.System.out;

public class Guerrier {

    static Scanner sc = new Scanner(System.in);
    //creation attribut d'instance======================================================================================
    int i;
    int nom;
    int niveau;
    int vie;
    int force;
    int agilite;
    int intelligence;
    //creation des getters==============================================================================================

    public int getVie() {
        return vie;
    }

    public int getI() {
        return i;
    }
//creation du constructeur d'objet Guerrier=============================================================================

    Guerrier(int i, int nom, int niveau, int vie, int force, int agilite, int intelligence) {
        this.i = i;
        this.nom = nom;
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    public String talk () {
        String s = "Woarg je suis le Guerrier Joueur"+i+" niveau " + niveau + " je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence !";
        return s;

    }

    int attaqueBasique () {
            out.println("Joueur1 utilise Coup d'Epée et inflige " + force + " dommages.");
            out.println("Joueur 2 perd " + force + " points de vie");
            return force;

    }
    int attaqueSpeciale () {
        out.println("Joueur 1 utilise Coup de Rage et inflige " + force * 2 + " dommages.");
        out.println("Joueur 2 perd " + force * 2 + " points de vie");
        out.println("Joueur 1 perd " + force / 2 + " points de vie");
        return (force * 2);

    }
}

