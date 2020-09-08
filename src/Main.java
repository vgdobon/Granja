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


        //ESTABLO
        Vaca vaca = new Vaca("Vaca");
        Vaca vaca2 = new Vaca("Vaca2");
        Buey buey=new Buey("Buey");
        Buey buey2=new Buey("Buey2");
        Caballo caballo = new Caballo("Caballo");
        Caballo caballo2 = new Caballo("Caballo2");
        granja.establoI.meterEquino(vaca);
        granja.establoI.meterEquino(vaca2);
        granja.establoI.meterEquino(buey);
        granja.establoI.meterEquino(buey2);
        granja.establoI.meterEquino(caballo);
        granja.establoI.meterEquino(caballo2);
        granja.establoII.meterEquino(caballo2);



        //GALLINERO
        Gallina gallina = new Gallina("GallinaTuruleta");
        Pavo pavo = new Pavo("PavoClaudio");
        granja.gallinero.meterAve(pavo);
        granja.gallinero.recogerHuevo();

        granja.gallinero.meterAve(gallina);
        granja.gallinero.recogerHuevo();
        System.out.println(granja.matadero.sacrificarAve("pavo"));
        System.out.println(granja.matadero.sacrificarAve("pavo"));
        System.out.println(granja.matadero.sacrificarAve("Gallina"));
        System.out.println(granja.matadero.sacrificarAve("Gallina"));
        granja.gallinero.recogerHuevo();


    }
}
