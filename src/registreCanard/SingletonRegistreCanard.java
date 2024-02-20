package registreCanard;

import classes.Canard;
import classes.builder.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Cette classe est le singleton pour le registre des canards.
 *
 * @author Olivier Côté
 * @author Benjamin Theriault
 */
public final class SingletonRegistreCanard {

    /**
     * Instance du Singleton pour le registre de canard
     */
    private static SingletonRegistreCanard instance = null;

    /**
     * Liste permettant le stockage de données.
     */
    private final Map<String, Canard> prototypes = new HashMap<>();

    /**
     * Constructeur privé du registre.
     */
    private SingletonRegistreCanard() {

    }

    /**
     * Cette méthode retourne l'instance du registre.
     */
    public static SingletonRegistreCanard getInstance() {
        if (instance == null) {
            instance = new SingletonRegistreCanard();
        }
        return instance;
    }

    /**
     * Cette methode affiche le nombre de canards dans le registre.
     */
    public void getCount() {
        System.out.println(this.prototypes.size() + " canard(s) en cache");
    }

    /**
     * Cette méthode retourne le canard dans le registre
     *
     * @return Canard
     */
    public Canard getParTypeCanard(Builder builder) {
        System.out.println("Prototype récupéré en cache : " + builder.getTypeCanard());
        return prototypes.get(builder.getTypeCanard()).clone();
    }

    /**
     * Cette méthode vérrifie si le modèle existe dans le registre.
     *
     * @return boolean
     */
    public boolean prototypeExiste(Builder builder) {
        if (!prototypes.containsKey(builder.getTypeCanard())) {
            System.out.println("Prototype non existant. Création du prototype : " + builder.getTypeCanard());
            return false;
        }
        return true;
    }

    /**
     * Cette méthode ajout un modèle au registre.
     */
    public void ajouterPrototype(String type, Canard prototype) {
        System.out.println("Ajout du prototype en cache : " + type);
        prototypes.put(type, prototype);
    }
}
