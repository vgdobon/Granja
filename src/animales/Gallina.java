package animales;

import interfaces.IRedileable;

public class Gallina extends Ave implements IRedileable {
    public Gallina(String nombre) {
        super(nombre,"gallina");
    }

    @Override
    public String mensajeEnElRedil() {
        return "aka Hola, soy una " + getTipoDeAnimal()  +" me llamo " + getNombre() + " y me están pastoreando";
    }
}
