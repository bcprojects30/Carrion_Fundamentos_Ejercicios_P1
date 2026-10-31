import java.util.Locale;
import java.util.Scanner;

public class notaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("*****************************************");
        System.out.println("   SISTEMA DE CALIFICACION Y RENDIMIENTO");
        System.out.println("*****************************************");
        System.out.print("Calificacion del corte 1 (0 a 20): ");
        double califUno = teclado.nextDouble();

        System.out.print("Calificacion del corte 2 (0 a 20): ");
        double califDos = teclado.nextDouble();

        System.out.print("Calificacion del corte 3 (0 a 20): ");
        double califTres = teclado.nextDouble();

        double mediaAcademica = (califUno + califDos + califTres) / 3.0;

        System.out.println("-----------------------------------------");
        System.out.printf("Promedio ponderado obtenido: %.2f\n", mediaAcademica);

        // Cambiamos el orden de evaluación: evaluamos primero si va directo a reprobado por debajo de 9
        if (mediaAcademica < 9.0) {
            System.out.println("Dictamen oficial: <<Reprobado>>");
        } else {
            if (mediaAcademica <= 13.99) {
                System.out.println("Dictamen oficial: <<Supletorio>>");
            } else {
                if (mediaAcademica >= 14.0) {
                    System.out.println("Dictamen oficial: <<Aprobado>>");
                }
            }
        }
        System.out.println("*****************************************");

        teclado.close();
    }
}