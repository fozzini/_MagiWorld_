package com.ocr.florian;


public abstract class AbstractPersonnage {

    // création d'attributs d'instance =====================================================================================

    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;
    static int i = compteurI();
    static int j = compteurJ();


//creation des getters==================================================================================================

    public int getVie() {
        return vie;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    //creation des setters==================================================================================================

    public void setVie(int vie) {
        this.vie = vie;
    }

//creation du constructeur d'objet Guerrier=============================================================================

    AbstractPersonnage(int niveau, int force, int agilite, int intelligence) {

        this.niveau = niveau;
        this.vie = niveau*5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }
    static int compteurI(){
        int i = 0;
        i++;
        return i;
    }

    static int compteurJ(){
        int j = 2;
        for (j = 2 ; j > 0 ; j--);
        return j;
    }


    //creation méthode pour décrire le personnage ======================================================================

    public abstract String toString();

    //creation méthodes pour les attaques===============================================================================

    abstract int attaqueBasique ();

    abstract int attaqueSpeciale ();

}

