/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 28 de octubre de 2026
 * Enunciado: Verificación de evaluación de expresiones en Java.
 */
public class Lab1_E5_Carrión {
    public static void main(String[] args) {
        // Expresión 1
        int a = 9, b = 4;
        int exp1 = a / b + a % b * 2;
        System.out.println("Expresión 1: " + exp1);

        // Expresión 2
        boolean exp2 = 3 > 23 && 5 % 2 == 1;
        System.out.println("Expresión 2: " + exp2);

        // Expresión 3
        double exp3 = (double) 7 / 2 + 7 / 2;
        System.out.println("Expresión 3: " + exp3);

        // Expresión 4
        boolean exp4 = !(4 == 4) || 2 + 3 != 6;
        System.out.println("Expresión 4: " + exp4);
    }
}