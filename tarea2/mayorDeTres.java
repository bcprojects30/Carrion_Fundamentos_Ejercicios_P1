import java.util.Locale;
import java.util.Scanner;

public class mayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner lector = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("     ORDENAMIENTO DE TRES DIGITOS (DESC) ");
        System.out.println("=========================================");
        System.out.print("Ingrese el primer valor entero: ");
        int num1 = lector.nextInt();

        System.out.print("Ingrese el segundo valor entero: ");
        int num2 = lector.nextInt();

        System.out.print("Ingrese el tercer valor entero: ");
        int num3 = lector.nextInt();

        int nMayor = 0, nMedio = 0, nMenor = 0;

        // Estructura de ordenamiento distinta basada en evaluar primero si 'b' o 'c' mandan
        if (num1 >= num2 && num1 >= num3) {
            nMayor = num1;
            if (num3 >= num2) {
                nMedio = num3;
                nMenor = num2;
            } else {
                nMedio = num2;
                nMenor = num3;
            }
        } else {
            if (num2 >= num1 && num2 >= num3) {
                nMayor = num2;
                if (num3 >= num1) {
                    nMedio = num3;
                    nMenor = num1;
                } else {
                    nMedio = num1;
                    nMenor = num3;
                }
            } else {
                nMayor = num3;
                if (num2 >= num1) {
                    nMedio = num2;
                    nMenor = num1;
                } else {
                    nMedio = num1;
                    nMenor = num2;
                }
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("Secuencia descendente: " + nMayor + " -> " + nMedio + " -> " + nMenor);
        System.out.println("=========================================");

        lector.close();
    }
}