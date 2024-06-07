package etudiante.soa.entite;

import etudiante.soa.entite.Affirmation;

public class Verite extends Affirmation {
    private boolean valeur;

    public Verite(String texte) {
        super(texte);
        this.valeur = true;
    }

    public boolean getValeur() {
        return valeur;
    }
}

