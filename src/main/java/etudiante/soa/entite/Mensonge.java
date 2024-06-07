package etudiante.soa.entite;

import etudiante.soa.entite.Affirmation;

public class Mensonge extends Affirmation {
    private boolean valeur;

    public Mensonge(String texte) {
        super(texte);
        this.valeur = false;
    }

    public boolean getValeur() {
        return valeur;
    }
}

