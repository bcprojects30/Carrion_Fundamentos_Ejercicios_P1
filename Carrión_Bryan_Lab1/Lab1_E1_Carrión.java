import java.util.Locale;
import java.util.Scanner;

/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 28 de octubre de 2026
 * Enunciado: Conversión de una temperatura en Celsius a Fahrenheit y Kelvin.
 */
public class Lab1_E1_Carrión {
    public static void main(String[] args) {
        // Establecer Locale en US para usar el punto decimal en la entrada/salida
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();
        
        // Proceso
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        double kelvin = celsius + 273.15;
        
        // Salida formateada en columnas alineadas
        System.out.println("\nResultados de la conversión:");
        System.out.printf("%-12s %10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s %10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s %10.2f%n", "Kelvin", kelvin);
        
        sc.close();
    }
}