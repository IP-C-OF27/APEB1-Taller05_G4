import java.util.Scanner;
/**
 * Ejercicio 11: "Pedidos online: Desarrollar una solución que imprima el costo
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad
 * que se requiere y el precio unitario. Si la cantidad pedida excede de 50
 * unidades, se hace un descuento de 15%."
 * @author Joel Valdez, Valeria Agreda
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precio, subtotal, descuento, total;
        System.out.print("Descripción del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Ingresar unidades del producto: ");
        cantidad = tcl.nextInt();
        System.out.print("Ingresar el precio unitario: ");
        precio = tcl.nextDouble();
        subtotal = cantidad * precio;
        if (cantidad > 50)
            descuento = 50 * 0.15;
        else
            descuento = 0;
        total = subtotal - descuento;
        System.out.println("-FACTURA-");
        System.out.println("Articulo: "+descripcion);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio unitario: $"+precio);
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Descuento: $"+descuento);
        System.out.println("Total a pagar: $"+total);                        
    }
}
/***
 * EVIDENCIA DEL RUN:
Descripci�n del articulo: Manzana
Ingresar unidades del producto: 4
Ingresar el precio unitario: 2
-FACTURA-
Articulo: Manzana
Cantidad: 4
Precio unitario: $2.0
Subtotal: $8.0
Descuento: $0.0
Total a pagar: $8.0
BUILD SUCCESSFUL (total time: 12 seconds)
 */