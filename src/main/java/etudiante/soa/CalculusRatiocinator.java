package etudiante.soa;
import etudiante.soa.entite.Asavoir;
import etudiante.soa.entite.Mensonge;
import etudiante.soa.entite.Verite;
import etudiante.soa.logique.AppliquerConjonction;

public class CalculusRatiocinator {
    public static void main(String[] args) {
        Verite verite_1 = new Verite("Lou est beau");
        Mensonge mensonge_1 = new Mensonge("Lou est pauvre");
        Asavoir affirmation_1 = new Asavoir("Lou est généreux", true);

        System.out.println("Lou est pauvre et Lou est généreux :");
        AppliquerConjonction.appliquer(verite_1, affirmation_1, "et");
    }
}
