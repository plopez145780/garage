package fr.plopez.option;

/**
 * Classe permettant d'instancier des Option de type GPS, implementant Option
 * @author pierre
 */
public class GPS implements Option {
    /**
     * Permet de retourner le prix de l'option GPS
     * @return prix de l'option GPS
     */
    public Double getPrix(){
        return 150.20;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (GPS) et de son prix
     */
    public String toString(){
        return "GPS (" + getPrix() + "€)";
    }
}
