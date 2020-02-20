package tp4;

import java.util.Scanner;

public class Inicializador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de bebidas que desea pedir:");
        int cantidad = entrada.nextInt();
        Bebida bebida [] = new Bebida[cantidad];
        double subTotal = 0;
        double total = 0;

        for (int i = 0; i <bebida.length; i++) {
            System.out.print("Desea pedir Te o Cafe?");
            String cafeTe = entrada.next().toLowerCase();

            if (cafeTe.equals("cafe")) {
                System.out.print("Que tipo de Café desea pedir? Escribir Normal, Ristretto, o Expresso ");
                String tipo = entrada.next().toLowerCase(); System.out.print("Cuántos niveles de azucar desea para su café? Del 0 al 3 ");
                int cantidadAzucar = entrada.nextInt();
                System.out.print("Cuantos niveles de leche desea para su café? Del 0 al 3 ");
                int cantidadLeche = entrada.nextInt();
                if (tipo.equals("expresso")) {
                    bebida[i] = new Expresso(tipo, cantidadAzucar, cantidadLeche);
                } if (tipo.equals("ristretto")) {
                    bebida[i] = new Ristretto(tipo, cantidadAzucar, cantidadLeche);
                } if (tipo.equals("normal")) {
                    bebida[i] = new Normal(tipo, cantidadAzucar, cantidadLeche);
                }
            }

            if (cafeTe.equals("te")) {
                System.out.print("Que tipo de Té desea pedir? Escribir Rojo, Verde o Negro ");
                String tipo = entrada.next().toLowerCase();
                System.out.print("Cuántos niveles de azucar desea para su té? Del 0 al 3 ");
                int cantidadAzucar = entrada.nextInt();
                System.out.print("Cuantos niveles de leche desea para su té? Del 0 al 3 ");
                int cantidadLeche = entrada.nextInt();
                if (tipo.equals("rojo")) {
                    bebida[i] = new Rojo(tipo, cantidadAzucar, cantidadLeche);
                } if (tipo.equals("verde")) {
                    bebida[i] = new Verde(tipo, cantidadAzucar, cantidadLeche);
                } if (tipo.equals("negro")) {
                    bebida[i] = new Negro(tipo, cantidadAzucar, cantidadLeche);
                }
            }
            subTotal += bebida[i].calcularSubTotal();
            total += bebida[i].calcularTotal();

        }

        for (int i = 0; i < bebida.length; i++) {
            System.out.println(bebida[i]);
        }

        System.out.println("SUBTOTAL: $" + subTotal);
        System.out.println("TOTAL: $" + total);


    }
}
