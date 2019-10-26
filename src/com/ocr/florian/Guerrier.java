package com.ocr.florian;

import static java.lang.System.out;

public class Guerrier extends AbstractPersonnage {


    Guerrier(int niveau, int force, int agilite, int intelligence) {
       super(niveau, force, agilite, intelligence);
    }



//creation méthode pour décrire le personnage ==========================================================================

    @Override
    public String toString() {
        String s = "Woarg je suis le Guerrier Joueur"+i+" niveau " + getNiveau() + " je possède " + getVie() + " de vitalité, "
                + getForce() + " de force, " + getAgilite() + " d'agilité et " + getIntelligence() + " d'intelligence !";
        return s;
    }

//creation méthodes pour les attaques===================================================================================

    @Override
    int attaqueBasique () {

        out.println("Joueur" +i+ " utilise Coup d'Epée et inflige " + getForce() + " dommages.");
        out.println("Joueur" +j+ " perd " + getForce() + " points de vie");
        return getForce();
    }

    @Override
    int attaqueSpeciale () {

        out.println("Joueur" +i+ " utilise Coup de Rage et inflige " + getForce() * 2 + " dommages.");
        out.println("Joueur" +j+" perd " + getForce() * 2 + " points de vie");
        out.println("Joueur" +i+ " perd " + getForce() / 2 + " points de vie");
        setVie(getVie()-getForce() / 2);
        return (getForce() * 2);
    }
}

