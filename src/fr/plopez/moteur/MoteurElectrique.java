package fr.plopez.moteur;

/**
 * Classe permettant d'instancier des Moteur de type MoteurElectrique, heritant de Moteur
 * @author pierre
 */
public class MoteurElectrique extends Moteur {
    /**
     * Constructeur de MoteurElectrique, envoie les information au constructeur parent Moteur
     * @param cylindre Texte sur la cylindre
     * @param prix Prix du moteur
     */
    public MoteurElectrique(String cylindre, Double prix){
        super(TypeMoteur.ELECTRIQUE,cylindre, prix);
    }
}
