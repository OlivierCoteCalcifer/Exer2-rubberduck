package classes.director;

import classes.Canard;
import classes.builder.Builder;
/**
 * Cette classe est le directeur pour la construction d'un canard.
 *
 * @author Olivier Côté
 * @author Benjamin Theriault
 */
public class Directeur {
    Builder builder;
    public void setBuilder(Builder builder){
        this.builder = builder;
    }
    public void creerCanard(){

        builder.reset();
        builder.ajouterTete();
        builder.ajouterCorps();
        builder.ajouterAiles();
        builder.ajouterHabit();
        Canard c = builder.getCanard();
        c.genererPlan();
    }

}
