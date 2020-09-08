package animales;

public abstract class Animal {


    protected String nombre;
    protected String tipoDeAnimal;

    public Animal(String nombre,String tipoDeAnimal){
        this.nombre = nombre;
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }
}
