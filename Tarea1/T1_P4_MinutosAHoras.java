// Autor: Bryan Carrión
import java.util.Scanner;

public class T1_P4_MinutosAHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int totalMinutos = sc.nextInt();

        int horas = totalMinutos / 60;
        int minutosRestantes = totalMinutos % 60;

        System.out.println(totalMinutos + " -> " + horas + " h " + minutosRestantes + " min");

        sc.close();
    }
}