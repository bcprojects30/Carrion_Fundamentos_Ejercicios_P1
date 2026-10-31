import java.util.Scanner;

/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 28 de octubre de 2026
 * Enunciado: Desglose de un tiempo dado en segundos a horas, minutos y segundos.
 */
public class Lab1_E2_Carrión {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        System.out.print("Ingrese el tiempo total en segundos: ");
        int segundosTotales = sc.nextInt();
        
        // Proceso
        int horas = segundosTotales / 3600;
        int resto = segundosTotales % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        // Salida
        System.out.printf("%d s = %d h %d min %d s%n", segundosTotales, horas, minutos, segundos);
        
        // Verificación para la prueba de escritorio / informe
        int reconstruido = (horas * 3600) + (minutos * 60) + segundos;
        System.out.println("Verificación (reconstrucción): " + reconstruido + " s");
        
        sc.close();
    }
}