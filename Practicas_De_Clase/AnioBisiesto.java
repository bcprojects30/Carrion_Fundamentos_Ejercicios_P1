import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anio = scanner.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        
        scanner.close();
    }
}