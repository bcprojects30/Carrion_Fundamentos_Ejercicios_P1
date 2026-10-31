import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double discriminante = (b * b) - (4 * a * c);
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíces reales: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Raíz doble: " + x);
        } else {
            System.out.println("sin raíces reales");
        }
        
        scanner.close();
    }
}