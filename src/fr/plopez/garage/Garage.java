package fr.plopez.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by pierre on 13/08/2016.
 */
public class Garage {
    private List<Vehicule> voitures = new ArrayList<>();

    public void addVoiture(Vehicule voit){
        voitures.add(voit);
        System.out.println("Ajout voiture");
        System.out.println(this.toString());
    }

    public String toString(){
        String listeVoiture = "";
        try {
            if (voitures.isEmpty()){
                listeVoiture = "Aucune voiture sauvegardée !";
            }

            ListIterator iteratorVoitures = voitures.listIterator();
            while (iteratorVoitures.hasNext()){
                listeVoiture += iteratorVoitures.next();
            }
        }catch (NullPointerException e){
            listeVoiture = "Aucune voiture sauvegardée !";
        }

        return listeVoiture;
    }
}
