package com.ocr.florian;

import static java.lang.System.out;

public class Guerrier extends AbstractPersonnage {


    Guerrier(int niveau, int force, int agilite, int intelligence) {
       super("Woarg",niveau, force, agilite, intelligence);
    }


//creation méthodes pour les attaques===================================================================================

    @Override
    public int attaqueBasique () {

        out.println("Joueur" + (p1+1) + " utilise Coup d'Epée et inflige " + getForce() + " dommages.");
        out.println("Joueur" + (p2+1) + " perd " + getForce() + " points de vie");

        return getForce();
    }

    @Override
    public int attaqueSpeciale () {

        out.println("Joueur" + (p1+1) + " utilise Coup de Rage et inflige " + getForce() * 2 + " dommages.");
        out.println("Joueur" + (p2+1) +" perd " + getForce() * 2 + " points de vie");
        out.println("Joueur" + (p1+1) + " perd " + getForce() / 2 + " points de vie");
        vie -= (getForce()/2);

        return (getForce() * 2);
    }
}

