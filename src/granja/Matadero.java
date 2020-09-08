package granja;

import animales.Ave;
import animales.Gallina;
import animales.Pavo;

import java.util.ArrayList;

import static granja.Granja.*;

public class Matadero {


    public static String sacrificarAve(String tipoDeAve){


        ArrayList<Ave> matadero;
        matadero = Granja.gallinero.getGallinero();

        Ave objetoReturn = null;
        boolean hayGallinas=false;
        boolean hayPavos=false;
        boolean hayAve;
        int posicionAve = -1;


        if(tipoDeAve.equalsIgnoreCase("gallina")){
            for (int i = 0; i <matadero.size() ; i++) {
                if(matadero.get(i) instanceof Gallina){
                    objetoReturn= matadero.get(i);
                    posicionAve = i;
                    hayGallinas=true;
                    break;
                }
            }
            hayAve = hayAvesDeEseTipo(hayGallinas);
        }else{
            for (int i = 0; i <matadero.size() ; i++) {
                if(matadero.get(i) instanceof Pavo){
                    objetoReturn= matadero.get(i);
                    posicionAve = i;
                    hayPavos=true;
                    break;
                }
            }
            hayAve = hayAvesDeEseTipo(hayPavos);
        }

        if(!(posicionAve==-1)){
            matadero.remove(posicionAve);
        }

        if(hayAve){
            Granja.gallinero.setAves(gallinero.getAves()-1);
            gallinero.setGallinero(matadero);
            return "Se ha encontrado a un/a " + tipoDeAve + " en el gallinero. " + objetoReturn.getNombre() + " ha sido sacrificada";

        }else{

            return "No quedan " + tipoDeAve + "s en el gallinero";
        }


    }

    public static boolean hayAvesDeEseTipo(boolean hayAve){
        if(hayAve){
            return true;
        }else{
            return false;
        }
    }
}
