package fr.plopez.option;

/**
 * Classe permettant d'instancier des Option de type Climatisation, implementant Option
 * @author pierre
 */
public class Climatisation implements Option {
    /**
     * Permet de retourner le prix de l'option climatisation
     * @return prix de l'option climatisation
     */
    public Double getPrix(){
        return 160.77;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (climatisation) et de son prix
     */
    public String toString(){
        return "Climatisation (" + getPrix() + "€)";
    }
}
