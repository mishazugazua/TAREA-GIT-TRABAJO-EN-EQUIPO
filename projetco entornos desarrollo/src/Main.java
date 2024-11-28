import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static final int MAX_TAREAS = 10;
    static String[] titulos = new String[MAX_TAREAS];
    static String[] descripciones = new String[MAX_TAREAS];
    static String[] fechasVencimiento = new String[MAX_TAREAS];
    static int contador = 0;


    public static void main(String[] args) throws IOException {
        //write your codee here
    }

    public static void actualizarTarea(String titulo, String nuevaDescripcion, String nuevaFechaVencimiento) {
        for (int i = 0; i < contador; i++) {
            if (titulos[i].equals(titulo)) {
                if (nuevaDescripcion != null) {
                    descripciones[i] = nuevaDescripcion;
                }
                if (nuevaFechaVencimiento != null) {
                    fechasVencimiento[i] = nuevaFechaVencimiento;
                }
                System.out.println("Tarea '" + titulo + "' actualizada.");
                return;
            }
        }
        System.out.println("Tarea '" + titulo + "' no encontrada.");
    }

    public static void eliminarTarea(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (titulos[i].equals(titulo)) {
                for (int j = i; j < contador - 1; j++) {
                    titulos[j] = titulos[j + 1];
                    descripciones[j] = descripciones[j + 1];
                    fechasVencimiento[j] = fechasVencimiento[j + 1];
                }
                titulos[contador - 1] = null;
                descripciones[contador - 1] = null;
                fechasVencimiento[contador - 1] = null;
                contador--;
                System.out.println("Tarea '" + titulo + "' eliminada.");
                return;
            }
        }
        System.out.println("Tarea '" + titulo + "' no encontrada.");
    }
}
