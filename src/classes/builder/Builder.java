package classes.builder;

import classes.Canard;

/**
 * Interface permettant une construction généralisée d'un rubber duck.
 *
 * @author Olivier Cotée
 * @author Benjamin Thériault
 */
public interface Builder {
    /**
     * Méthode pour reset le builder.
     */
    void reset();

    /**
     * Méthode pour retourner le type de canard.
     */
    String getTypeCanard();

    /**
     * Méthode pour ajouter la tête du canard.
     */
    void ajouterTete();

    /**
     * Méthode pour ajouter le corps du canard.
     */
    void ajouterCorps();

    /**
     * Méthode pour ajouter les ailes du canard.
     */
    void ajouterAiles();

    /**
     * Méthode pour ajouter l'habit du canard.
     */
    void ajouterHabit();

    /**
     * Méthode getter pour retourner le canard.
     */
    Canard getCanard();
}
