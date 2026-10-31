import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        double mayor = -Double.MAX_VALUE;
        double menor = Double.MAX_VALUE;
        double suma = 0;
        int contador = 0;
        
        System.out.println("Ingrese temperaturas (ingrese -999 para terminar):");
        
        while (true) {
            System.out.print("Temperatura: ");
            temperatura = scanner.nextDouble();
            
            if (temperatura == -999) {
                break;
            }
            
            if (contador == 0) {
                mayor = temperatura;
                menor = temperatura;
            } else {
                if (temperatura > mayor) mayor = temperatura;
                if (temperatura < menor) menor = temperatura;
            }
            
            suma += temperatura;
            contador++;
        }
        
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("\n--- Resultados ---");
            System.out.println("Temperatura mayor: " + mayor);
            System.out.println("Temperatura menor: " + menor);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron temperaturas válidas.");
        }
        
        scanner.close();
    }
}