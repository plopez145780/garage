package fr.plopez.moteur;

/**
 * Created by pierre on 13/08/2016.
 */
public class MoteurDiesel extends Moteur {
    public MoteurDiesel(String cylindre, Double prix){
        super(TypeMoteur.DIESEL,cylindre, prix);
    }
}
