package fr.plopez.garage;

import fr.plopez.option.Option;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pierre on 13/08/2016.
 */
public abstract class Vehicule {
    private Double prix;
    private String nom;
    private List<Option> options = new ArrayList<>();
    private Marque nomMarque;


    public Vehicule(Double prix, String nom, Marque marque){
        this.prix = prix;
        this.nom = nom;
        this.nomMarque = marque;
    }


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
