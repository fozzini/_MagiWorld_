package com.ocr.florian;

import static com.ocr.florian.Player.*;
import static com.ocr.florian.Player.getVie;
import static java.lang.System.out;

public class Guerrier {
    int attaqueBasique;
    int attaqueSpéciale;
    String talk;

    public static String talk() {
        String s="Woarg je suis le Guerrier Joueur"+getI()+ " niveau " + getNiveau() + " je possède " + getVie() + " de vitalité, " + getForce() + " de force, "+ getAgilite() +" d'agilité et "+ getIntelligence() +" d'intelligence !";;
        return s;
    }
    public void attaque(){
        out.println("Joueur" + getI() + "(" + Player.getVie() + " Vitalité) Veuillez choisir votre action (1 : Attaque basique, 2 : Attaque spéciale)");
    }
    static void attaqueBasique(int vie) {
        out.println("Joueur1 utilise Coup d'Epée et inflige " + getForce() + " dommages.");
        setVie(getVie()-getForce());
        out.println("Joueur 2 perd " + getForce() + " points de vie");
        if (getVie() < 1) {
            out.println("Joueur 2 est mort !");
            return;
        }
    }
    static void attaqueSpeciale(){
        out.println("Joueur 1 utilise Coup de Rage et inflige " + getForce() * 2 + " dommages.");
        setVie(getVie()-(getForce()*2));
        out.println("Joueur 2 perd " + getForce() * 2 + " points de vie");
        if (getVie() < 1) {
            System.out.println("Joueur 2 est mort !");
            setVie(getVie()-(getForce()/2));
            out.println("Joueur 1 perd " + getForce() / 2 + " points de vie");
            return;
        }
        setVie(getVie()-(getForce()/2));
        out.println("Joueur 1 perd " + getForce() / 2 + " points de vie");
    }
}
