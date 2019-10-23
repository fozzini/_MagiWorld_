package com.ocr.florian;


public abstract class AbstractPersonnage {

    //creation méthode pour décrire le personnage ======================================================================

    public String toString() {
        String s = "La citation du personnage";
        return s ;
    }
    //creation méthodes pour les attaques===============================================================================

    int attaqueBasique () {
        return 0;
    }

    int attaqueSpeciale () {
        return 0;
    }
    
}

