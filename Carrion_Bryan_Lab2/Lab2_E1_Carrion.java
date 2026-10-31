/**
 * Nombre completo: Bryan Alexis Carrión Padilla
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Imprimir la tabla de multiplicar del 1 al 10 en forma de matriz de 10x10 alineada.
 */
public class Lab2_E1_Carrion {
    public static void main(String[] args) {
        System.out.println("=== TABLA DE MULTIPLICAR DEL 1 AL 10 ===");
        
        // Ciclo externo para las filas
        for (int i = 1; i <= 10; i++) {
            // Ciclo interno para las columnas
            for (int j = 1; j <= 10; j++) {
                // Imprime cada producto con un ancho fijo de 4 espacios alineado a la derecha
                System.out.printf("%4d", i * j);
            }
            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}