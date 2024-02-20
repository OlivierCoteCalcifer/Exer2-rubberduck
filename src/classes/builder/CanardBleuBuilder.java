package classes.builder;

import classes.Canard;

/**
 * Cette classe est le builder pour un canard bleu.
 *
 * @author Olivier Côté
 * @author Benjamin Thériault
 */
public class CanardBleuBuilder implements Builder {

    /**
     * Instance de canard bleu.
     */
    private Canard canardBleu;

    /**
     * Permet de construire un canard bleu.
     */
    public CanardBleuBuilder() {
        reset();
    }

    /**
     * Permet de réinitialiser un canard bleu.
     */
    @Override
    public void reset() {
        canardBleu = new Canard();
    }

    /**
     * Permet de récupérer le type du canard.
     *
     * @return type de canard.
     */
    @Override
    public String getTypeCanard() {
        return "BLEU";
    }

    /**
     * Permet d'ajouter la tete du canard.
     */
    @Override
    public void ajouterTete() {
    }

    /**
     * Permet d'ajouter le corps du canard.
     */
    @Override
    public void ajouterCorps() {

    }

    /**
     * Permet d'ajouter les ailes du canard.
     */
    @Override
    public void ajouterAiles() {

    }

    /**
     * Permet d'ajouter l'habit du canard.
     */
    @Override
    public void ajouterHabit() {

    }

    /**
     * Permet de récupérer le canard bleu.
     *
     * @return canard bleu.
     */
    @Override
    public Canard getCanard() {
        Canard canard = this.canardBleu;
        this.reset();
        return canard;
    }
}
