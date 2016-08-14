package fr.plopez.moteur;

/**
 * Created by pierre on 13/08/2016.
 */
public class MoteurElectrique extends Moteur {
    public MoteurElectrique(String cylindre, Double prix){
        super(TypeMoteur.ELECTRIQUE,cylindre, prix);
    }
}
