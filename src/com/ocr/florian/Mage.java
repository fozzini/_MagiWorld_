package com.ocr.florian;

import static java.lang.System.out;

public class Mage extends AbstractPersonnage {
    public Mage(int classe, int tab, int niveau, int force, int agilite, int intelligence) {
        super(classe, tab, niveau, force, agilite, intelligence);
    }
    //creation méthodes pour les attaques===================================================================================

    @Override
    public int attaqueBasique () {
        AbstractPersonnage.swap();
        out.println("Joueur" +a+ " utilise Boule de Feu et inflige " + getIntelligence() + " dommages.");
        out.println("Joueur" +b+ " perd " + getIntelligence() + " points de vie");

        return getIntelligence();
    }

    @Override
    public int attaqueSpeciale () {

        out.println("Joueur" +a+ " utilise Soin et regagne " + getIntelligence() * 2 + " points de vie.");
        setIntelligence(getIntelligence() * 2);

        return 0;
    }
}

