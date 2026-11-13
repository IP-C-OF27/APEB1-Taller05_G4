import java.util.Scanner;
/**
 * Ejercicio 13: "Sistema de reservas hoteleras: En una hostería de la ciudad
 * de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días,
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida el número de días y el precio diario de la
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y
 * el total por pagar."
 * @author Joel Valdez, Valeria Agreda
 * @version 1.0
 */
public class Ejercicio13_ReservasHoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias;
        double precioD, subtotal, descuento, total;
        System.out.print("Ingresar números de días: ");
        dias = tcl.nextInt();
        System.out.print("Ingresar precio diario: ");
        precioD = tcl.nextDouble();
        subtotal = dias * precioD;
        if (dias > 15)
            descuento = 0.20;
        else
            if (dias > 10)
                descuento = 0.15;
            else
                if (dias > 5)
                    descuento = 0.10;
                else
                    descuento = 0;
        descuento *= subtotal;
        total = subtotal - descuento;
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Descuento: "+descuento);
        System.out.println("Total: "+total);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingresar n�meros de d�as: 5
Ingresar precio diario: 3
Subtotal: 15.0
Descuento: 0.0
Total: 15.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */