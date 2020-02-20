package tp4;

public abstract class Te extends Bebida {

    public Te(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }

    @Override
    public String getTipo() {
        return " Té "+ super.getTipo();
    }
}
