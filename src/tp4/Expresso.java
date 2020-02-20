package tp4;

public class Expresso extends Cafe {

    private double precio =  100;

    public Expresso(String tipo, int cantidadAzucar, int cantidadLeche) {
        super(tipo, cantidadAzucar, cantidadLeche);
    }


    @Override
    public double getPrecio() {
        return precio;
    }
}
