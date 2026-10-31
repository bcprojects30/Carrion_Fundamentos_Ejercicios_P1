/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Procesamiento de lecturas de temperatura mediante un valor centinela.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Carrion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int contador = 0;
        double suma = 0.0;
        double max = 0.0;
        double min = 0.0;

        System.out.println("=== ESTADÍSTICA DE UN SENSOR DE TEMPERATURA ===");
        System.out.print("Ingrese una lectura de temperatura (valor negativo para salir): ");
        double lectura = sc.nextDouble();

        if (lectura >= 0) {
            max = lectura;
            min = lectura;
        }

        // Se procesa la serie de datos hasta recibir el valor centinela
        while (lectura >= 0) {
            contador++;
            suma += lectura;

            if (lectura > max) {
                max = lectura;
            }
            if (lectura < min) {
                min = lectura;
            }

            System.out.print("Ingrese la siguiente lectura de temperatura (valor negativo para salir): ");
            lectura = sc.nextDouble();
        }

        // Se valida que existan datos para evitar la división entre cero
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.printf("\nLecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n", 
                              contador, promedio, max, min);
        } else {
            System.out.println("\nNo se registraron lecturas válidas.");
        }

        sc.close();
    }
}