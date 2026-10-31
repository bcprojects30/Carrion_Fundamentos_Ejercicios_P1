// Autor: Bryan Carrión
public class T1_P6_AsignacionCompuesta {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Inicio: x = " + x);
        
        x *= 3; // x = 12
        System.out.println("Despues de x *= 3: x = " + x);
        
        x %= 5; // 12 % 5 = 2 -> x = 2
        System.out.println("Despues de x %= 5: x = " + x);
        
        x += x++; // x = 2 + 2 (y luego x se incrementa a 3) -> x = 4
        System.out.println("Despues de x += x++: x = " + x);
    }
}