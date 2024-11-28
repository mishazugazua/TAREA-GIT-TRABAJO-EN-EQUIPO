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
       //write your code
    }


    public static void registrarTarea(String titulo, String descripcion, String fechaVencimiento) {
        if (contador < MAX_TAREAS) {
            titulos[contador] = titulo;
            descripciones[contador] = descripcion;
            fechasVencimiento[contador] = fechaVencimiento;
            contador++;
            System.out.println("Tarea '" + titulo + "' registrada.");
        } else {
            System.out.println("No se pueden registrar más tareas. Límite alcanzado.");
        }
    }

    public static void listarTareas() {
        if (contador == 0) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("Título: " + titulos[i] + ", Descripción: " + descripciones[i] + ", Fecha de vencimiento: " + fechasVencimiento[i]);
            }
        }
    }


}