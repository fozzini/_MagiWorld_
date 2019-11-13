package com.ocr.florian;

import static java.lang.System.out;

public class Rodeur extends AbstractPersonnage {
    public Rodeur(int classe, int tab, int niveau, int force, int agilite, int intelligence) {
        super(classe, tab, niveau, force, agilite, intelligence);
    }
//creation méthodes pour les attaques===================================================================================

    @Override
    public int attaqueBasique () {
        AbstractPersonnage.swap();
        out.println("Joueur" +a+ " utilise Tir à l’Arc et inflige " + getAgilite() + " dommages.");
        out.println("Joueur" +b+ " perd " + getAgilite() + " points de vie");

        return getAgilite();
    }

    @Override
    public int attaqueSpeciale () {

        out.println("Joueur" +a+ " utilise Concentration et gagne " + getNiveau() / 2 + " en agilité.");
        setAgilite(getAgilite()+(getNiveau() / 2)) ;

        return 0;
    }
}

