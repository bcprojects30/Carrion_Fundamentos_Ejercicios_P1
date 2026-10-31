import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        int sumaBucle = 0;
        for (int i = 1; i <= n; i++) {
            sumaBucle += i;
        }
        
        int sumaFormula = (n * (n + 1)) / 2;
        
        System.out.println("Suma usando ciclo for: " + sumaBucle);
        System.out.println("Suma usando fórmula n(n+1)/2: " + sumaFormula);
        
        scanner.close();
    }
}