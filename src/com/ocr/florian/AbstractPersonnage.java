package com.ocr.florian;

import java.util.Scanner;

import static java.lang.System.out;

public abstract class AbstractPersonnage {

    static Scanner sc = new Scanner(System.in);

    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int agilite;
    private static int intelligence;
    private static int j;




    AbstractPersonnage(int j,int nom, int niveau, int vie, int force, int agilite, int intelligence) {
        AbstractPersonnage.j = j;
        AbstractPersonnage.nom = nom;
        AbstractPersonnage.niveau = niveau;
        AbstractPersonnage.vie = vie;
        AbstractPersonnage.force = force;
        AbstractPersonnage.agilite = agilite;
        AbstractPersonnage.intelligence = intelligence;


    }
    public String citation() {
        if (nom == 1) {
        }
        return Guerrier.talk();


    }
    public abstract void attaqueBasique();
    public abstract void attaqueSpeciale();
    public void damage(int damage){
        vie -= damage;

    }
    public static void attaque() {
        out.println("Joueur"+j+ vie + " Vitalité Veuillez choisir votre action (1 : Attaque basique, 2 : Attaque spéciale)");
        int action = sc.nextInt();
        if(action==1){
            //Player.sw(Player.attaqueBasique());
        }
        else if(action==2){
            //Player.sw.attaqueSpeciale ()}
        }
    }

    public static void sw() {
        switch (nom) {
            case 1:
                if (nom == 1) ;
                //Guerrier.attaque();
                break;
            case 2:
                if (nom == 1) ;
                //Rodeur.attaque();
                break;
            case 3:
                if (nom == 1) ;
                //Mage.attaque();
                break;
        }
    }
    public static void builder(){
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        int nom = sc.nextInt();
        System.out.println("Niveau du personnage ?");
        int niveau = sc.nextInt();
        int vie = niveau * 5;
        System.out.println("Force du personnage ?");
        int force = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        int agilite = sc.nextInt();
        System.out.println("Intelligence du personnage  ?");
        int intelligence = sc.nextInt();
    }
}