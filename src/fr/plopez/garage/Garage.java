package fr.plopez.garage;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by pierre on 13/08/2016.
 */
public class Garage {
    private List<Vehicule> voitures;

    public void add(Vehicule voit){
        voitures.add(voit);
    }

    public String toString(){
        String listeVoiture = "";
        try {
            ListIterator<Vehicule> iteratorVoitures = voitures.listIterator();
            while (iteratorVoitures.hasNext()){
                listeVoiture += iteratorVoitures.next();
            }
        }catch (NullPointerException e){
            listeVoiture = "Aucune voiture sauvegardée !";
        }


        return listeVoiture;
    }
}
