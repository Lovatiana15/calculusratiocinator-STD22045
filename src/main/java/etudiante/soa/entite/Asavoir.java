package etudiante.soa.entite;

public class Asavoir extends Affirmation {
    private boolean valeur;
    public Asavoir(String texte, boolean valeur) {
        super(texte);
        this.valeur = valeur;
    }
    public boolean getValeur() {
        return valeur;
    }
}

