import java.util.Locale;
import java.util.Scanner;

public class HoraSiguiente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("     CRONOMETRO: CALCULO DE HORA + 1s    ");
        System.out.println("=========================================");
        System.out.print("Ingrese horas (0-23): ");
        int h = lector.nextInt();

        System.out.print("Ingrese minutos (0-59): ");
        int m = lector.nextInt();

        System.out.print("Ingrese segundos (0-59): ");
        int s = lector.nextInt();

        System.out.print("Tiempo registrado: ");
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
        System.out.println("-----------------------------------------");

        // Validaciones individuales de rangos para cambiar completamente el flujo original
        if (h < 0 || h > 23) {
            System.out.println("[Error critico]: El rango de la hora debe estar entre 0 y 23.");
        } else {
            if (m < 0 || m > 59) {
                System.out.println("[Error critico]: El rango de los minutos debe estar entre 0 y 59.");
            } else {
                if (s < 0 || s > 59) {
                    System.out.println("[Error critico]: El rango de los segundos debe estar entre 0 y 59.");
                } else {
                    // Procesamiento de incremento de un segundo con una estructura diferente
                    s++;
                    
                    if (s > 59) {
                        s = 0;
                        m++;
                        if (m > 59) {
                            m = 0;
                            h++;
                            if (h > 23) {
                                h = 0;
                            }
                        }
                    }

                    System.out.print("Hora exacta un segundo despues: ");
                    System.out.printf("%02d:%02d:%02d\n", h, m, s);
                }
            }
        }
        System.out.println("=========================================");

        lector.close();
    }
}