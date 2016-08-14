package fr.plopez.garage;

import fr.plopez.option.Option;
import fr.plopez.moteur.Moteur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pierre on 13/08/2016.
 */
public abstract class Vehicule {
    private Double prix;
    private String nom;
    private List<Option> options;
    private Marque nomMarque;
    private Moteur moteur;


    public Vehicule(String nom, Marque marque){
        this.prix = 0.0;
        this.nom = nom;
        List<Option> options = new ArrayList<>();
        this.nomMarque = marque;
        this.moteur = null;
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

    public void setMoteur(Moteur moteur){
        this.moteur = moteur;
    }

    public void addOption(Option opt){
        options.add(opt);
    }

    //TODO Ajouter les autres attributs de la voiture dans toString quand ils existeront
    public String toString(){
        return "+ Voiture " + nomMarque +
                " : " + nom +
                moteur + "\n";
    }
}
