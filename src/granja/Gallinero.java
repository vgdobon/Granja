package granja;

import animales.Ave;
import animales.Gallina;

import java.util.ArrayList;

public class Gallinero {


    private int aves=0;
    private ArrayList<Ave> gallinero = new ArrayList<Ave>();


    public void meterAve(Ave ave){
        setAves(getAves()+1);
        gallinero.add(ave);
    }

    public void recogerHuevo(){
        if(hayGallina()){
            System.out.println("Has recogido un huevo del gallinero");
        }else{
            System.out.println("No se pueden recoger huevos. No hay gallinas en el gallinero");
        }

    }

    public boolean hayGallina(){
        boolean hayGallina=false;
        for (int i = 0; i <gallinero.size() ; i++) {
            if(gallinero.get(i) instanceof Gallina){
                hayGallina = true;
            }
        }

        if(hayGallina){
            return true;
        }else{
            return false;
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
