import java.util.Scanner;
/**
 * Ejercicio 01: "Texto del enunciado del ejercicio/problema...."
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio03_MayorTresNum {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme 3 num: ");
        int n1 = tcl.nextInt(), n2 = tcl.nextInt(), n3 = tcl.nextInt(), mayor;
        if (n1 > n2)
            mayor = n1;
        else
            mayor = n2;
        if (mayor < n3)
            mayor = n3;
        System.out.println(mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
Deme 3 num: 3 1 2
3
BUILD SUCCESSFUL (total time: 3 seconds)
 */