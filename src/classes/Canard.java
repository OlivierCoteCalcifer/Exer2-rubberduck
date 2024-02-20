package classes;

import java.util.concurrent.TimeUnit;

/**
 * Détails et génération d'un modèle 3D d'un canard en caoutchouc !
 *
 * @author Gabriel T. St-Hilaire
 */
public class Canard implements Cloneable {
    /**
     * Saut de ligne multiplateforme
     */
    static final String SAUT_LIGNE = System.lineSeparator();

    /**
     * Composants nécessaires pour construire un modèle 3D
     */
    private String tete;
    private String corps;
    private String ailes;
    private String habit;

    /**
     * Le modèle 3D généré à partir des composants
     */
    private String modele3D = "Le modèle doit être généré avant d'être utilisé ...";

    /**
     * TODO Pas très SOLID comme approche mais c'est pour simplifier l'exercice ... Devrait être encapsuler dans une classe.
     */
    public void genererPlan() {
        try {
            System.out.println("--- Début de la génération du modèle 3D ... ---");

            StringBuilder planBuilder = new StringBuilder();

            System.out.println("Génération de la tête ...");
            TimeUnit.SECONDS.sleep(1);
            planBuilder.append(tete);
            planBuilder.append(SAUT_LIGNE);

            System.out.println("Génération du corps ...");
            TimeUnit.SECONDS.sleep(1);
            planBuilder.append(corps);
            planBuilder.append(SAUT_LIGNE);

            System.out.println("Génération des ailes ...");
            TimeUnit.SECONDS.sleep(1);
            planBuilder.append(ailes);
            planBuilder.append(SAUT_LIGNE);

            System.out.println("Génération de l'habit ...");
            TimeUnit.SECONDS.sleep(1);
            planBuilder.append(habit);
            planBuilder.append(SAUT_LIGNE);

            modele3D = planBuilder.toString();

            System.out.println("--- Modèle 3D généré ! ---");

        } catch (InterruptedException e) {
            // Pas géré pour l'exercice
            e.printStackTrace();
        }
    }

    void setTete(String tete) {
        this.tete = tete;
    }

    void setCorps(String corps) {
        this.corps = corps;
    }

    void setAiles(String ailes) {
        this.ailes = ailes;
    }

    void setHabit(String habit) {
        this.habit = habit;
    }

    @Override
    public Canard clone() {
        Canard clone = null;

        try {
            clone = (Canard) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
