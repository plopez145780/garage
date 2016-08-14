package fr.plopez.option;

/**
 * Classe permettant d'instancier des Option de type BarreDeToit, implementant Option
 * @author pierre
 */
public class BarreDeToit implements Option {
    /**
     * Permet de retourner le prix de l'option barre de toit
     * @return prix de l'option barre de toit
     */
    public Double getPrix(){
        return 105.10;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (barre de toit) et de son prix
     */
    public String toString(){
        return "Barre de toit (" + getPrix() + "€)";
    }
}
