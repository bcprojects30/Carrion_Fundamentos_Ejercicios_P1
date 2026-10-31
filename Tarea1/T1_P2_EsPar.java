// Autor: Bryan Carrión
import java.util.Scanner;

public class T1_P2_EsPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        // Imprime directamente la expresión relacional (true o false) sin usar if
        System.out.println("¿Es par? " + (numero % 2 == 0));

        sc.close();
    }
}