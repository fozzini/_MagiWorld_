package com.ocr.florian;

import static java.lang.System.out;

public class Guerrier extends AbstractPersonnage {


// création d'attributs d'instance =====================================================================================

    int i;
    int j;
    int nom;
    int niveau;
    int vie;
    int force;
    int agilite;
    int intelligence;

//creation des getters==================================================================================================

    public int getVie() {
        return vie;
    }


//creation des setters==================================================================================================

    public void setVie(int vie) {
        this.vie = vie;
    }

//creation du constructeur d'objet Guerrier=============================================================================

    Guerrier(int i, int j, int nom, int niveau, int vie, int force, int agilite, int intelligence) {
        this.i = i;
        this.j = j;
        this.nom = nom;
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

//creation méthode pour décrire le personnage ==========================================================================

    @Override
    public String toString() {
        String s = "Woarg je suis le Guerrier Joueur"+i+" niveau " + niveau + " je possède " + vie + " de vitalité, "
                + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence !";
        return s;
    }

//creation méthodes pour les attaques===================================================================================

    @Override
    int attaqueBasique () {

        out.println("Joueur" +i+ " utilise Coup d'Epée et inflige " + force + " dommages.");
        out.println("Joueur" +j+ " perd " + force + " points de vie");
        return force;
    }

    @Override
    int attaqueSpeciale () {

        out.println("Joueur" +i+ " utilise Coup de Rage et inflige " + force * 2 + " dommages.");
        out.println("Joueur" +j+" perd " + force * 2 + " points de vie");
        out.println("Joueur" +i+ " perd " + force / 2 + " points de vie");
        setVie(getVie()-force / 2);
        return (force * 2);
    }
}

