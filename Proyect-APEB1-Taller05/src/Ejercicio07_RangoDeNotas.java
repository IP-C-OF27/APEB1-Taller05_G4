import java.util.Scanner;
/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Joel Valdez, Valeria Agreda
 * @version 1.0
 */
public class Ejercicio07_RangoDeNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        System.out.print("Ingresar Calificación: ");
        nota = tcl.nextInt();
        if (nota >= 90 && nota <= 100)
            System.out.println("Calificaci[on: A");
        else
            if (nota >= 80 && nota <= 89)
                System.out.println("Calificación: B");
            else
                if (nota >= 70 && nota <= 89)
                    System.out.println("Calificación: C");
                else
                    if (nota >= 0 && nota <= 69)
                        System.out.println("Calificación: D");
                    else
                        System.out.println("Nota no valida");
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingresar Calificaci�n: 98
Calificaci[on: A
BUILD SUCCESSFUL (total time: 3 seconds)
 */