package tp4;

public class Ristretto extends Cafe {

    private double precio = 110;

    public Ristretto(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
