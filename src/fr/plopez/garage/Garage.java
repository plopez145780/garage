package fr.plopez.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * classe déclarant un garage contenant des Vehicule
 * @author pierre
 */
public class Garage {
    /**
     * Liste des objet Vehicule dans le garage
     */
    private List<Vehicule> voitures = new ArrayList<>();

    /**
     * Constructeur
     */
    public Garage(){
        //TODO lire le fichier et enregistré le contenu, si pas de voiture message "Aucune voiture sauvegardée !"
        try{

        }catch(NullPointerException e){
            //TODO doit afficher "Aucune voiture sauvegardée !"
            e.getMessage();
        }
    }


    /**
     * Permet d'ajouter un Vehicule a la liste des voitures
     * @param voit un objet Vehicule
     */
    public void addVoiture(Vehicule voit){
        voitures.add(voit);
    }

    /**
     * String permettant d'affiché le contenu du garage
     * @return texte affichant toute la liste des vehicules contenu dans le garage
     */
    public String toString(){
        String  listeVoiture =  "*************************\n" +
                                "* Garage OpenClassRooms *\n" +
                                "*************************\n";
        ListIterator iteratorVoitures = voitures.listIterator();
        while (iteratorVoitures.hasNext()){
            listeVoiture += iteratorVoitures.next();
        }
        return listeVoiture;
    }
}
