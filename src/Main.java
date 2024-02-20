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

        /*
        // On affiche dans la console que les modèles sont tous des objets différents
        // grâce au clonage.
        System.out.println("Adresse différente pour chaque modèle:\n"
                            + "cRouge1 " + cRouge1+ "\n"
                            + "cRouge2 " + cRouge2+ "\n"
                            + "cRouge3 " + cRouge3+ "\n"
                            + "cBleu1 " + cBleu1 + "\n"
                            + "cBleu2 " + cBleu2 + "\n" );
        */

    }
}