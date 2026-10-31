import java.util.Scanner;
/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 28 de octubre de 2026
 * Enunciado: Extracción de cifras de un número de cuatro cifras, suma, invertido y verificación de paridad.
 */
public class Lab1_E3_Carrión {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        System.out.print("Ingrese un número entero de cuatro cifras: ");
        int numero = sc.nextInt();
        
        // Proceso: Extracción de cifras
        int millares = numero / 1000;
        int centenas = (numero / 100) % 10;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;
        
        // Suma de cifras
        int sumaCifras = millares + centenas + decenas + unidades;
        // Número invertido
        int invertido = (unidades * 1000) + (decenas * 100) + (centenas * 10) + millares;
        // Es par (true/false)
        boolean esPar = (numero % 2 == 0);
        // Salida
        System.out.println("Suma de cifras: " + sumaCifras);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);
        
        sc.close();
    }
}