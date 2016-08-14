package fr.plopez.option;

/**
 * Classe permettant d'instancier des Option de type SiegeChauffant, implementant Option
 * @author pierre
 */
public class SiegeChauffant implements Option {
    /**
     * Permet de retourner le prix de l'option Siege Chauffant
     * @return prix de l'option Siege Chauffant
     */
    public Double getPrix(){
        return 280.00;
    }

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option (Siege chauffant) et de son prix
     */
    public String toString(){
        return "Siège chauffant (" + getPrix() + "€)";
    }
}
