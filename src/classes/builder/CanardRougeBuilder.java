package classes.builder;

import classes.Canard;

/**
 * Cette classe est le builder pour un canard rouge.
 *
 * @author Olivier Côté
 * @author Benjamin Theriault
 */
public class CanardRougeBuilder implements Builder {

    /**
     * Instance de canard rouge.
     */
    private Canard canardRouge;

    /**
     *  Permet la construction d'un canard bleu.
     */
    public CanardRougeBuilder() {
        reset();
    }

    /**
     * Permet la réinitialisation d'un canard rouge.
     */
    @Override
    public void reset() {
        canardRouge = new Canard();
    }

    /**
     * Permet de récupérer le type du canard.
     *
     * @return le type de canard.
     */
    @Override
    public String getTypeCanard() {
        return "ROUGE";
    }

    /**
     * Permet d'ajouter la tête du canard.
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
     * Permet de récupérer le canard rouge.
     *
     * @return Canard camard rouge.
     */
    @Override
    public Canard getCanard() {
        Canard canard = this.canardRouge;
        this.reset();
        return canard;
    }
}
