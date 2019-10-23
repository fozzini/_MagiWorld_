package com.ocr.florian;

import java.util.Scanner;

import static java.lang.System.out;

public class App {

    static Scanner sc = new Scanner(System.in);

//creation des attributs de class   ====================================================================================

    private static int i;
    private static int j;
    private static int nom;
    private static int niveau;
    private static int vie;
    private static int force;
    private static int agilite;
    private static int intelligence ;

    static Guerrier[] player = new Guerrier[3];

    public static void main(String[] args) {

    //création des instances du Joueur1 et 2  ==========================================================================


        j = 2;
        for(i=1; i<3; i++){

            System.out.println("Création du Personnage du Joueur "+ i);
            builder();
            player[i] = new Guerrier(i,j,nom,niveau,vie,force,agilite,intelligence);
            System.out.println(player[i].toString());
            j = 1;
        }

    //lancement du combat à l'aide d'une boucle while et for, paramétrage i et j========================================

        i = 1;
        j = 2;
        while (player[i].getVie() > 0) {
            for (i = 1; i < 3; i++){
                out.println("Joueur"+i+ " " +player[i].getVie()+ " Vitalité Veuillez choisir votre action " +
                        "(1 : Attaque basique, 2 : Attaque spéciale)");
                int action = sc.nextInt();
                if(action == 1){
                    player[j].setVie(player[j].getVie()-player[i].attaqueBasique());
                }
                else if (action == 2){
                    player[j].setVie(player[j].getVie()-player[i].attaqueSpeciale());
                }
                j = 1;
            }
            i = 1;
            j = 2;
        }
        if (player[i].getVie() < 0) {
            System.out.println("Joueur"+i+" à perdu !");
        }
    }

    //méthode d'aquisition des attributs de class  =========================================================================

    static void  builder(){

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





