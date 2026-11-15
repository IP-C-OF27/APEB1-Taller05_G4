import java.util.Scanner;
/**
 * Ejercicio 08: "Calculadora de IMC: Calcula el índice de masa corporal (IMC) 
 * de una persona y la clasifica en función de su valor (bajo peso, peso
 * normal, sobrepeso, etc.) ."
 * @author Valeria Agreda,Joel Valdez
 * @version 1.0
 */
    public class Ejercicio08_CalculadoraIMC{
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        double peso,altura,imc;
        String categoria = "";
        System.out.println("Ingresa tu peso en kilogramos: ");
        peso = tcl.nextDouble();
        System.out.println("Ingresa tu altura en metros: ");
        altura = tcl.nextDouble();
        imc = peso / (altura * altura);
        if (imc < 18.5){
            categoria = "Bajo peso";
        } else if (imc <= 24.9) {
            categoria = "Peso Normal";   
        } else if (imc <= 29.9){
            categoria = "Sobrepeso";
        } else if (imc <= 34.9){
            categoria = "Obesidad clase 1";
        } else if (imc <= 39.9){
            categoria = "Obesidad clase 2";
        } else if (imc >= 40){
            categoria = "Obesidad clase 3";
        } else {  
            categoria = "Valor invalido";
        } 
        System.out.println("Tu imc es: " + imc);
        System.out.println("Tu categoria de peso es: " + categoria);
        }
    }
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */