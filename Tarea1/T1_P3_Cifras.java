// Autor: Bryan Carrión
import java.util.Scanner;

public class T1_P3_Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero de 3 cifras: ");
        int numero = sc.nextInt();

        int centenas = numero / 100;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);

        sc.close();
    }
}