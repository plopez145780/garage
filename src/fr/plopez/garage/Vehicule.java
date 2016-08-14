package fr.plopez.garage;

import fr.plopez.option.Option;
import fr.plopez.moteur.Moteur;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe abstraite permettant de creer des voitures
 * @author pierre
 */
public abstract class Vehicule implements Serializable {
    /**
     * prix du vehicule
     */
    private Double prix;
    /**
     * nom du model de vehicule
     */
    private String nom;
    /**
     * liste des options que possede le vehicule
     */
    private List<Option> options;
    /**
     * marque du vehicule
     */
    private Marque nomMarque;
    /**
     * type de motorisation
     */
    private Moteur moteur;

    /**
     * Constructeur
     * @param nom nom du model
     * @param marque marque du vehicule venant de l'enumeration Marque
     */
    public Vehicule(String nom, Marque marque){
        this.prix = 0.0;
        this.nom = nom;
        this.options = new ArrayList<>();
        this.nomMarque = marque;
        this.moteur = null;
    }

    /**
     * Retourne le prix
     * @return prix
     */
    public Double getPrix() {
        return prix;
    }

    /**
     * Modifie le prix par le nouveau
     * @param prix nouveau prix remplacant l'actuel
     */
    public void setPrix(Double prix){
        this.prix = prix;
    }

    /**
     * Ajoute le prix en parametre au prix du vehicule
     * @param prix prix a ajouté au prix actuel
     */
    public void addToPrix(Double prix){
        setPrix(getPrix() + prix);

    }

    /**
     * Retourne la liste des options
     * @return un arrayListe des objets Option
     */
    public List<Option> getOptions() {
        return options;
    }

    /**
     * retorune la marque du vehicule
     * @return objet Marque
     */
    public Marque getMarque() {
        return nomMarque;
    }

    /**
     * Modifie l'attribut moteur de vehicule et ajoute son prix a celui du vehicule
     * @param moteur objet Moteur
     */
    public void setMoteur(Moteur moteur){
        this.moteur = moteur;
        this.addToPrix(moteur.getPrix());
    }

    /**
     * Ajoute une option dans la list du vehicule et augmente le prix du vehicule
     * @param opt object Option
     */
    public void addOption(Option opt){
        options.add(opt);
        addToPrix(opt.getPrix());
    }

    /**
     * Texte décrivant toutes les options du vehicule
     * @return un string
     */
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

    /**
     * Texte décrivant le vehicule
     * @return un string
     */
    public String toString(){
        return "+ Voiture " + nomMarque + " : " + nom + moteur + toStringOptions() + "d'une valeur total de " + prix + " €\n";
    }
}
