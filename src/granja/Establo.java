package granja;

import animales.Equino;
import interfaces.IRedileable;

public class Establo {


    private int equinos;
    private Equino[] establo = new Equino[5];


    public void meterEquino(Equino equino){
        if(getEquinos()<5){
            establo[getEquinos()]=equino;
            setEquinos(getEquinos()+1);
        }else{
            System.out.println("No hay hueco en el establo");
        }
    }

    public void meterEquino(IRedileable redileable){
        if(getEquinos()<5){
            establo[getEquinos()]=redileable;
            setEquinos(getEquinos()+1);
        }else{
            System.out.println("No hay hueco en el establo");
        }
    }

    public Equino[] getEstablo() {
        return establo;
    }

    public void setEstablo(Equino[] establo) {
        this.establo = establo;
    }

    public int getEquinos() {
        return equinos;
    }

    public void setEquinos(int equinos) {
        this.equinos = equinos;
    }
}
