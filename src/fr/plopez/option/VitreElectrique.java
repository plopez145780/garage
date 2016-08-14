package fr.plopez.option;

import java.io.Serializable;

/**
 * Classe permettant d'instancier des Option de type VitreElectrique, implementant Option
 * @author pierre
 */
public class VitreElectrique implements Option, Serializable {
    /**
     * Permet de retourner le prix de l'option Vitre electrique
     * @return prix de l'option Vitre electrique
     */
    public Double getPrix(){
        return 200.50;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (Vitre electrique) et de son prix
     */
    public String toString(){
        return "Vitre électrique (" + getPrix() + "€)";
    }
}
