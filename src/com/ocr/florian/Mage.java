package com.ocr.florian;

import static java.lang.System.out;

public class Mage extends AbstractPersonnage {
    public Mage(int niveau, int force, int agilite, int intelligence) {
        super("Abracadabra",niveau, force, agilite, intelligence);
    }
    //creation méthodes pour les attaques===================================================================================

    @Override
    public int attaqueBasique () {

        out.println("Joueur" + (p1+1) + " utilise Boule de Feu et inflige " + getIntelligence() + " dommages.");
        out.println("Joueur" + (p2+1) + " perd " + getIntelligence() + " points de vie");

        return getIntelligence();
    }

    @Override
    public int attaqueSpeciale () {

        out.println("Joueur" + (p1+1) + " utilise Soin et regagne " + getIntelligence() * 2 + " points de vie.");
        vie += (getIntelligence() * 2);

        return 0;
    }
}

