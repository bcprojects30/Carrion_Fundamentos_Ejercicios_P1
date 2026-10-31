import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();
        double total = 0;
        
        if (horas <= 1) {
            total = 1.00;
        } else {
            total = 1.00 + (horas - 1) * 0.50;
        }
        
        if (total > 6.00) {
            total = 6.00;
        }
        
        System.out.println("Total a pagar: $" + total);
        scanner.close();
    }
}