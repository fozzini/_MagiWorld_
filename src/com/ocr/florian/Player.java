package com.ocr.florian;

import java.util.Scanner;

public class Player {

    static Scanner sc = new Scanner(System.in);



    private static int i;
    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int agilite;
    private static int intelligence;
    public static int getNiveau() {
        return niveau;
    }
    public static int getI() {
        return i;
    }
    public static int getAgilite() {
        return agilite;
    }

    public static int getIntelligence() {
        return intelligence;
    }

    public static int getNom() {
        return nom;
    }

    public static int getVie() {
        return vie;
    }

    public static void setVie(int vie) {
        Player.vie = vie;
    }

    public static int getForce() {
        return force;
    }
    public Player(int i,int nom, int niveau, int vie, int force, int agilite, int intelligence) {
       this.i=i;this.nom=nom;this.niveau=niveau;this.vie=vie;this.force=force;this.agilite=agilite;this.intelligence=intelligence;

    }
    public void fight() {
        while (getVie() >= 0) {

            if (Player.vie <= 0)  {
                System.out.println("Joueur 1 à perdu !");
                return;
            } else if (Player.vie <= 0)  {
                System.out.println("Joueur 2 à perdu !");
                return;
            }
        }
    }
    public static String citation () {
        if (nom == 1) {
        }
        return Guerrier.talk();
    }
    public static String perso() {
        if (Player.getNom() == 1) {
            return "Guerrier";
        }
        return null;
    }

}


