package animales;

import interfaces.IRedileable;

public class Vaca extends Equino implements IRedileable {

    public Vaca(String nombre) {
        super(nombre,"vaca");
    }

    @Override
    public String mensajeEnElRedil() {
        return "aka Hola, soy una " + getTipoDeAnimal()  +" me llamo " + getNombre() + " y me están pastoreando";
    }
}
