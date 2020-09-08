package granja;

import animales.Equino;
import animales.Vaca;
import interfaces.IRedileable;

import java.util.ArrayList;

public class Establo {

    private int equinos;
    private ArrayList<Equino> establo = new ArrayList<Equino>();


    public void meterEquino(Equino equino){
        if(getEquinos()<5){
            establo.add(equino);
            setEquinos(getEquinos()+1);
        }else{
            System.out.println("No hay hueco en el establo");
        }
    }

    public IRedileable sacarVacaAlRedil(){

        if(hayVacas() && buscarVaca()!=null){
            Vaca vaca=buscarVaca();
            establo.remove(vaca);
            return (IRedileable) vaca;
        }else{
            System.out.println("No hay vacas en este establo");
            return null;
        }
    }



    public Vaca buscarVaca(){

        for (Equino equino:establo) {
            if(equino instanceof Vaca){
                return (Vaca)equino;
            }
        }

        return null;
    }

    public boolean hayVacas(){
        for (Equino equino:establo) {
            if(equino instanceof Vaca){
                return true;

            }
        }
        return false;
    }

    public int getEquinos() {
        return equinos;
    }

    public void setEquinos(int equinos) {
        this.equinos = equinos;
    }

    public ArrayList<Equino> getEstablo() {
        return establo;
    }

    public void setEstablo(ArrayList<Equino> establo) {
        this.establo = establo;
    }


}
