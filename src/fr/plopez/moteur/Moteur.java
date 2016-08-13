package fr.plopez.moteur;

/**
 * Created by pierre on 13/08/2016.
 */
public class Moteur {
    private TypeMoteur type;
    private String cylindre;
    private Double prix;

    public Moteur(String cylindre, Double prix){
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public Double getPrix(){
        return prix;
    }

    public String toString() {
        return "Moteur{" +
                "type=" + type +
                ", cylindre='" + cylindre + '\'' +
                ", prix=" + prix +
                '}';
    }
}
