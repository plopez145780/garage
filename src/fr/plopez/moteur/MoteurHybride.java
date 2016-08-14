package fr.plopez.moteur;

/**
 * Classe permettant d'instancier des Moteur de type MoteurHybride, heritant de Moteur
 * @author pierre
 */
public class MoteurHybride extends Moteur {
    /**
     * Constructeur de MoteurHybride, envoie les information au constructeur parent Moteur
     * @param cylindre Texte sur la cylindre
     * @param prix Prix du moteur
     */
    public MoteurHybride(String cylindre, Double prix){
        super(TypeMoteur.HYBRIDE,cylindre, prix);
    }
}
