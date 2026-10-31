import java.util.Scanner;

public class FactorialValidado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Ingrese un número entero mayor o igual a 0: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Error: El número debe ser mayor o igual a 0. Intente de nuevo.");
            }
        } while (n < 0);
        
        long factorial = 1; // Usamos long debido a que el factorial crece rápido
        int i = 1;
        
        while (i <= n) {
            factorial *= i;
            i++;
        }
        
        System.out.println("El factorial de " + n + " es: " + factorial);
        scanner.close();
    }
}