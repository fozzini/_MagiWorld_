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

    public static String getNom() {
        if (nom==1){
            return Guerrier.talk();
        }
        else if(nom==2){
            return Rodeur.talk();
        }
        else if(nom==3){
            return Mage.talk();
        }
        return null;
    }
    public static int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public static String string() {
        return getNom()+"Joueur"+i+ " niveau " + niveau + " je possède " + vie + " de vitalité, " + force + " de force, "+ agilite +" d'agilité et "+ intelligence +" d'intelligence !";
    }

    public Player(int i,int nom, int niveau, int vie, int force, int agilite, int intelligence) {
       this.i=i;this.nom=nom;this.niveau=niveau;this.vie=vie;this.force=force;this.agilite=agilite;this.intelligence=intelligence;

    }
}
