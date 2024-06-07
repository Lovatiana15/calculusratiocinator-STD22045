package etudiante.soa.logique;

import etudiante.soa.entite.Affirmation;
import etudiante.soa.entite.Mensonge;
import etudiante.soa.entite.Verite;

public class AffirmationAstatusExacte {
    public static String sans_discussion(Affirmation affirmation) {
        if (affirmation instanceof Verite) {
            return "C’est une vérité car tout le temps vrai";
        } else if (affirmation instanceof Mensonge) {
            return "C’est un mensonge car tout le temps faux";
        } else {
            return "C’est une affirmation car peut être vraie ou fausse";
        }
    }
}
