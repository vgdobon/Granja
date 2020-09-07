package granja;

import animales.Ave;
import animales.Equino;
import animales.Gallina;

public class Gallinero {


    private int aves=0;
    private Ave gallinero[] = new Ave[1000];


    public void meterAve(Ave ave){
        gallinero[getAves()]=ave;
        setAves(getAves()+1);
    }

    public void recogerHuevo(){
        if(hayGallina()){
            System.out.println("Has recogido un huevo del gallinero");
        }else{
            System.out.println("No hay gallinas en el gallinero");
        }

    }

    public boolean hayGallina(){
        boolean hayGallina=false;
        for (int i = 0; i <gallinero.length ; i++) {
            if(gallinero[i] instanceof Gallina){
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

    public Ave[] getGallinero() {
        return gallinero;
    }

    public void setGallinero(Ave[] gallinero) {
        this.gallinero = gallinero;
    }
}
