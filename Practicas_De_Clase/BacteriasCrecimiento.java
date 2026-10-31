public class BacteriasCrecimiento {
    public static void main(String[] args) {
        long poblacion = 100;
        int horas = 0;
        long limite = 1000000;
        
        while (poblacion < limite) {
            poblacion *= 2; // Se duplica cada hora
            horas++;
            System.out.println("Hora " + horas + ": " + poblacion + " bacterias");
        }
        
        System.out.println("\nLa población supera 1,000,000 de bacterias en la hora: " + horas);
    }
}