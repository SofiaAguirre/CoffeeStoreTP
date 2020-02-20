package tp4;

public class Rojo extends Te {

    private double precio = 70;

    public Rojo(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
