// Autor: Bryan Carrión
import java.util.Locale;
import java.util.Scanner;

public class T1_P5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el promedio: ");
        double promedio = sc.nextDouble();

        boolean puedePostular = (edad <= 25) && (promedio >= 8.5);

        System.out.println("¿Puede postular a la beca? " + puedePostular);

        sc.close();
    }
}