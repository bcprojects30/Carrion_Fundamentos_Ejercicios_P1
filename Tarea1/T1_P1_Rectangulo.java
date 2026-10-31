// Autor:Bryan Carrión
import java.util.Locale;
import java.util.Scanner;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
        sc.close();
    }
}