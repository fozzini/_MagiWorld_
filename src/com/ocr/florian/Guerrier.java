package com.ocr.florian;

import static java.lang.System.out;

public class Guerrier extends AbstractPersonnage {


    Guerrier(int classe, int tab, int niveau, int force, int agilite, int intelligence) {
       super(classe, tab, niveau, force, agilite, intelligence);
    }


//creation méthodes pour les attaques===================================================================================

    @Override
    public int attaqueBasique () {
        AbstractPersonnage.swap();
        out.println("Joueur" +a+ " utilise Coup d'Epée et inflige " + getForce() + " dommages.");
        out.println("Joueur" +b+ " perd " + getForce() + " points de vie");

        return getForce();
    }

    @Override
    public int attaqueSpeciale () {

        out.println("Joueur" +a+ " utilise Coup de Rage et inflige " + getForce() * 2 + " dommages.");
        out.println("Joueur" +b+" perd " + getForce() * 2 + " points de vie");
        out.println("Joueur" +a+ " perd " + getForce() / 2 + " points de vie");
        vie -= (getForce()/2);

        return (getForce() * 2);
    }
}

