package classes.director;

import classes.Canard;
import classes.builder.Builder;
import registreCanard.SingletonRegistreCanard;

/**
 * Cette classe est le directeur pour la construction d'un canard.
 *
 * @author Olivier Côté
 * @author Benjamin Theriault
 */
public class Directeur {
    /**
     * Cette propriété représente le builder que le directeur doit gérer.
     */
    private Builder builder;
    /**
     * Cette propriété est un singleton pour le registre des modèles de canards.
     */
    private final SingletonRegistreCanard registreCanard = SingletonRegistreCanard.getInstance();

    /**
     * Méthode setter pour attribuer le builder au champ.
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * Cette méthode enclenche le processus en suivant les étapes précises pour
     * la conception d'un modèle de canard.
     *
     * @return Canard On retourne un canard créé par le builder.
     */
    public Canard creerCanard() {
        registreCanard.getCount();
        if (registreCanard.prototypeExiste(this.builder)) {
            return registreCanard.getParTypeCanard(this.builder);
        }
        builder.reset();
        builder.ajouterTete();
        builder.ajouterCorps();
        builder.ajouterAiles();
        builder.ajouterHabit();
        builder.getCanard().genererPlan();
        registreCanard.ajouterPrototype(builder.getTypeCanard(), builder.getCanard());
        return builder.getCanard();
    }
}
