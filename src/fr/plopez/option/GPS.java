package fr.plopez.option;

/**
 * Created by pierre on 13/08/2016.
 */
public class GPS implements Option {
    public Double getPrix(){
        return 150.20;
    }
    public String toString(){
        return "GPS (" + getPrix() + "€)";
    }
}
