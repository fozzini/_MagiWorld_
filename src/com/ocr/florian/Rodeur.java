package com.ocr.florian;

import static java.lang.System.out;

public class Rodeur extends AbstractPersonnage {
    int attaqueBasique;
    int attaqueSpéciale;
    String talk;

    public static String talk() {
        String s= "Gnarf je suis le Rôdeur";
        return s;
    }
    static void player1() {
        sc.reset();
        out.println("Joueur 1 (" + Setup.getJoueur1().get(3) + " Vitalité) Veuillez choisir votre action (1 : Attaque basique, 2 : Attaque spéciale)");
        Attaque = sc.nextInt();
        if (Attaque > 2) {
            out.println("Vous n'avez pas choisi votre action");
            player1();
        }
        else if (Attaque == 1)
        {
            out.println("Joueur 1 utilise Tir à l’Arc et inflige " + getJoueur1().get(1) + " dommages.");
            getJoueur2().set(3, getJoueur2().get(3) - getJoueur1().get(1));
            out.println("Joueur 2 perd " + getJoueur1().get(1) + " points de vie");
            if (Setup.getJoueur2().get(3) <= 0) {
                out.println("Joueur 2 est mort !");
                return;
            }
        }
        else if (Attaque == 2) {
            System.out.println("Joueur 1 utilise Concentration et gagne " + getJoueur1().get(4) / 2 + " en agilité.");
            getJoueur1().set(1, getJoueur1().get(1) + (getJoueur1().get(4) / 2));
        }
    }
}
