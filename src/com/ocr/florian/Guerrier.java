package com.ocr.florian;

import static java.lang.System.out;

public class Guerrier extends AbstractPersonnage {
    int attaqueBasique;
    int attaqueSpéciale;
    String talk;

    public static String talk() {
        String s="Woarg je suis le Guerrier ";
        return s;
    }
    static void player1() {
        sc.reset();
        out.println("Joueur 1 (" + getJoueur1().get(3) + " Vitalité) Veuillez choisir votre action (1 : Attaque basique, 2 : Attaque spéciale)");
        Attaque = sc.nextInt();
        if (Attaque > 2) {
            out.println("Vous n'avez pas choisi votre action");
            player1();
        } else if (Attaque == 1) {
            out.println("Joueur 1 utilise Coup d'Epée et inflige " + getJoueur1().get(2) + " dommages.");
            getJoueur2().set(3, getJoueur2().get(3) - getJoueur1().get(2));
            out.println("Joueur 2 perd " + getJoueur1().get(2) + " points de vie");
            if (Setup.getJoueur2().get(3) < 1) {
                out.println("Joueur 2 est mort !");
                return;
            }
        } else if (Attaque == 2) {
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
