package etudiante.soa.logique;

import etudiante.soa.entite.Affirmation;
import etudiante.soa.entite.Mensonge;
import etudiante.soa.entite.Verite;

public class AppliquerConjonction {
    public static void appliquer(Affirmation affirmation1, Affirmation affirmation2, String conjonction) {
        boolean resultat = false;
        if (conjonction.equalsIgnoreCase("et")) {
            if (affirmation1 instanceof Verite && affirmation2 instanceof Verite) {
                resultat = ((Verite) affirmation1).getValeur() && ((Verite) affirmation2).getValeur();
                if (resultat) {
                    System.out.println("C'est vrai");
                } else {
                    System.out.println("C'est faux");
                }
            } else if ((affirmation1 instanceof Verite && affirmation2 instanceof Mensonge) ||
                    (affirmation1 instanceof Mensonge && affirmation2 instanceof Verite)) {
                System.out.println("C'est faux");
            }else {
                System.out.println("Je ne sais pas");
            }
        } else if (conjonction.equalsIgnoreCase("ou")) {
            if (affirmation1 instanceof Verite || affirmation2 instanceof Verite) {
                resultat = ((Verite) affirmation1).getValeur() || ((Verite) affirmation2).getValeur();
                if (resultat) {
                    System.out.println("C'est vrai");
                } else {
                    System.out.println("C'est faux");
                }
            }
        } else if (conjonction.equalsIgnoreCase("donc")) {
            if ((affirmation1 instanceof Verite && affirmation2 instanceof Mensonge) ||
                    (affirmation1 instanceof Verite && affirmation2 instanceof Verite)) {
                System.out.println("C'est faux");
            } else {
                System.out.println("C'est faux");
            }
        }
    }
}



