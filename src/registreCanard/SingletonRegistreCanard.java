package registreCanard;

import classes.Canard;
import classes.builder.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Cette classe est le singleton pour le registre des canard.
 *
 * @author Olivier Côté
 * @author Benjamin Theriault
 */
public class SingletonRegistreCanard {
    /**
     *
     */
    private static SingletonRegistreCanard instance;
    /**
     *
     */
    private final Map<String, Canard> prototypes = new HashMap<>();

    /**
     *
     */
    private SingletonRegistreCanard() {
    }

    /**
     *
     */
    public static SingletonRegistreCanard getInstance() {
        if (instance == null) {
            instance = new SingletonRegistreCanard();
        }
        return instance;
    }

    /**
     *
     */
    public void getCount() {
        System.out.println(this.prototypes.size() + " canard(s) en cache");
    }

    /**
     *
     */
    public Canard getParTypeCanard(Builder builder) {
        System.out.println("Prototype récupéré en cache : " + builder.getTypeCanard());
        return prototypes.get(builder.getTypeCanard()).clone();
    }

    /**
     *
     */
    public boolean prototypeExiste(Builder builder) {
        if (!prototypes.containsKey(builder.getTypeCanard())) {
            System.out.println("Prototype non existant. Création du prototype : " + builder.getTypeCanard());
            return false;
        }
        return true;
    }


    /**
     *
     */
    public void ajouterPrototype(String type, Canard prototype) {
        System.out.println("Ajout du prototype en cache : " + type);
        prototypes.put(type, prototype);
    }
}
