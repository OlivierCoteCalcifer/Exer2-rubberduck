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
     *
     */
    Builder builder;
    /**
     *
     */
    SingletonRegistreCanard registreCanard = SingletonRegistreCanard.getInstance();

    /**
     *
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     *
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
        Canard c = builder.getCanard();
        c.genererPlan();
        registreCanard.ajouterPrototype(builder.getTypeCanard(), c);
        return c;
    }

}
