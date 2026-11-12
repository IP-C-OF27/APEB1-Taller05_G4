import java.util.Scanner;
/**
 * Ejercicio 01: "Texto del enunciado del ejercicio/problema...."
 * @author Joel Valdez, Valeria Agreda
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio;
        System.out.print("Ingresar año: ");
        anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0)|| (anio % 400 == 0))
            System.out.println("El año es bisiesto \n¡El año tiene 366 dias!");
        else
            System.out.println("El año no es bisiesto");                   
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingresar a�o: 2024
El a�o es bisiesto 
�El a�o tiene 366 dias!
BUILD SUCCESSFUL (total time: 4 seconds)
 */