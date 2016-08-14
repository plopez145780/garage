package fr.plopez.moteur;

/**
 * Classe permettant d'instancier des Moteur de type MoteurDiesel, heritant de Moteur
 * @author pierre
 */
public class MoteurDiesel extends Moteur {
    /**
     * Constructeur de MoteurDiesel, envoie les information au constructeur parent Moteur
     * @param cylindre Texte sur la cylindre
     * @param prix Prix du moteur
     */
    public MoteurDiesel(String cylindre, Double prix){
        super(TypeMoteur.DIESEL,cylindre, prix);
    }
}
