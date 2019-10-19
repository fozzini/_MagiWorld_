package com.ocr.florian;

import java.util.Scanner;

import static java.lang.System.out;

public abstract class AbstractPersonnage {

    static Scanner sc = new Scanner(System.in);


    private static int vie;



    //public String citation() {
        //if (nom == 1) {
        //}
        //return Guerrier.talk();
    //}

    public void damage(int damage){
        vie -= damage;
    }


    //public static void sw() {
        //switch (nom) {
           // case 1:
                //if (nom == 1) ;
                //Guerrier.attaque();
                //break;
            //case 2:
                //if (nom == 1) ;
                //Rodeur.attaque();
                //break;
            //case 3:
                //if (nom == 1) ;
                //Mage.attaque();
                //break;
}

