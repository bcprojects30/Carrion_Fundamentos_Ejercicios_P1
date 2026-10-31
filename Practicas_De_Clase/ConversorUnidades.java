import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) m -> ft");
        System.out.println("2) kg -> lb");
        System.out.println("3) C -> F");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                double metros = scanner.nextDouble();
                double pies = metros * 3.28084;
                System.out.println("Resultado: " + pies + " ft");
                break;
            case 2:
                double kilos = scanner.nextDouble();
                double libras = kilos * 2.20462;
                System.out.println("Resultado: " + libras + " lb");
                break;
            case 3:
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.println("Resultado: " + fahrenheit + " °F");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        
        scanner.close();
    }
}