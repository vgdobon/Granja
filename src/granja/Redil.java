package granja;

import animales.Animal;
import animales.Gallina;
import animales.Vaca;
import interfaces.IRedileable;
import java.util.ArrayList;

public class Redil {



    ArrayList<IRedileable> redil = new ArrayList<IRedileable>();


    public void meterAlRedil(IRedileable iRedileable){
        decirFraseTranquilizadora(iRedileable);
        redil.add(iRedileable);
    }


    public void pastorear(Gallina gallina){
        if(hayGallinasEnElRedil(gallina)){
            System.out.println(gallina.mensajeEnElRedil());
        }else{
            System.out.println(gallina.getNombre() + "no esta esa en el redil");
        }
    }

    public void pastorear(Vaca vaca){
        if(hayVacasEnElRedil(vaca)){
            System.out.println(vaca.mensajeEnElRedil());
        }else{
            System.out.println(vaca.getNombre() + "no esta en el redil");
        }
    }

    public boolean hayVacasEnElRedil(Vaca vaca){
        for (int i = 0; i < getRedil().size(); i++) {
            if(vaca.getNombre().equalsIgnoreCase(redil.get(i).getNombre())){
                return true;
            }
        }

        return false;

    }

    public boolean hayGallinasEnElRedil(Gallina gallina){
        for (int i = 0; i < getRedil().size(); i++) {
            if(gallina.getNombre().equalsIgnoreCase(redil.get(i).getNombre())){
                return true;
            }
        }

        return false;

    }

    public String mensajeCuantasVacasHay(){
        return "En el redil hay " + cuantasVacasHay() + " vacas";
    }

    public int cuantasVacasHay() {
        int cantidadDeVacasEnElRedil = 0;
        for (IRedileable elemento : getRedil()
        ) {
            if (elemento instanceof Vaca) {
                cantidadDeVacasEnElRedil++;
            }
        }

        return cantidadDeVacasEnElRedil;
    }

    public void decirFraseTranquilizadora(IRedileable iRedileable){
        System.out.println("Ven conmigo mi bonit@ " +iRedileable.getNombre());
    }

    public String mensajeCuantasGallinasHay(){
        return "En el redil hay " + cuantasGallinasHay() + " gallinas";
    }

    public int cuantasGallinasHay() {
        int cantidadDeGallinasEnElRedil = 0;
        for (IRedileable elemento : getRedil()) {
            if (elemento instanceof Gallina) {
                cantidadDeGallinasEnElRedil++;
            }
        }

        return cantidadDeGallinasEnElRedil;
    }


    public String tipoDeAnimal(IRedileable animal){
        return animal.getClass().getSimpleName();
    }

    public ArrayList<IRedileable> getRedil() {
        return redil;
    }

    public void setRedil(ArrayList<IRedileable> redil) {
        this.redil = redil;
    }


}
