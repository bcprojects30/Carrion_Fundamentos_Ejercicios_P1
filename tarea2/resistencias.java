import java.util.Locale;
import java.util.Scanner;

public class resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

//Mostrar tema del ejercicioy pedir datos de entrada
        System.out.println("*** EJERCICIO 1: CALCULO DE RESISTENCIA EQUIVALENTE ***");
//pedir valores y asignarlos a variables
        System.out.print("Digite el valor de la resistencia A: ");
        double resUno = teclado.nextDouble();
        System.out.print("Digite el valor de la resistencia B: ");
        double resDos = teclado.nextDouble();
        System.out.print("Seleccione el tipo de circuito [S para serie / P para paralelo]: ");
        char modoConexion = teclado.next().charAt(0);

        double totalEq = 0.0;

        // Evaluar primero el tipo de conexión y luego se validan los rangos dentro de cada opción
        if (modoConexion == 'S' || modoConexion == 's') {
            if (resUno > 0 && resDos > 0) {
                totalEq = resUno + resDos;
                System.out.println("Detalle: Suma directa de componentes en serie.");
                System.out.println("El resultado equivalente es: " + totalEq);
            } else {
                System.out.println("Aviso: Las magnitudes resistivas deben ser mayores a cero.");
            }
        } else {
            if (modoConexion == 'P' || modoConexion == 'p') {
                if (resUno > 0 && resDos > 0) {
                    totalEq = (resUno * resDos) / (resUno + resDos);
                    System.out.println("Detalle: Producto sobre suma para componentes en paralelo.");
                    System.out.println("El resultado equivalente es: " + totalEq);
                } else {
                    System.out.println("Aviso: Las magnitudes resistivas deben ser mayores a cero.");
                }
            } else {
                System.out.println("Aviso: Opcion de conexion incorrecta. Utilice S o P.");
            }
        }

        teclado.close();
    }
}