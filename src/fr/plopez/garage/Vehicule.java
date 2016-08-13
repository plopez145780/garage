package fr.plopez.garage;

import java.util.List;

/**
 * Created by pierre on 13/08/2016.
 */
public class Vehicule implements Option{
    private Double prix;
    private String nom;
    private List<Option> options;
    private Marque nomMarque;

    public Double getPrix() {
        return prix;
    }
    public List<Option> getOptions() {
        return options;
    }
    public Marque getMarque() {
        return nomMarque;
    }

    public void addOption(Option opt){
        options.add(opt);
    }
    //TODO Ajouter les autres attributs de la voiture dans toString quand ils existeront
    public String toString(){
        return "+ voiture " + nom + " : " + nomMarque;
    }
}
