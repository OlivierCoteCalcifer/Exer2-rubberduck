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
     *  Méthode permettant l'exécution du programme.
     *
     * @param args
     */
    public static void main(String[] args) {
        //Tentative de concevoir un canard rouge.
        System.out.println("TEST - Création d'un canard en caoutchouc rouge");
        // Pour la section qui retourne le nombre de canard en cache
        // et le message si le prototype est existant.
        // On va pop les messages par une fonction par le gestionnaire de protpotype.
        Directeur directeur = new Directeur();
        Builder canardRougeBuilder= new CanardRougeBuilder();
        directeur.setBuilder(canardRougeBuilder);
        directeur.creerCanard();
        Canard canardRouge1 = canardRougeBuilder.getCanard();

        System.out.println("TEST - Création d'un canard en caoutchouc rouge");
        directeur.creerCanard();
    }
}