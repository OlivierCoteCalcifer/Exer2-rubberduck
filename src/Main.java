import classes.Canard;
import classes.builder.Builder;
import classes.builder.CanardBleuBuilder;
import classes.builder.CanardRougeBuilder;
import classes.director.Directeur;

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
     * @param args Aucun input
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
        Canard cBleu1 = directeur.creerCanard();


        System.out.println("\nTEST - Création d'un canard en caoutchouc rouge");
        directeur.setBuilder(canardRougeBuilder);
        Canard cRouge3 = directeur.creerCanard();


        System.out.println("\nTEST - Création d'un canard en caoutchouc bleu");
        directeur.setBuilder(canardBleuBuilder);
        Canard cBleu2 = directeur.creerCanard();

    }
}