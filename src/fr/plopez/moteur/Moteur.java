package fr.plopez.moteur;

import java.io.Serializable;

/**
 * Class abstraite Moteur permet d'avoir des obet moteur a ajouté au vehicule
 * @author pierre
 */
public abstract class Moteur implements Serializable {
    /**
     * Variable d'instance contenant le type venant de l'enumeration
     */
    private TypeMoteur type;
    /**
     * Variable d'instance contenant un text sur la cylindre
     */
    private String cylindre;
    /**
     * Variable d'instance contenant le prix du moteur
     */
    private Double prix;

    /**
     * Constructeur
     * @param type moteur a essence, diesel ...
     * @param cylindre texte sur la cylindre
     * @param prix prix du moteur
     */
    public Moteur(TypeMoteur type, String cylindre, Double prix){
        this.type = type;
        this.cylindre = cylindre;
        this.prix = prix;
    }

    /**
     * Retourne le prix du moteur
     * @return prix
     */
    public Double getPrix(){
        return prix;
    }

    /**
     * Retourne un texte décrivant tous les attributs du moteur
     * @return phrase décrivant le moteur
     */
    public String toString() {
        return " Moteur " + type + " " + cylindre + " (" + prix + "€) ";
    }
}
