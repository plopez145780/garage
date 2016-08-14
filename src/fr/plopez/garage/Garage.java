package fr.plopez.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by pierre on 13/08/2016.
 */
public class Garage {
    private List<Vehicule> voitures = new ArrayList<>();

    public Garage(){
        //TODO lire le fichier et enregistré le contenu, si pas de voiture message "Aucune voiture sauvegardée !"
        try{

        }catch(NullPointerException e){
            //TODO doit afficher "Aucune voiture sauvegardée !"
            e.getMessage();
        }
    }




    public void addVoiture(Vehicule voit){
        voitures.add(voit);
    }

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
