import animales.*;
import granja.Granja;

public class Main {

//    Una granja tiene establos y un gallinero.
//    Cada establo tiene un límite de 5 animales.
//    Puedo meter animales en un establo.
//    Si el establo está lleno, muestra un mensaje como que no acepta más.
//    El granjero conoce a todos los animales por su nombre.
//    Hay vacas, bueyes, caballos, gallinas y pavos.
//    En el matadero, se pueden sacrificar gallinas o pavos (animales del gallinero).
//    Su número disminuye si se sacrifican.
//    Puedo meter gallinas o pavos en el gallinero.
//    Si el granjero va a sacrificar una gallina o pavo y no quedan de ese tipo, debe avisar.
//    Puedo meter infinitas gallinas o pavos dentro de ese gallinero.
//    El granjero quiere saber a qué gallina o pavo se va a comer (nombre).
//    En el gallinero puedo coger huevos, pero sólo si hay gallinas.

    public static void main(String[] args) {

        Granja granja = new Granja();

        Buey buey=new Buey("Buey");
        Caballo caballo = new Caballo("Caballo");
        Gallina gallina = new Gallina("Gallina");
        Pavo pavo = new Pavo("Pavo");
        Vaca vaca = new Vaca("Vaca");


        granja.gallinero.meterAve(pavo);
        granja.gallinero.recogerHuevo();

        granja.gallinero.meterAve(gallina);
        granja.gallinero.recogerHuevo();


    }
}
