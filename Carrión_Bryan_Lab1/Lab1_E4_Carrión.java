import java.util.Locale;
import java.util.Scanner;

/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 28 de octubre de 2026
 * Enunciado: Cálculo de factura con subtotal, IVA del 15% y total alineados en columnas.
 */
public class Lab1_E4_Carrión {
    public static void main(String[] args) {
        // Garantizar el uso del punto decimal
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        // Constante de IVA del 15%
        final double IVA = 0.15;
        
        // Entrada
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();
        
        // Proceso
        double subtotal = cantidad * precioUnitario;
        double montoIva = subtotal * IVA;
        double total = subtotal + montoIva;
        
        // Salida formateada
        System.out.println("\n--- FACTURA DE VENTA ---");
        System.out.println("Producto: " + producto);
        System.out.println("-----------------------------------");
        System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s%10.2f%n", "IVA 15%", montoIva);
        System.out.printf("%-25s%10.2f%n", "TOTAL", total);
        
        sc.close();
    }
}