package com.ocr.florian;


public abstract class AbstractPersonnage {

    //creation méthode pour décrire le personnage ======================================================================

    public abstract String toString();

    //creation méthodes pour les attaques===============================================================================

    abstract int attaqueBasique ();

    abstract int attaqueSpeciale ();

}

