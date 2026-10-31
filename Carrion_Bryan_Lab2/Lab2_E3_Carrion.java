/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Juego de adivinanza de un número aleatorio entre 1 y 100 con límite de 7 intentos.
 */
import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Carrion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();

        int numeroSecreto = azar.nextInt(100) + 1;
        int intentosMaximos = 7;
        int intentosRealizados = 0;
        int intentoUsuario = 0;
        boolean acertado = false;

        System.out.println("=== JUEGO: ADIVINA EL NÚMERO ===");
        System.out.println("Se ha generado un número entre 1 y 100.");
        System.out.println("Dispone de " + intentosMaximos + " intentos para adivinarlo.");

        do {
            intentosRealizados++;
            System.out.print("\nIntento " + intentosRealizados + " de " + intentosMaximos + " - Ingrese su número: ");
            intentoUsuario = sc.nextInt();

            if (intentoUsuario == numeroSecreto) {
                acertado = true;
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es MÁS ALTO.");
            } else {
                System.out.println("El número secreto es MÁS BAJO.");
            }

        } while (!acertado && intentosRealizados < intentosMaximos);

        System.out.println("\n----------------------------------------");
        if (acertado) {
            System.out.println("¡Felicidades! Ha adivinado el número en " + intentosRealizados + " intento(s).");
        } else {
            System.out.println("Se han agotado los intentos. El número secreto era: " + numeroSecreto);
        }
        System.out.println("----------------------------------------");

        sc.close();
    }
}