import java.util.Locale;
import java.util.Scanner;

public class angulos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   MEDICION Y CLASIFICACION DE ANGULOS   ");
        System.out.println("=========================================");
        System.out.print("Ingrese los grados del angulo a evaluar: ");
        double medidaGrados = lector.nextDouble();

        // Reducción si supera los 360 grados
        if (medidaGrados > 360.0) {
            medidaGrados %= 360.0;
            System.out.printf("Depuracion: Angulo ajustado por exceso a %.2f grados\n", medidaGrados);
        }

        System.out.println("-----------------------------------------");

        // Estructura condicional con orden inverso (evaluando de mayor a menor)
        if (medidaGrados == 360.0) {
            System.out.println("Tipo geometrico: Completo");
        } else {
            if (medidaGrados > 180.0) {
                System.out.println("Tipo geometrico: Concavo o Reflejo");
            } else {
                if (medidaGrados == 180.0) {
                    System.out.println("Tipo geometrico: Llano");
                } else {
                    if (medidaGrados > 90.0) {
                        System.out.println("Tipo geometrico: Obtuso");
                    } else {
                        if (medidaGrados == 90.0) {
                            System.out.println("Tipo geometrico: Recto");
                        } else {
                            if (medidaGrados >= 0.0 && medidaGrados < 90.0) {
                                System.out.println("Tipo geometrico: Agudo");
                            } else {
                                System.out.println("[Error]: El valor ingresado no es valido.");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("=========================================");

        lector.close();
    }
}