import java.util.Scanner;
/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Valeria Agreda, Joel Valdez
 * @version 1.0
 */
public class Ejercicio06_CategoriaEdad{
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        int edad;
        String categoria;
        System.out.print("Ingresa tu edad: ");
        edad = tcl.nextInt();
        if (edad < 0){
            categoria = "edad no valida";
            }else if (edad <= 11){
                categoria = "niño";
                }else if (edad <= 17){
                    categoria = "adolescente";
                    } else {
                    categoria = "adulto";}
        System.out.println("Tu categoria de edad es: " + categoria);       
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingresa tu edad: 18
Tu categoria de edad es: adulto
BUILD SUCCESSFUL (total time: 8 seconds)
 */