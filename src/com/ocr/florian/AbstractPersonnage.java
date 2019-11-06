package com.ocr.florian;


import java.util.Scanner;

import static java.lang.System.out;

public abstract class AbstractPersonnage {
    static Scanner sc = new Scanner(System.in);
    // création d'attributs d'instance =====================================================================================

    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;
    private int i;



//creation des getters==================================================================================================

    public int getVie() {
        return vie;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getI() {return i;}

    //creation des setters==================================================================================================

    public int setVie(int vie) {
        this.vie = vie;
        return vie;
    }

//creation du constructeur d'objet Guerrier=============================================================================

    AbstractPersonnage(int niveau, int force, int agilite, int intelligence) {

        this.i = i;
        this.niveau = niveau;
        this.vie = niveau*5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }


    //creation méthode pour décrire le personnage ======================================================================

    public abstract String toString();

    //creation méthodes pour les attaques===============================================================================

    abstract int attaqueBasique ();

    abstract int attaqueSpeciale ();

    void fight(AbstractPersonnage abstractPersonnage){

        out.println("Joueur"+i+ " " + vie + " Vitalité Veuillez choisir votre action " +
                "(1 : Attaque basique, 2 : Attaque spéciale)");
        int action = sc.nextInt();
        switch (action){
            case 1 :
                attaqueBasique();
                break;
            case 2 :
                attaqueSpeciale();
                break;
        }
    }
}

