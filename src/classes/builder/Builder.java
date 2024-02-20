package classes.builder;

import classes.Canard;

/**
 * Interface permettaet une construction généralisée d'un rubber duck.
 *
 * @author Olivier Cotée
 * @author Benjamin Thériault
 */
public interface Builder {
    /**
     *
     */
    void reset();

    /**
     *
     */
    String getTypeCanard();

    /**
     *
     */
    void ajouterTete();

    /**
     *
     */
    void ajouterCorps();

    /**
     *
     */
    void ajouterAiles();

    /**
     *
     */
    void ajouterHabit();

    /**
     *
     */
    Canard getCanard();

}
