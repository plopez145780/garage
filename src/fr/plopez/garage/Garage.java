package fr.plopez.garage;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * classe déclarant un garage contenant des Vehicule
 * @author pierre
 */
public class Garage implements Serializable{
    /**
     * Liste des objet Vehicule dans le garage
     */
    private List<Vehicule> voitures = new ArrayList<>();

    /**
     * Constructeur
     */
    public Garage(){
        try(
                FileInputStream fis = new FileInputStream("garage.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            voitures = (List<Vehicule>)ois.readObject();
        }catch(IOException e){
            System.out.println("Aucune voiture sauvegardée !");
        }catch(NullPointerException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    /**
     * Permet d'ajouter un Vehicule a la liste des voitures et d'enregistré la liste de voiture dans le fichier
     * @param voit un objet Vehicule
     */
    public void addVoiture(Vehicule voit){
        voitures.add(voit);
        try(
                FileOutputStream fos = new FileOutputStream("garage.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)
        ){
            oos.writeObject(voitures);
            oos.close();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
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
