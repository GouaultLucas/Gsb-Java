package gsb.tests;

import gsb.utils.sgdb;
import gsb.vue.Accueil;

public class AffichageVue 
{
    public static void main(String[] args) 
    {
        System.out.println("Bienvenue dans l'application GSB Java.");
        Accueil frame = new Accueil();
        System.out.println("-----------------------------------");
        // System.out.println("Test de connexion :");
        // System.out.println(sgdb.retournerString("SELECT VILLE FROM gsbv2.LOCALITE WHERE CODEPOSTAL = 75011"));
        //sgdb.utiliserSgdb("SELECT * FROM gsbv2.LOCALITE", true);
        // sgdb.utiliserSgdb("SELECT * FROM gsbv2.MEDECIN", true);
        // sgdb.utiliserSgdb("SELECT * FROM gsbv2.MEDICAMENT", true);
        // sgdb.utiliserSgdb("SELECT * FROM gsbv2.VISITE", true);
        // sgdb.utiliserSgdb("SELECT * FROM gsbv2.VISITEUR", true);
    }

}