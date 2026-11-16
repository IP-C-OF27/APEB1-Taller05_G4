import java.util.Scanner;
/**
 * Ejercicio 12: "Cálculo de impuestos: Desarrollar una solución que permita 
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto
 * por pagar y el precio de venta (incluido el impuesto) . Si el origen es
 * Alemania el impuesto es 20% , si es de Japón el impuesto es 30% , si es de
 * Italia, 15% , y si es de USA, 8%"
 * @author Valeria Agreda, Joel Valdez
 * @version 1.0
 */

public class Ejercicio12_CalculoImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca, origen;
        double costo, precioventa, impuesto = 0;
        System.out.print("Ingrese marca de vehiculo: ");
        marca = tcl.next();
        System.out.print("Ingrese origen de vehiculo: ");
        origen = tcl.next();
        System.out.print("Ingrese costo de vehiculo: ");
        costo = tcl.nextDouble();
        switch (origen){
            case "Alemania":
                impuesto = costo * 0.20;
                break;
            case "Japon":
                impuesto = costo * 0.30;
                break;
            case "Italia":
                impuesto = costo * 0.15;
                break;
            case "USA":
                impuesto = costo * 0.08; 
                break;
            default:
                impuesto = 0;
                break;
        }
      precioventa = impuesto + costo;
        System.out.println("El impuesto es: " + impuesto);
        System.out.println("El precio de venta es: " + precioventa);
    }   
}
/***
 * EVIDENCIA DEL RUN:
Ingrese marca de vehiculo: Jac
Ingrese origen de vehiculo: China
Ingrese costo de vehiculo: 18000
El impuesto es: 0.0
El precio de venta es: 18000.0
BUILD SUCCESSFUL (total time: 20 seconds)
 */
