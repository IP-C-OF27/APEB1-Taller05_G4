import java.util.Scanner;
/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto
  con un descuento del 10% si el precio original es mayor de $100 ; De lo
  contrario, no hay descuento."
 * @author Valeria Agreda, Joel Valdez
 * @version 1.0
 */
public class Ejercicio04_Descuento{
    public static void main(String[] args) {
        double precio, factura;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame precio: ");
        precio = tcl.nextDouble();
        factura = precio;
        if (precio > 100)
            precio *= 0.9;
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */