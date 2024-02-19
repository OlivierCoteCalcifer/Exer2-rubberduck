package classes.builder;

import classes.Canard;

/**
 * Permet la création d'un canard bleu.
 *
 * @author Olivier Côté
 *
 */
public class CanardBleuBuilder implements Builder{

    private Canard canardBleu;

    public CanardBleuBuilder() {
        reset();
    }

    @Override
    public void reset() {
        canardBleu = new Canard();
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
