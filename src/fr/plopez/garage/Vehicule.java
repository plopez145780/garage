package fr.plopez.garage;

import fr.plopez.option.Option;
import fr.plopez.moteur.Moteur;

import java.util.ArrayList;
import java.util.Iterator;
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
        this.options = new ArrayList<>();
        this.nomMarque = marque;
        this.moteur = null;
    }


    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix){
        this.prix = prix;
    }
    public void addToPrix(Double prix){
        setPrix(getPrix() + prix);

    }
    public List<Option> getOptions() {
        return options;
    }
    public Marque getMarque() {
        return nomMarque;
    }

    public void setMoteur(Moteur moteur){
        this.moteur = moteur;
        this.addToPrix(moteur.getPrix());
    }

    public void addOption(Option opt){
        options.add(opt);
        addToPrix(opt.getPrix());
    }

    public String toStringOptions() {
        String listeOptions ="[";
        Iterator iteratorOptions = options.listIterator();
        while(iteratorOptions.hasNext()){
            listeOptions += iteratorOptions.next();
            if(iteratorOptions.hasNext()){
                listeOptions += ", ";
            }
        }
        listeOptions +="] ";
        return listeOptions;
    }

    public String toString(){
        return "+ Voiture " + nomMarque + " : " + nom + moteur + toStringOptions() + "d'une valeur total de " + prix + " €\n";
    }
}
