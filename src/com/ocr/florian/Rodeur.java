package com.ocr.florian;

import static java.lang.System.out;

public class Rodeur extends AbstractPersonnage {
    public Rodeur(int niveau, int force, int agilite, int intelligence) {
        super("gnarf",niveau, force, agilite, intelligence);
    }
//creation méthodes pour les attaques===================================================================================

    @Override
    public int attaqueBasique () {

        out.println("Joueur" + (p1+1) + " utilise Tir à l’Arc et inflige " + getAgilite() + " dommages.");
        out.println("Joueur" + (p2+1) + " perd " + getAgilite() + " points de vie");

        return getAgilite();
    }

    @Override
    public int attaqueSpeciale () {

        out.println("Joueur" + (p1+1) + " utilise Concentration et gagne " + getNiveau() / 2 + " en agilité.");
        setAgilite(getAgilite()+(getNiveau() / 2)) ;

        return 0;
    }
}

