package com.ocr.florian;


import java.util.Scanner;

import static java.lang.System.out;

public abstract class AbstractPersonnage {

    static Scanner sc = new Scanner(System.in);


    // attributs d'instance.

    private int niveau;
    protected int vie;
    protected int vieDepart;
    private int force;
    private int agilite;
    private int intelligence;
    private String cri;
    protected static int p1 = 1;
    protected static int p2 = 0;



    // constructeur.

    AbstractPersonnage(String cri, int niveau, int force, int agilite, int intelligence) {
        this.cri = cri;
        this.niveau = niveau;
        this.vie = niveau * 5;
        this.vieDepart = niveau * 5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    // Getters.

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public static int getP1() {
        return p1;
    }

    public static int getP2() {
        return p2;
    }
    //Setters

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }


    // Méthode pour décrire le personnage.

    public String toString() {
        permuter();
        String s = cri + " je suis le " + this.getClass().getSimpleName() + " Joueur" + (p1+1) + " niveau " + niveau +
                " je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et "
                + intelligence + " d'intelligence !";
        return s;
    }

    // Méthode pour permuter le personnage 1 et le personnage 2.

    public static void permuter(){
        int tmp = p2;
        p2 = p1;
        p1 = tmp;
    }

    // Méthode qui organise le combat.


    public int fight(AbstractPersonnage[] players) {

        out.println("Joueur" + (p1+1) + " " + vie + " Vitalité Veuillez choisir votre action " +
                "(1 : Attaque basique, 2 : Attaque spéciale)");
        int attaque = sc.nextInt();
        if ((attaque == 1)) {
            return players[p2].vie -= players[p1].attaqueBasique();
        } else if ((attaque == 2)) {
            return players[p2].vie -= players[p1].attaqueSpeciale();
        }else this.fight(players);
        return 0;
    }


    // Méthodes abstraites qui définissent les attaques.

    public abstract int attaqueBasique();

    public abstract int attaqueSpeciale();

}



