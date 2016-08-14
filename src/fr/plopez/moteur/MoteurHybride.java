package fr.plopez.moteur;

/**
 * Created by pierre on 13/08/2016.
 */
public class MoteurHybride extends Moteur {
    public MoteurHybride(String cylindre, Double prix){
        super(TypeMoteur.HYBRIDE,cylindre, prix);
    }
}
