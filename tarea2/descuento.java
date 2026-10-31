import java.util.Locale;
import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        final double VALOR_SACO = 8.50;
        final double TASA_IVA = 0.15;

        System.out.println("=========================================");
        System.out.println("   FERRETERIA: FACTURACION DE CEMENTO");
        System.out.println("=========================================");
        System.out.print("Indique el numero de sacos requeridos: ");
        int numSacos = lector.nextInt();

        double tasaDescuento = 0.0;
        boolean ordenValido = true;

        // Cambiamos el orden de evaluación: validamos primero los rangos altos y bajamos
        if (numSacos > 50) {
            tasaDescuento = 0.10;
            System.out.println("Categoria de bonificacion: Descuento mayorista del 10%.");
        } else {
            if (numSacos >= 21 && numSacos <= 50) {
                tasaDescuento = 0.05;
                System.out.println("Categoria de bonificacion: Descuento frecuente del 5%.");
            } else {
                if (numSacos >= 1 && numSacos <= 20) {
                    tasaDescuento = 0.0;
                    System.out.println("Categoria de bonificacion: Precio regular sin rebaja.");
                } else {
                    ordenValido = false;
                    System.out.println("[Error]: La cantidad ingresada debe ser igual o mayor a 1.");
                }
            }
        }

        // Si la cantidad es válida, procedemos a calcular y mostrar la factura
        if (ordenValido) {
            double costoBruto = numSacos * VALOR_SACO;
            double ahorroMonto = costoBruto * tasaDescuento;
            double baseImponible = costoBruto - ahorroMonto;
            double montoImpuesto = baseImponible * TASA_IVA;
            double facturacionTotal = baseImponible + montoImpuesto;

            System.out.println("-----------------------------------------");
            System.out.printf("Costo unitario por saco: $%.2f\n", VALOR_SACO);
            System.out.printf("Acumulado bruto (sin rebaja): $%.2f\n", costoBruto);
            System.out.printf("Descuento aplicado: $%.2f\n", ahorroMonto);
            System.out.printf("Subtotal neto: $%.2f\n", baseImponible);
            System.out.printf("Impuesto IVA (15%%): $%.2f\n", montoImpuesto);
            System.out.println("-----------------------------------------");
            System.out.printf("VALOR FINAL A CANJEAR: $%.2f\n", facturacionTotal);
            System.out.println("=========================================");
        }

        lector.close();
    }
}