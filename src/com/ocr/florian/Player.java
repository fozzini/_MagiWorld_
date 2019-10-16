package com.ocr.florian;


import java.util.Scanner;

import static java.lang.System.out;

public class Player {
    static Scanner sc = new Scanner(System.in);

    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int agilite;
    private static int intelligence;
    private static int j;



    void setNom(int nom) {
        Player.nom = nom;
    }

    void setNiveau(int niveau) {
        Player.niveau = niveau;
    }

    void setVie(int vie) {
        Player.vie = vie;
    }

    void setForce(int force) {
        Player.force = force;
    }

    void setAgilite(int agilite) {
        Player.agilite = agilite;
    }

    void setIntelligence(int intelligence) {
        Player.intelligence = intelligence;
    }

    public static int getJ() {
        return j;
    }

    static int getNiveau() {
        return niveau;
    }

    static int getForce() {
        return force;
    }

    public static int getAgilite() {
        return agilite;
    }

    public static int getIntelligence() {
        return intelligence;
    }

    private static int getNom() {
        return nom;
    }

    static int getVie() {
        return vie;
    }


    Player(int j,int nom, int niveau, int vie, int force, int agilite, int intelligence) {
        Player.j = j;
        Player.nom = nom;
        Player.niveau = niveau;
        Player.vie = vie;
        Player.force = force;
        Player.agilite = agilite;
        Player.intelligence = intelligence;


    }
    public String citation() {
        if (getNom() == 1) {
        }
        return Guerrier.talk();


    }
    public void damage(int damage){
        Player.vie -= damage;

    }
    public static void attaque() {
        out.println("Joueur"+Player.getJ()  + Player.getVie() + " Vitalité Veuillez choisir votre action (1 : Attaque basique, 2 : Attaque spéciale)");
        int action = sc.nextInt();
        if(action==1){
            //Player.sw(Player.attaqueBasique());
        }
        else if(action==2){
            //Player.sw.attaqueSpeciale ()}
        }
    }

    public static void sw() {
        switch (Player.getNom()) {
            case 1:
                if (Player.getNom() == 1) ;
                //Guerrier.attaque();
                break;
            case 2:
                if (Player.getNom() == 1) ;
                //Rodeur.attaque();
                break;
            case 3:
                if (Player.getNom() == 1) ;
                //Mage.attaque();
                break;
        }
    }
}


