package fr.plopez.option;

/**
 * Created by pierre on 13/08/2016.
 */
public class Climatisation implements Option {
    public Double getPrix(){
        return 160.77;
    }
    public String toString(){
        return "Climatisation (" + getPrix() + "€)";
    }
}
