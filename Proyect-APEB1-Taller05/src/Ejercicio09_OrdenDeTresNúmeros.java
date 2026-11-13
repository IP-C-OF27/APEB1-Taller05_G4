import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos
 * en orden ascendente."
 * @author Joel Valdez, Valeria Agreda
 * @version 1.0
 */
public class Ejercicio09_OrdenDeTresNúmeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingresar primer número: ");
        num1 = tcl.nextInt();
        System.out.print("Ingresar segundo número: ");
        num2 = tcl.nextInt();
        System.out.print("Ingresar tercer número: ");
        num3 = tcl.nextInt();
        if (num1 <= num2 && num1 <= num3)
            if (num2 <= num3)
                System.out.println(num1+" "+num2+" "+num3);
            else
                System.out.println(num1+" "+num3+" "+num2);
        else
            if (num2 <= num1 && num2 <= num3)
                if (num1 <= num3)
                    System.out.println(num2+" "+num1+" "+num3);
                else
                    System.out.println(num2+" "+num3+" "+num1);
            else
                if (num1 <= num2)
                    System.out.println(num3+" "+num1+" "+num2);
                else
                    System.out.println(num3+" "+num2+" "+num1);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingresar primer n�mero: 10
Ingresar segundo n�mero: 20
Ingresar tercer n�mero: 8
8 10 20
BUILD SUCCESSFUL (total time: 14 seconds)
 */