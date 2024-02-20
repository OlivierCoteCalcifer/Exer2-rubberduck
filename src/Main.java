import classes.Canard;
import classes.builder.Builder;
import classes.builder.CanardBleuBuilder;
import classes.builder.CanardRougeBuilder;
import classes.director.Directeur;
import registreCanard.SingletonRegistreCanard;

/**
 * Classe main.
 *
 * @author Olivier Côté
 * @author Benjamin Theriault
 */
public class Main {
    /**
     * Méthode permettant l'exécution du programme.
     *
     * @param args
     */
    public static void main(String[] args) {
        Builder canardRougeBuilder = new CanardRougeBuilder();
        Builder canardBleuBuilder = new CanardBleuBuilder();
        Directeur directeur = new Directeur();

        System.out.println("\nTEST - Création d'un canard en caoutchouc rouge");
        directeur.setBuilder(canardRougeBuilder);
        Canard cRouge1 = directeur.creerCanard();

        System.out.println("\nTEST - Création d'un canard en caoutchouc rouge");
        Canard cRouge2 = directeur.creerCanard();


        System.out.println("\nTEST - Création d'un canard en caoutchouc bleu");
        directeur.setBuilder(canardBleuBuilder);
        Canard b1 = directeur.creerCanard();


        System.out.println("\nTEST - Création d'un canard en caoutchouc rouge");
        directeur.setBuilder(canardRougeBuilder);
        Canard cRouge3 = directeur.creerCanard();


        System.out.println("\nTEST - Création d'un canard en caoutchouc bleu");
        directeur.setBuilder(canardBleuBuilder);
        Canard b2 = directeur.creerCanard();

        System.out.println(cRouge1 + "\n" + cRouge2 + "\n" + b1 + "\n" + cRouge3 + "\n" + b2);
        System.out.println(SingletonRegistreCanard.getInstance());
    }
}