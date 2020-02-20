package tp4;

public abstract class Cafe extends Bebida {

    public Cafe(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }


    @Override
    public String getTipo() {
        return " Café "+ super.getTipo();
    }
}
