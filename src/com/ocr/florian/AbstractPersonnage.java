package com.ocr.florian;


import java.util.Scanner;

import static java.lang.System.out;

public abstract class AbstractPersonnage {

    static Scanner sc = new Scanner(System.in);

    // attributs d'instance.

    private int niveau;
    protected int vie;
    private int force;
    private int agilite;
    private int intelligence;
    private int tab;
    private int classe;

    // attributs de classe.

    static int a = 2;
    static int b = 1;

    // constructeur.

    AbstractPersonnage(int classe, int tab, int niveau, int force, int agilite, int intelligence) {
        this.classe = classe;
        this.tab = tab;
        this.niveau = niveau;
        this.vie = niveau*5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    // Getters.

    public int getVie() {
        return vie;
    }

    public String getClasse() {
        if (classe == 1){
            return "Woarg";
        }
        else if (classe == 2){
            return "Gnarff";
        }
        else {
            return "Abracadabra";
        }
    }

    public int getForce() {
        return force;
    }

    public int getTab() {
        return tab;
    }

    // Méthode pour décrire le personnage.

    public String toString() {
        String s = getClasse()+" je suis le "+this.getClass().getSimpleName()+" Joueur"+ (tab+1) +" niveau " + niveau +
                " je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !";
        return s;
    }

    // Méthode pour permuter.

    public static void swap(){

        int tmp = a;
        a = b;
        b = tmp;
    }

    // Méthode qui organise le combat.

    public int fight() {

        out.println("Joueur" + (getTab()+1) + " " + getVie() + " Vitalité Veuillez choisir votre action " +
                "(1 : Attaque basique, 2 : Attaque spéciale)");
        if ((sc.nextInt() == 1)) {
            return attaqueBasique();
        } else {
            return attaqueSpeciale();
        }
    }

    // Méthode qui soustrait les dommages.

    public void damage(int damage) {
        vie -= damage;
    }

    // Méthodes abstraites qui définissent les attaques.

    public abstract int attaqueBasique();

    public abstract int attaqueSpeciale();
}

