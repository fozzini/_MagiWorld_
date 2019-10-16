package com.ocr.florian;

import java.util.Scanner;

public class Createur {

    static Scanner sc = new Scanner(System.in);

    public static Player createur(){
        System.out.println("Niveau du personnage ?");
        int niveau = sc.nextInt();
        int vie = niveau * 5;
        System.out.println("Force du personnage ?");
        int force = sc.nextInt();
        System.out.println("Agilité du personnage ?");
        int agilite = sc.nextInt();
        System.out.println("Intelligence du personnage  ?");
        int intelligence = sc.nextInt();
        return null;

    }

}
