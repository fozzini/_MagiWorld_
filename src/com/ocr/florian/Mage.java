package com.ocr.florian;

import static java.lang.System.out;

public class Mage extends AbstractPersonnage {
    int attaqueBasique;
    int attaqueSpéciale;

    public static String talk() {
        String s ="Abracadabra je suis le Mage ";
        return s;
    }
    static void player1() {
        sc.reset();
        out.println("Joueur1 (" + Setup.getJoueur1().get(3) + " Vitalité) Veuillez choisir votre action (1 : Attaque basique, 2 : Attaque spéciale)");
        Attaque = sc.nextInt();
        if (Attaque > 2) {
            out.println("Vous n'avez pas choisi votre action");
            player1();
        } else if (Attaque == 1) {
            System.out.println("Joueur 1 utilise Boule de Feu et inflige " + Setup.getJoueur1().get(0) + " dommages.");
            getJoueur2().set(3, getJoueur2().get(3) - getJoueur1().get(0));
            out.println("Joueur 2 perd " + Setup.getJoueur1().get(0) + " points de vie");
            if(Setup.getJoueur2().get(3)<=0){
                System.out.println("Joueur 2 est mort !");
                return;
            }
        } else if (Attaque == 2) {
            System.out.println("Joueur 1 utilise Soin et gagne " +getJoueur1().get(0) * 2+ " en Vitalité.");
            getJoueur1().set(3, getJoueur1().get(3) + getJoueur1().get(0) * 2);
            if (getJoueur1().get(3) > getJoueur1().get(5)) {
                getJoueur1().set(3, getJoueur1().get(5));
            }

        }
    }
}
