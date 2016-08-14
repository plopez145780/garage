package fr.plopez.moteur;

/**
 * Classe permettant d'instancier des Moteur de type MoteurEssence, heritant de Moteur
 * @author pierre
 */
public class MoteurEssence extends Moteur {
    /**
     * Constructeur de MoteurEssence, envoie les information au constructeur parent Moteur
     * @param cylindre Texte sur la cylindre
     * @param prix Prix du moteur
     */
    public MoteurEssence(String cylindre, Double prix){
        super(TypeMoteur.ESSENCE,cylindre, prix);
    }
}
