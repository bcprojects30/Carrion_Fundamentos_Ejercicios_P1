public class MultiplosDeSiete {
    public static void main(String[] args) {
        int cantidad = 0;
        
        System.out.println("Múltiplos de 7 entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                cantidad++;
            }
        }
        
        System.out.println("\n\nTotal de múltiplos de 7 encontrados: " + cantidad);
    }
}