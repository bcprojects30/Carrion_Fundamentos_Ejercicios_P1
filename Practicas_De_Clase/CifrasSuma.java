import java.util.Scanner;

public class CifrasSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        int numeroOriginal = Math.abs(n); // Manejo por si ingresan negativos
        int aux = numeroOriginal;
        int contadorCifras = 0;
        int sumaCifras = 0;
        
        if (aux == 0) {
            contadorCifras = 1;
            sumaCifras = 0;
        } else {
            while (aux > 0) {
                int cifra = aux % 10;
                sumaCifras += cifra;
                contadorCifras++;
                aux /= 10;
            }
        }
        
        System.out.println("Cantidad de cifras: " + contadorCifras);
        System.out.println("Suma de las cifras: " + sumaCifras);
        scanner.close();
    }
}