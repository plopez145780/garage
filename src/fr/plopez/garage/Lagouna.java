package fr.plopez.garage;

/**
 * Classe herite de Vehicule qui permet d'instancier des vehicules A330B
 * @author pierre
 */
public class Lagouna extends Vehicule {
    /**
     * Constructeur declarant le nom de modele du vehicule ainsi que la marque venant d'une enumeration en envoyant ces information au constructeur parent "Vehicule"
     */
    public Lagouna(){
        super("Lagouna",Marque.RENO);
    }
}
