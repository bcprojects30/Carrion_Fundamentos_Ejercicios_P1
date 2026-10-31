/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Menú repetitivo de cajero automático con validación de saldo, depósitos y retiros.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Carrion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double saldo = 500.00;
        int opcion;

        do {
            System.out.println("\n=== CAJERO AUTOMÁTICO ===");
            System.out.println("1) Consultar saldo");
            System.out.println("2) Depositar dinero");
            System.out.println("3) Retirar dinero");
            System.out.println("0) Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = sc.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Monto inválido. No se permiten valores negativos o cero.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito aceptado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Monto inválido. No se permiten valores negativos o cero.");
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes o monto inválido.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso.");
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa. Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}