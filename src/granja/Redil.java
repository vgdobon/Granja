package granja;

import animales.Gallina;
import animales.Vaca;
import interfaces.IRedileable;
import java.util.ArrayList;

public class Redil {



    ArrayList<IRedileable> redil = new ArrayList<IRedileable>();


    public void meterAlRedil(IRedileable iRedileable){
        redil.add(iRedileable);
    }



    public int cuantasVacasHay(Redil redil) {
        int cantidadDeVacasEnElRedil = 0;
        for (IRedileable elemento : redil.getRedil()
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

    public int cuantasGallinasHay(Redil redil) {
        int cantidadDeGallinasEnElRedil = 0;
        for (IRedileable elemento : redil.getRedil()
        ) {
            if (elemento instanceof Vaca) {
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
