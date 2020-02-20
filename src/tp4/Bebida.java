package tp4;

public abstract class Bebida {

    private int leche = 5;
    private int azucar = 5;
    private double iva = 1.21;
    private String tipo;
    private int cantidadAzucar;
    private int cantidadLeche;


    public Bebida(String tipo, int cantidadAzucar, int cantidadLeche) {
        this.tipo = tipo;
        this.cantidadAzucar = cantidadAzucar;
        this.cantidadLeche = cantidadLeche;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public int getCantidadLeche() {
        return cantidadLeche;
    }

    public String cantidadLeche() {
        if (getCantidadLeche() == 1) {
            return " con 1 nivel de leche ";
        } else {
            if (getCantidadLeche() == 2) {
                return " con 2 niveles de leche ";
            } else {
                if (getCantidadLeche() == 3) {
                    return " con 3 niveles de leche ";
                } else {
                    return "";
                }
            }
        }

    }

    public String cantidadAzucar() {
        if (getCantidadAzucar() == 1) {
            return " y con 1 nivel de azucar ";
        } else {
            if (getCantidadAzucar() == 2) {
                return " y con 2 niveles de azucar ";
            } else {
                if (getCantidadAzucar() == 3) {
                    return " y con 3 niveles de azucar ";
                } else {
                    return "";
                }
            }
        }

    }

    public abstract double getPrecio();

    public double calcularLeche() {
        return leche * cantidadLeche;
    }

    public double calcularAzucar() {
        return azucar * cantidadAzucar;
    }

    public double calcularSubTotal() {
        return getPrecio() + calcularLeche() + calcularAzucar();
    }

    public double calcularTotal() {
        return calcularSubTotal() * iva;
    }

    @Override
    public String toString() {
        return "//ACME//" + getTipo() + cantidadLeche() + cantidadAzucar() + " $" + calcularSubTotal();
    }
}
