package granja;

import animales.Ave;
import animales.Gallina;
import interfaces.IRedileable;

import java.util.ArrayList;

public class Gallinero {


    private int aves = 0;
    private ArrayList<Ave> gallinero = new ArrayList<Ave>();


    public void meterAve(Ave ave) {
        setAves(getAves() + 1);
        gallinero.add(ave);
    }


    public IRedileable sacarAveAlRedil() {
        if (hayGallina() && buscarGallina()!=null) {
            Ave gallina = buscarGallina();
            gallinero.remove(gallina);
            return (IRedileable)gallina;
        } else {
            return null;
        }
    }

    public Ave buscarGallina(){
        for (Ave ave:gallinero) {
            if(ave instanceof Gallina){
                return ave;
            }
        }
        return null;
    }

    public boolean hayGallina() {

        for (int i = 0; i < gallinero.size(); i++) {
            if (gallinero.get(i) instanceof Gallina) {
                return true;
            }
        }

        return false;
    }

    public void recogerHuevo() {
        if (hayGallina()) {
            System.out.println("Has recogido un huevo del gallinero");
        } else {
            System.out.println("No se pueden recoger huevos. No hay gallinas en el gallinero");
        }

    }


    public int getAves() {
        return aves;
    }

    public void setAves(int aves) {
        this.aves = aves;
    }

    public ArrayList<Ave> getGallinero() {
        return gallinero;
    }

    public void setGallinero(ArrayList<Ave> gallinero) {
        this.gallinero = gallinero;
    }


}
