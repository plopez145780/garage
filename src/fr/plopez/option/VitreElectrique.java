package fr.plopez.option;

/**
 * Created by pierre on 13/08/2016.
 */
public class VitreElectrique implements Option{
    public Double getPrix(){
        return 200.50;
    }
    public String toString(){
        return "Vitre électrique (" + getPrix() + "€)";
    }
}
