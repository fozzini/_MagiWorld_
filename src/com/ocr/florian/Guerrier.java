package com.ocr.florian;

import static com.ocr.florian.Player.*;
import static com.ocr.florian.Player.getVie;
import static java.lang.System.out;

public class Guerrier extends AbstractPersonnage {
    int attaqueBasique;
    int attaqueSpéciale;
    String talk;

    public static String talk() {
        String s="Woarg je suis le Guerrier ";
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
        out.println("Joueur 1 utilise Coup de Rage et inflige " + getJoueur1().get(2) * 2 + " dommages.");
        getJoueur2().set(3, getJoueur2().get(3) - (getJoueur1().get(2) * 2));
        out.println("Joueur 2 perd " + getJoueur1().get(2) * 2 + " points de vie");
        if (Setup.getJoueur2().get(3) < 1) {
            System.out.println("Joueur 2 est mort !");
            getJoueur1().set(3, getJoueur1().get(3) - (getJoueur1().get(2) / 2));
            out.println("Joueur 1 perd " + getJoueur1().get(2) / 2 + " points de vie");
            return;
        }
        getJoueur1().set(3, getJoueur1().get(3) - (getJoueur1().get(2) / 2));
        out.println("Joueur 1 perd " + getJoueur1().get(2) / 2 + " points de vie");
    }
}
