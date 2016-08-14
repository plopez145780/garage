package fr.plopez.option;

import java.io.Serializable;

/**
 * Interface Option, supertype pour les options de Vehicule
 * @author pierre
 */
public interface Option {
    /**
     * Permet de retourner le prix de l'option
     * @return prix de l'option
     */
    Double getPrix();

    /**
     * Cree et retourne une phrase avec les information de l'instance
     * @return la phrase constitue du nom de l'option et de son prix
     */
    String toString();
}
