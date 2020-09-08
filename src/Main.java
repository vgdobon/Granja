import animales.*;
import granja.Granja;
import interfaces.IRedileable;


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
        IRedileable caballo5 = (IRedileable)caballo2;
        granja.establoI.meterEquino(vaca);
        granja.establoI.meterEquino(vaca2);
        granja.establoI.meterEquino(buey);
        granja.establoI.meterEquino(buey2);
        granja.establoI.meterEquino(caballo);
        granja.establoI.meterEquino(caballo2);




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




        Vaca vaca3 = new Vaca("Vaca Lola");
        Vaca vaca4 = new Vaca("Vaca Pepa");
        Vaca vaca5 = new Vaca("Vaca Manoli");
        Vaca vaca6 = new Vaca("Vaca que rie");
        Vaca vaca7 = new Vaca("Vaca que llora");
        granja.establoII.meterEquino(vaca3);
        granja.establoII.meterEquino(vaca4);
        granja.establoII.meterEquino(vaca5);
        granja.establoII.meterEquino(vaca6);
        granja.establoII.meterEquino(vaca7);

        Gallina gallina1 = new Gallina("Gallina Turuleta");
        Gallina gallina2 = new Gallina("Gallina Clueca");
        Gallina gallina3 = new Gallina("Gallina Padovana");
        Gallina gallina4 = new Gallina("Gallina Sedosa del Japón");
        Gallina gallina5 = new Gallina("Gallina borbonesa x");
        granja.gallinero.meterAve(gallina1);
        granja.gallinero.meterAve(gallina2);
        granja.gallinero.meterAve(gallina3);
        granja.gallinero.meterAve(gallina4);
        granja.gallinero.meterAve(gallina5);



        granja.redil.meterAlRedil(granja.establoII.sacarVacaAlRedil());
        granja.redil.meterAlRedil(granja.establoII.sacarVacaAlRedil());
        granja.redil.meterAlRedil(granja.establoII.sacarVacaAlRedil());
        granja.redil.meterAlRedil(granja.establoII.sacarVacaAlRedil());
        granja.redil.meterAlRedil(granja.establoII.sacarVacaAlRedil());






    }
}
