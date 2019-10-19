package com.ocr.florian;

import java.util.Scanner;

import static java.lang.System.out;

public class App {

    static Scanner sc = new Scanner(System.in);

//creation des attributs de class   ====================================================================================
    private static int i;
    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int agilite;
    private static int intelligence ;


    public static void main(String[] args) {

//création des instances du Joueur1 et 2  ==============================================================================

        Guerrier[] player = new Guerrier[3];

        for(i=1; i<3; i++){

            System.out.println("Création du Personnage du Joueur "+ i);
            builder();
            player[i] = new Guerrier(i,nom,niveau,vie,force,agilite,intelligence);
            System.out.println(player[i].talk());
        }

//reinitialisation de i et lancement du combat à l'aide d'une boucle while et for=======================================

        i = 1;
        while (player[i].getVie() > 0) {

            for(i = 1; i < 3; i++){
                out.println("Joueur"+i+ " " +player[i].getVie()+ " Vitalité Veuillez choisir votre action " +
                        "(1 : Attaque basique, 2 : Attaque spéciale)");
                int action = sc.nextInt();

                if(action == 1){
                    player[1].attaqueBasique();
                }
                else if (action == 2){
                    player[1].attaqueSpeciale();
                }
            }
            i = 1;
        }
        if (player[i].getVie() < 0) {
            System.out.println("Joueur"+i+" à perdu !");
            return;
        }
    }
//méthode d'aquisition des attributs de class  =========================================================================

    public static void  builder(){

        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        nom = sc.nextInt();
        System.out.println("Niveau du personnage ?");
        niveau = sc.nextInt();
        vie = niveau * 5;
        System.out.println("Force du personnage ?");
        force = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        agilite = sc.nextInt();
        System.out.println("Intelligence du personnage  ?");
        intelligence = sc.nextInt();
    }
}




