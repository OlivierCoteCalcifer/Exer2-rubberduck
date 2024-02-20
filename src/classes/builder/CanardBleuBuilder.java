package classes.builder;

import classes.Canard;

/**
 * Cette classe est le builder pour un canard bleu.
 *
 * @author Olivier Côté
 * @author Benjamin Thériault
 */
public class CanardBleuBuilder implements Builder{

    /**
     *
     */
    private Canard canardBleu;

    /**
     *
     */
    public CanardBleuBuilder() {
        reset();
    }

    /**
     *
     */
    @Override
    public void reset() {
        canardBleu = new Canard();
    }

    /**
     *
     * @return String typeCanard
     */
    @Override
    public String getTypeCanard() {
        return "BLEU";
    }

    @Override
    public void ajouterTete() {

    }

    @Override
    public void ajouterCorps() {

    }

    @Override
    public void ajouterAiles() {

    }

    @Override
    public void ajouterHabit() {

    }

    @Override
    public Canard getCanard() {
        Canard canard = this.canardBleu;
        this.reset();
        return canard;
    }
}
