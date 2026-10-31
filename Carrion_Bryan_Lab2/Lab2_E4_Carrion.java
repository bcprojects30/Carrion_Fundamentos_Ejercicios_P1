/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Lectura validada de un número impar n y dibujo de un rombo de n filas.
 */
import java.util.Scanner;

public class Lab2_E4_Carrion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("=== DIBUJO DE ROMBO DE ASTERISCOS ===");
        
        // Se valida mediante do-while que n sea positivo e impar
        do {
            System.out.print("Ingrese un número entero positivo e impar (n): ");
            n = sc.nextInt();
            
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Valor inválido. El número debe ser positivo e impar. Intente nuevamente.");
            }
        } while (n <= 0 || n % 2 == 0);

        System.out.println("\nRombo de " + n + " filas:");
        
        int mid = n / 2;
        
        // Ciclos anidados para recorrer las filas y columnas del rombo
        for (int i = 0; i < n; i++) {
            int espacios = Math.abs(mid - i);
            int asteriscos = n - 2 * espacios;
            
            // Impresión de espacios en blanco
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            
            // Impresión de asteriscos
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        sc.close();
    }
}