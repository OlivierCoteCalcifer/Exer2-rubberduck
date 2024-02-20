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
     *
     */
    private Canard canardRouge;

    /**
     *
     */
    public CanardRougeBuilder() {
        reset();
    }

    /**
     *
     */
    @Override
    public void reset() {
        canardRouge = new Canard();
    }

    /**
     *
     */
    @Override
    public String getTypeCanard() {
        return "ROUGE";
    }

    /**
     *
     */
    @Override
    public void ajouterTete() {

    }

    /**
     *
     */
    @Override
    public void ajouterCorps() {

    }

    /**
     *
     */
    @Override
    public void ajouterAiles() {

    }

    /**
     *
     */
    @Override
    public void ajouterHabit() {

    }

    /**
     * @return Canard
     */
    @Override
    public Canard getCanard() {
        Canard canard = this.canardRouge;
        this.reset();
        return canard;
    }
}
